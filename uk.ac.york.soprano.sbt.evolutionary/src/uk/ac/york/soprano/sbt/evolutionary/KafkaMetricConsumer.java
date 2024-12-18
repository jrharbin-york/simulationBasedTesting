package uk.ac.york.soprano.sbt.evolutionary;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.TopicPartition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

import uk.ac.york.soprano.sbt.architecture.data.MetricMessage;
import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.TestCampaign;

public class KafkaMetricConsumer extends MetricConsumerBase {

	private static final Logger logger = LoggerFactory.getLogger(KafkaMetricConsumer.class);
	
	private String clientId;
	private KafkaConsumer<Long, MetricMessage> consumer;
	private List<TopicPartition> partitions;
	private String METRIC_TOPIC_NAME = "metricMessages";
	private AtomicBoolean closed = new AtomicBoolean();
	private CountDownLatch shutdownlatch = new CountDownLatch(1);
	
	public KafkaMetricConsumer(TestCampaign selectedCampaign, Properties configs, List<TopicPartition> partitions) throws InvalidTestCampaign {
		super(selectedCampaign);
		this.clientId = configs.getProperty(ConsumerConfig.CLIENT_ID_CONFIG);
		this.partitions = partitions;
		this.consumer = new KafkaConsumer<>(configs);
		if (selectedCampaign == null) {
			throw new InvalidTestCampaign(InvalidTestCampaign.INVALIDITY_REASON.NULL_OBJECT);
		}

		List<String> topics = new ArrayList<String>();
		topics.add(METRIC_TOPIC_NAME);
		consumer.subscribe(topics);
	}
	
	@Override
	public void run() {
		try {
			logger.info("Starting the Consumer : {}", clientId);
			logger.info("C : {}, Started to process records for partitions : {}", clientId, partitions);

			while (!closed.get()) {
				ConsumerRecords<Long, MetricMessage> records = consumer.poll(Duration.ofMillis(1000));

				if (records.isEmpty()) {
					logger.info("C : {}, Found no records", clientId);
					continue;
				}

				logger.info("C : {} Total No. of records received : {}", clientId, records.count());
				for (ConsumerRecord<Long, MetricMessage> record : records) {
					logger.info("C : {}, Record received topic : {}, partition : {}, key : {}, value : {}, offset : {}",
							clientId, record.topic(), record.partition(), record.key(), record.value(),
							record.offset());

					MetricMessage msg = record.value();
					updateTimestamp(msg.getTimestamp());
					String metricID = msg.getMetricName();
					Double val = (Double) msg.getValue();
					
					if (!metricID.contains("time")) {
						System.out.println(record.value());
						System.out.println("msg = " + msg.toString());
						System.out.println("MetricConsumer received metric: " + metricID + " - value " + val);
					} else {
						System.out.print("T");
					}

					storeArrivingMessage(msg);
				}
			}
		} catch (Exception e) {
			System.out.println("Error while consuming messages");
			e.printStackTrace();
			logger.error("Error while consuming messages", e);
		} finally {
			consumer.close();
			shutdownlatch.countDown();
			logger.info("C : {}, consumer exited", clientId);
		}
	}
	
	@Override
	public void clearTopic() {
		// This is redundant as Kafka topics are cleared via script 
		List<String> topics = new ArrayList<String>();
		topics.add(METRIC_TOPIC_NAME);
		topics.get(0);
	}

	@Override
	public void close() {
		try {
			closed.set(true);
			shutdownlatch.await();
		} catch (InterruptedException e) {
			logger.error("Error", e);
		}
	}
}
