package uk.ac.york.soprano.sbt.evolutionary.predictors.test;

import java.util.Random;
import java.io.File;
import java.io.IOException;

import tech.tablesaw.api.DoubleColumn;
import tech.tablesaw.api.Table;

public class TestTimeSeries {
	public static void main(String [] args) {
		int count = 10;
		DoubleColumn dc = DoubleColumn.create("TESTING", count);
		DoubleColumn dc2 = DoubleColumn.create("TESTING2", count);
		Table timeSeries = Table.create("TIMECONVERSION");
		Random rng = new Random();
		
		timeSeries.addColumns(dc);
		timeSeries.addColumns(dc2);
			
		
		for (int i = 0; i < count; i++) {
			dc.set(i, rng.nextDouble());
			dc2.set(i, 3 * rng.nextDouble());
		}
		System.out.println(timeSeries.print());
		
		try {
			timeSeries.write().csv(new File("/tmp/test.csv"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
