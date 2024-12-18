package uk.ac.york.soprano.sbt.architecture.simulator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import uk.ac.york.soprano.sbt.architecture.data.TimeInterval;
import uk.ac.york.soprano.sbt.architecture.data.TimeInterval.InvalidTimingPair;

public final class SimCore {
	
    private static SimCore INSTANCE;
    
    private String testName;
    
    private ISimulator simInterface;
    
    private ConcurrentHashMap<String, IPropertySetter> propertySetters = new ConcurrentHashMap<String,IPropertySetter>();
    
    // This records any outstanding start times - cleared when the operation ends
    private ConcurrentHashMap<String, Double> fuzzingStartTimes = new ConcurrentHashMap<String,Double>();
    
    // This records the record of all start and end times per operations    	
    private ConcurrentHashMap<String, List<TimeInterval>> fuzzingTimingHistory = new ConcurrentHashMap<String,List<TimeInterval>>();
    
    private Map<String, Optional<DeferredAction>> actionsOnSend = new HashMap<String,Optional<DeferredAction>>();
    
    private double totalFuzzingSecondCount;
    private FileWriter outputTimingLog;
    
    double time = 0.0;
	
    private SimCore() {}
    
    public static SimCore getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SimCore();
        }
        
        return INSTANCE;
    }
    
    public void setSimulatorInterface(ISimulator sim) {
    	this.simInterface = sim;
    }
    
    public void registerPropertySetter(String fuzzOpID, Properties properties) {
    	if (!propertySetters.containsKey(fuzzOpID)) {
    		IPropertySetter propSetter = this.simInterface.getPropertySetter(properties);
    		propertySetters.put(fuzzOpID, propSetter);
    	}
    }
    
    public IPropertySetter getPropertySetter(String fuzzOpID) throws MissingPropertySetter {
    	if (propertySetters.containsKey(fuzzOpID)) {
        	return propertySetters.get(fuzzOpID);
    	} else {
    		throw new MissingPropertySetter(fuzzOpID);
    	}
    }
    
    public void setTestName(String testName) {
    	this.testName = testName;
    	try {
			outputTimingLog = new FileWriter("/tmp/simCoreLog-" + this.testName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}
	
	private void outputTimingLog(String s) {
		try {
			if (outputTimingLog != null) {
				outputTimingLog.write(s);
				outputTimingLog.flush();
			}
			System.out.println(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public synchronized void registerFuzzingStart(String fuzzUniqueID) {
		// Using the simCore time rather than the Flink time
		double timeStart = time;
		fuzzingStartTimes.put(fuzzUniqueID, timeStart);
		
		outputTimingLog(timeStart + " : Fuzzing operation " + fuzzUniqueID + " STARTED dynamic timing\n");
	}
	
	public synchronized void registerFuzzingEnd(String fuzzUniqueID) {
		// Using the simCore time rather than the Flink time
		double timeEnd = time;
		double fuzzingStart = fuzzingStartTimes.get(fuzzUniqueID);
		double timeLength = timeEnd - fuzzingStart;
		totalFuzzingSecondCount += timeLength;
		fuzzingStartTimes.remove(fuzzUniqueID);
		try {
			addTimeRecord(fuzzUniqueID, fuzzingStart, timeEnd);
		} catch (InvalidTimingPair e1) {
			e1.printStackTrace();
		}
				
		outputTimingLog(timeEnd + " : Fuzzing operation " + fuzzUniqueID + " ENDED dynamic timing\n");
	}
	
	private void addTimeRecord(String fuzzUniqueID, double fuzzingStartTime, double fuzzingEndTime) throws InvalidTimingPair {
		if (!fuzzingTimingHistory.contains(fuzzUniqueID)) {
			fuzzingTimingHistory.put(fuzzUniqueID, new ArrayList<TimeInterval>());
		}
		
		List<TimeInterval> timings = fuzzingTimingHistory.get(fuzzUniqueID);
		timings.add(new TimeInterval(fuzzingStartTime, fuzzingEndTime));
		
	}

	public synchronized void finaliseFuzzingTimes() {
		// Using the SimCore time rather than the Flink time
		Set<String> toProcess = new HashSet<String>(fuzzingStartTimes.keySet());
		for (String key : toProcess) {
			registerFuzzingEnd(key);
		}
		try {
			if (outputTimingLog != null) {
				outputTimingLog.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized ConcurrentHashMap<String, List<TimeInterval>> getTimingRecords() {
		return fuzzingTimingHistory;
	}

	public double getTotalFuzzingSeconds() {
		return totalFuzzingSecondCount;
	}

	public synchronized void processDeferredActions() {
		System.out.println("PARAM: Checking deferred actions...");
		for (Entry<String, Optional<DeferredAction>> e : actionsOnSend.entrySet()) {
			String key = e.getKey();
			Optional<DeferredAction> da_o = e.getValue();
			if (da_o.isPresent()) {
				DeferredAction da = da_o.get(); 
				System.out.println("PARAM: Performing deferred action for key " + key + da.toString());
				da.doAction();
				// Ensure the value is cleared to prevent repeat
				// However the key must be left to ensure it doesn't get registered again
				e.setValue(Optional.empty());
				System.out.println("PARAM: Clearing deferred action for key " + key);
			}
		}
	}	
	
	public synchronized void addDeferredAction(String uniqueID, DeferredAction da) {
		if (!actionsOnSend.containsKey(uniqueID)) {
			System.out.println("PARAM: Adding deferred action: " + da.toString());
			actionsOnSend.put(uniqueID, Optional.of(da));
		} else {
			System.out.println("PARAM: Duplicate deferred action register rejected: " + da.toString());
		}
	}
	
	public boolean hasDeferredAction(String uniqueID) {
		return actionsOnSend.containsKey(uniqueID);
	}
}
