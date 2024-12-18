package uk.ac.york.soprano.sbt.evolutionary.test;

import uk.ac.york.soprano.sbt.evolutionary.utilities.TestRunnerUtils;

public class TestWaiting {
	public static void main(String [] args) {
		System.out.print("Waiting...");
		System.out.flush();
		TestRunnerUtils.waitForSeconds(10);
		System.out.println("done");
	}
}
