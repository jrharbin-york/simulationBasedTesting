package uk.ac.york.soprano.sbt.architecture.data;

public class Interval {
	private final double timeStart;
	private final double timeEnd;
	
	public class InvalidInterval extends RuntimeException {
		
		public InvalidInterval(double fuzzingStartTime, double fuzzingEndTime) {
			// TODO Auto-generated constructor stub
		}

		private static final long serialVersionUID = 1L;
	}
	
	public Interval(double fuzzingStartTime, double fuzzingEndTime) throws InvalidInterval {
		this.timeStart = fuzzingStartTime;
		this.timeEnd = fuzzingEndTime;
		if (timeEnd < timeStart) {
			throw new InvalidInterval(fuzzingStartTime, fuzzingEndTime);
		}
	}
	
	public double getLength() {
		return timeEnd - timeStart;
	}
	
	public double getMidpoint() {
		return 0.5*(timeStart + timeEnd);
	}
	
	public double getStart() {
		return timeStart;
	}
	public double getEnd() {
		return timeEnd;
	}
}
