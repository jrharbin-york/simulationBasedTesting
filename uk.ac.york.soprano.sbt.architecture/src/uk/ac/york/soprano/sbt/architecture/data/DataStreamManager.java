package uk.ac.york.soprano.sbt.architecture.data;

import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.time.Instant;
import java.util.Collections;
import java.util.HashMap;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.LongDeserializer;
import org.apache.kafka.common.serialization.LongSerializer;

import uk.ac.york.soprano.sbt.architecture.simulator.SimCore;

public class DataStreamManager {
	
	private long POLL_TIMEOUT = 100;
	private long POLL_TIMEOUT_EARLY = 300;
	private static final double TIME_EARLY_THRESHOLD = 1.0;
	
	//private final long POLL_TIMEOUT = 0;
	// Zero will return immediately if there are no pending records available, allowing us to go onto the
	// next step:
	// https://kafka.apache.org/24/javadoc/org/apache/kafka/clients/consumer/KafkaConsumer.html

	private static final DataStreamManager INSTANCE = new DataStreamManager();
	
	private static KafkaProducer<Long, EventMessage> kafkaProducer;
	private static KafkaConsumer<Long, EventMessage> kafkaConsumer;
	private static HashMap<String, KafkaConsumer<Long, EventMessage>> consumers;
	Properties props = new Properties();

	public static KafkaProducer<Long, EventMessage> getKafkaProducer() {
		return kafkaProducer;
	}

	public static KafkaConsumer<Long, EventMessage> getKafkaConsumer() {
		return kafkaConsumer;
	}

	private DataStreamManager() {
		String propFileName = "config.properties";
		InputStream propsInputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
		if (propsInputStream != null) {
			try {
				props.load(propsInputStream);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		this.kafkaProducer = createProducer();
		consumers = new HashMap<String, KafkaConsumer<Long, EventMessage>>();
	}

	public static DataStreamManager getInstance() {
		return INSTANCE;
	}

	private KafkaProducer<Long, EventMessage> createProducer() {
		Properties kafkaProps = new Properties();
		kafkaProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, props.getProperty("kafka.producer.bootstrap.servers"));
		kafkaProps.put(ProducerConfig.CLIENT_ID_CONFIG, "KafkaProducer");
		kafkaProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, LongSerializer.class.getName());
		kafkaProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, EventMessage.class.getName());
		return new KafkaProducer<>(kafkaProps);
	}

	private KafkaConsumer<Long, EventMessage> createConsumer(String kafkaTopic) {
		Properties kafkaProps = new Properties();
		kafkaProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, props.getProperty("kafka.consumer.bootstrap.servers"));
		kafkaProps.put(ConsumerConfig.GROUP_ID_CONFIG, "KafkaConsumer");
		kafkaProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, LongDeserializer.class.getName());
		kafkaProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, EventMessage.class.getName());
		KafkaConsumer<Long, EventMessage> consumer = new KafkaConsumer<>(kafkaProps);
		consumer.subscribe(Collections.singletonList(kafkaTopic));
		return consumer;
	}

	public void publish(String topicName, EventMessage eventMessage) {
		String kafkaTopic = topicName.replace("/", ".").replace("[", "");
//		KafkaProducer<Long, EventMessage> kafkaProducer = DataStreamManager.getInstance().getKafkaProducer();
		eventMessage.setId(UUID.randomUUID().toString());
		
		// JRH: only replace the event timestamp if they have not
		// been set by simulator low-level timestamps
		if (eventMessage.timestamp == 0) {
			Instant instant = Instant.now();
			long timeStampMillis = instant.toEpochMilli();
			eventMessage.setTimestamp(timeStampMillis);
		}
		
		// Ensure the IN_walltime is set
		eventMessage.setIN_walltime_from_current();
		
		ProducerRecord<Long, EventMessage> record = new ProducerRecord<Long, EventMessage>(kafkaTopic, 1L,
				eventMessage);
		try {
			RecordMetadata metadata = DataStreamManager.getInstance().getKafkaProducer().send(record).get();
			System.out.println(metadata.toString());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

	public ConsumerRecords<Long, EventMessage> consume(String topicName) {
		String kafkaTopic = topicName;
		if (topicName.contains("/")) {
			kafkaTopic = topicName.replace("/", ".").replace("[", "");
		}
		KafkaConsumer<Long, EventMessage> consumer;
		if (consumers.containsKey(kafkaTopic)) {
			consumer = consumers.get(kafkaTopic);
		} else {
			consumer = DataStreamManager.getInstance().createConsumer(kafkaTopic);
			consumers.put(kafkaTopic, consumer);
		}
		consumer.subscribe(Collections.singletonList(kafkaTopic));
		long duration = POLL_TIMEOUT;
		if (SimCore.getInstance().getTime() < TIME_EARLY_THRESHOLD) {
			duration = POLL_TIMEOUT_EARLY;
		}
		final ConsumerRecords<Long, EventMessage> consumerRecords = consumer.poll(Duration.ofMillis(duration));
		return consumerRecords;
	}
}
