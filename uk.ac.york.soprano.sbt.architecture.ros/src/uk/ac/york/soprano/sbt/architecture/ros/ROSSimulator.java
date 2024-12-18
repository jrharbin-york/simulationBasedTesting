package uk.ac.york.soprano.sbt.architecture.ros;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import edu.wpi.rail.jrosbridge.JRosbridge.WebSocketType;
import edu.wpi.rail.jrosbridge.Ros;
import edu.wpi.rail.jrosbridge.Topic;
import edu.wpi.rail.jrosbridge.callback.TopicCallback;
import edu.wpi.rail.jrosbridge.messages.Message;
import uk.ac.york.soprano.sbt.architecture.config.ConnectionProperties;
import uk.ac.york.soprano.sbt.architecture.data.DataStreamManager;
import uk.ac.york.soprano.sbt.architecture.data.EventMessage;
import uk.ac.york.soprano.sbt.architecture.simulator.ICommandInvoker;
import uk.ac.york.soprano.sbt.architecture.simulator.IPropertyGetter;
import uk.ac.york.soprano.sbt.architecture.simulator.IPropertySetter;
import uk.ac.york.soprano.sbt.architecture.simulator.ISimulator;
import uk.ac.york.soprano.sbt.architecture.simulator.SimCore;
import uk.ac.york.soprano.sbt.architecture.simulator.SubscriptionFailure;
import uk.ac.york.soprano.sbt.architecture.utilities.ExptHelper;

public class ROSSimulator implements ISimulator {

	protected static final boolean USE_FRACTIONAL_TIME = true;

	private static final long DEFAULT_EXTRAS_WAIT_DELAY_MS = 10000;

	protected static final boolean DEBUG_TIME = true;

	private boolean DEBUG_DISPLAY_INBOUND_MESSAGES = true;
	
	// TODO: ROS version should be set in the DSL
	// This governs e.g. how the parameters are set
	private int ROS_MAJOR_VERSION = 2;
	
	static Ros ros;
	static DataStreamManager dsm = DataStreamManager.getInstance();
	// FIXME: Maybe this needs to be part of the architecture
	HashMap<String,Topic> createdTopics = new HashMap<String,Topic>();
	
	@Override
	public List<String> getTopics() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void debugEnsureDisplayMessages() {
		DEBUG_DISPLAY_INBOUND_MESSAGES = true;
	}

	@Override
	public Object createTopic(String topicName, String topicType) {
		Topic topic = new Topic(ros, topicName, topicType);
		createdTopics.put(topicName,topic);
		System.out.println(topic);
		return topic;
	}

	@Override
	public Object connect(ConnectionProperties params) {
		String host = params.getProperties().get(params.HOSTNAME).toString();
		int port = Integer.parseInt(params.getProperties().get(params.PORT).toString());
		Ros rosConnection = new Ros(host, port, WebSocketType.ws);
		rosConnection.connect();
		this.ros = rosConnection;
		return rosConnection; 
	}

	@Override
	public IPropertyGetter getPropertyGetter(Properties properties) {
		// TODO Get componentName and paramName
		String componentName = properties.getProperty("componentName");
		String paramName = properties.getProperty("paramName");
		return new ROS2ParameterGetter(componentName, paramName, ros);
	}

	@Override
	public IPropertySetter getPropertySetter(Properties properties) {
		// TODO Get componentName and paramName
		String componentName = properties.getProperty("componentName");
		String paramName = properties.getProperty("paramName");
		return new ROS2ParameterSetter(componentName, paramName, ros);
	}

