package uk.ac.york.soprano.sbt.architecture.data;

public class TimeInterval {
	private final double timeStart;
	private final double timeEnd;
	
	public class InvalidTimingPair extends RuntimeException {
		
		public InvalidTimingPair(double fuzzingStartTime, double fuzzingEndTime) {
			// TODO Auto-generated constructor stub
		}

		private static final long serialVersionUID = 1L;
	}
	
	public TimeInterval(double fuzzingStartTime, double fuzzingEndTime) throws InvalidTimingPair {
		this.timeStart = fuzzingStartTime;
		this.timeEnd = fuzzingEndTime;
		if (timeEnd < timeStart) {
			throw new InvalidTimingPair(fuzzingStartTime, fuzzingEndTime);
		}
	}
	
	public double getLength() {
		return timeEnd - timeStart;
	}
	
	public double getMidpoint() {
		return 0.5*(timeStart + timeEnd);
	}
	
	public double getStartTime() {
		return timeStart;
	}
	public double getEndTime() {
		return timeEnd;
	}

	public TimeInterval normaliseToRange(TimeInterval tTemplate) {
		double tsr = (timeStart - tTemplate.timeStart) / (tTemplate.timeEnd - tTemplate.timeStart);
		double ter = (timeEnd - tTemplate.timeStart) / (tTemplate.timeEnd - tTemplate.timeStart);
		return new TimeInterval(tsr,ter);
		
	}
}
