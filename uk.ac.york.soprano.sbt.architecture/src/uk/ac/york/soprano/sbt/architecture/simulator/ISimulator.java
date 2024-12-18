package uk.ac.york.soprano.sbt.architecture.simulator;

import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import uk.ac.york.soprano.sbt.architecture.config.ConnectionProperties;

public interface ISimulator {
	public List<String> getTopics();
	
	public String translateTopicNameForOutput(String origTopicName);
	
	public void consumeFromTopic(String topicName, String topicType, Boolean publishToKafka, String kafkaTopic) throws SubscriptionFailure;
	public void consumeFromTopic(String topicName, String topicType, Boolean publishToKafka, String kafkaTopic, boolean forFuzzing) throws SubscriptionFailure;
	
	public boolean stepSimulator();
	
	public void publishToTopic(String topicName, String topicType, String message);
	public HashMap<String,?> getCreatedTopicsByTopicName();
	public Object createTopic(String topicName, String topicType);
	public Object connect(ConnectionProperties params);
	public void disconnect();
	public IPropertyGetter getPropertyGetter(Properties properties);
	public IPropertySetter getPropertySetter(Properties properties);
	public ICommandInvoker getICommandInvoker();
	public void run(HashMap<String, String> params);
	public void updateTime() throws SubscriptionFailure;
}