	@Override
	public ICommandInvoker getICommandInvoker() {
		// TODO Auto-generated method stub
		return null;
	}
	
//	/** Test code for setting the dynamically reconfigurable parameters in ROS 
//	 * This only works for ROS1, need to verify if it is ROS2 or not? **/
//	
//	public void __testSetIntDynamicParameterROS1(String componentName, String paramName, int paramVal) {
//		String srvName = componentName + "/set_parameters";
//		String srvType = "dynamic_reconfigure/Reconfigure";
//		Service srv = new Service(this.ros, srvName, srvType);
//		String intAdjustment = "{\"name\": \""+ paramName + "\", \"value\": " + String.valueOf(paramVal) + "}";
//		String content = "{\"config\": { \"bools\": ["+"], \"ints\": [" + intAdjustment + "], \"strs\": ["+"], \"doubles\": ["+"], \"groups\": ["+"]}}}";
//		System.out.println(content);
//		ServiceRequest rq = new ServiceRequest(content);
//		srv.callService(rq, new ROSSetParamServiceCallback(paramName, paramVal));
//	}
//	
//	/** Test code for setting the dynamically reconfigurable parameters in ROS 
//	 * This only works for ROS1, need to verify if it is ROS2 or not? **/
//	
//	public void __testSetIntDynamicParameterROS2(String componentName, String paramName, int paramVal) {
//		String srvName = componentName + "/set_parameters";
//		String srvType = "rcl_interfaces/srv/SetParameters";
//		Service srv = new Service(this.ros, srvName, srvType);
//	
//		int paramTypeNum = 2;
//		String paramStr = "{\"name\" : \"" + paramName + "\", \"value\" : { \"type\": " + Integer.toString(paramTypeNum) + ", \"integer_value\" : " + Integer.toString(paramVal) + "}}";
//		String paramSRVContent = "{\"parameters\": [" + paramStr + "]}";
//		System.out.println(paramSRVContent);
//		ServiceRequest rq = new ServiceRequest(paramSRVContent);
//		srv.callService(rq, new ROSSetParamServiceCallback(paramName, paramVal));
//	}
	
