package uk.ac.york.soprano.sbt.evolutionary;

public class InvalidTestCampaign extends Exception {
	private static final long serialVersionUID = 1L;
	private String campaignName;
	private INVALIDITY_REASON reason;
	
	public static enum INVALIDITY_REASON {
		NULL_OBJECT,
		NAME_NOT_IN_MODEL
	}

	public InvalidTestCampaign(String campaignName) {
		this.campaignName = campaignName;
		this.reason = INVALIDITY_REASON.NAME_NOT_IN_MODEL;
	}
	
	public InvalidTestCampaign() {
		this.campaignName = "<NULL>";
		this.reason = INVALIDITY_REASON.NULL_OBJECT;
	}
	
	public InvalidTestCampaign(INVALIDITY_REASON r) {
		this.reason = r;
		this.campaignName = "";
	}
}