	public void runExtraScriptIfExists(String workingDir, String testID, long extrasWaitdelayMsec) {
		String extrasFile = "start-extras.sh";
		String extrasPath = workingDir + "/" + extrasFile;
		
		if ((new File(extrasPath)).exists()) {
			String cmd = "cd " + workingDir + " && ./start-extras.sh " + testID;
			ExptHelper.runScriptNewThread(workingDir, cmd);
			
			// Need to wait the delay after the EDDI launched
			try {
				Thread.sleep(extrasWaitdelayMsec);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		} else {
			System.out.println("Could not find extras script at " + extrasPath + ":ignoring");
		}
	}

	@Override
	public void run(HashMap<String, String> params) {
		String launchFilePath = params.get("launchPath");
		Path launchFileP = Paths.get(launchFilePath);
		Path containingDir = launchFileP.getParent();
		
		long extrasWaitdelayMsec = DEFAULT_EXTRAS_WAIT_DELAY_MS;
		
		String workingDir = containingDir.toString();
		String testID = params.get("testID");
		
		System.out.println("workingDir = " + workingDir + ",launchFilePath = " + launchFilePath);
		String runCmd = launchFilePath + " " + testID;
		ExptHelper.runScriptNewThread(workingDir, runCmd);
		
		// Override extras delay parameter if supplied
		if (params.containsKey("extrasWaitdelayMsec")) {
			extrasWaitdelayMsec = Long.parseLong(params.get("extrasWaitdelayMsec"));
		}
		
		// Now launch the EDDI or other extras after
		runExtraScriptIfExists(workingDir, testID, extrasWaitdelayMsec);
	}

	@Override
	public HashMap<String,?> getCreatedTopicsByTopicName() {
		return createdTopics;
	}
	
	/** If the topic name ends in IN, then remove the IN. 
	 * Otherwise, append OUT to the topic name **/
	public String translateTopicNameForOutput(String origTopicName) {
		String subsTopicName = origTopicName.replace(".", "/");
		if (subsTopicName.endsWith("IN")) {
			return (subsTopicName.substring(0, subsTopicName.length() - 2));
		} else {
			return subsTopicName + "OUT";
		}
	}
	
	/*
	 * This is for ROS Topics
	 */
	@Override
	public synchronized void consumeFromTopic(String topicName, String topicType, Boolean publishToKafka, String kafkaTopic, boolean shouldFuzz) throws SubscriptionFailure {
		System.out.println("TopicName: " + topicName);

		Topic topic;
		if (createdTopics.containsKey(topicName)) {
			topic = createdTopics.get(topicName);
		} else {
			topic = (Topic)createTopic(topicName, topicType);
		}
		
		try {
		
		// shouldFuzz is ignored for ROS interface
		topic.subscribe(new TopicCallback() {
			@Override
			public void handleMessage(Message message) {
				if (DEBUG_DISPLAY_INBOUND_MESSAGES) {
					System.out.println("message: " + message);
				}
				EventMessage em = new EventMessage();
				em.setValue(message.toString());
				em.setType(topicType);
				em.setTopic(topicName);
				if(publishToKafka) {
					if (DEBUG_DISPLAY_INBOUND_MESSAGES) {
						System.out.println(em);
					}

					dsm.publish(kafkaTopic, em);
				}
			}
		});
		} catch (NullPointerException e) {
			System.out.println("ROS subscription failed - exiting middleware");
			throw new SubscriptionFailure();
		}
	}
	
	public void consumeFromTopic(String topicName, String topicType, Boolean publishToKafka, String kafkaTopic) throws SubscriptionFailure {
		consumeFromTopic(topicName, topicType, publishToKafka, kafkaTopic, false);
	}
	
	/*
	 * This is for ROS Topics
	 */
	@Override
	public void publishToTopic(String topicName, String topicType, String message) {
		Topic topic;
		System.out.println(topicName);
		if (createdTopics.containsKey(topicName)) {
			topic = createdTopics.get(topicName);
		} else { 
			System.out.println("Hi");
			topic = (Topic) createTopic(topicName, topicType);
		}
		Message toSend = new Message(message);
		topic.publish(toSend);
		
	}

	@Override
	public void disconnect() {
		ros.disconnect();	
	}

	private void ROS1TimeSubscribe(Topic topic) throws SubscriptionFailure {
		try {
		topic.subscribe(new TopicCallback() {
			@Override
			public void handleMessage(Message message) {
				//System.out.println("Time message = " + message.toString());
				String timeMsg = message.toString();
				String secondsStr = timeMsg.split("secs\":")[1].split(",")[0];
				Double time = Double.parseDouble(secondsStr);
				if (USE_FRACTIONAL_TIME) {
					String nsecondsStr = timeMsg.split("nsecs\":")[1].split("}")[0];
					time = time + (Double.parseDouble(nsecondsStr) / 1e9);
				}
				//System.out.println("time = " + time);
				SimCore.getInstance().setTime(time);
			}
		});
		} catch (NullPointerException e) {
			System.out.println("ROS subscription failed - exiting middleware");
			throw new SubscriptionFailure();
		}
	}
	
	private void ROS2TimeSubscribe(Topic topic) throws SubscriptionFailure {
		System.out.println("Subscribing to ROS2 time");
		try {
		topic.subscribe(new TopicCallback() {
			@Override
			public void handleMessage(Message message) {
				//System.out.println("Time message = " + message.toString());
				String timeMsg = message.toString();
				String secondsStr = timeMsg.split("sec\":")[1].split(",")[0];
				Double time = Double.parseDouble(secondsStr);
				if (USE_FRACTIONAL_TIME) {
					String nsecondsStr = timeMsg.split("nanosec\":")[1].split("}")[0];
					time =  time + (Double.parseDouble(nsecondsStr) / 1e9);
					if (DEBUG_TIME) {
						System.out.println("ROS2 time = " + time + " nanosecs=" + nsecondsStr + ",seconds = " + secondsStr);
					}
				}
				SimCore.getInstance().setTime(time);
			}
		});
		} catch (NullPointerException e) {
			System.out.println("ROS subscription failed - exiting middleware");
			throw new SubscriptionFailure();
		}
	}
	
	@Override
	public void updateTime() throws SubscriptionFailure {
		String clockType;
		if (ROS_MAJOR_VERSION == 2) {
			clockType = "rosgraph_msgs/msgs/Clock";
		} else {
			// Fallback to ROS1
			clockType = "rosgraph_msgs/Clock";
		}
		
		Topic topic = (Topic) createTopic("/clock", clockType);
		if (ROS_MAJOR_VERSION == 2) {
			ROS2TimeSubscribe(topic);
		} else {
			ROS1TimeSubscribe(topic);
		}
	}

	public boolean stepSimulator() {
		return true;	
	}
}    