package uk.ac.york.soprano.sbt.architecture.metrics.flink;

import java.util.Random;
import org.apache.flink.configuration.Configuration;

public class TestMetricSend {
	public static void main(String[] args) {
		String num = args[0];
		String PYRO_WORKER_LOOKUP_NAME = "SOPRANOWorkerDaemon_192_168_1_238";
		String TESTNAME = "fakeTest_" + num;
		String PYRO_NS_HOSTNAME = "192.168.1.238";
		int PYRO_NS_PORT = 9523;
		System.out.println("PYRO_WORKER_LOOKUP_NAME = " + PYRO_WORKER_LOOKUP_NAME);

		Random rng = new Random();
		PyroMetricFlinkSink pyroMetricFlinkSink = new PyroMetricFlinkSink(TESTNAME, PYRO_NS_HOSTNAME, PYRO_NS_PORT,
				PYRO_WORKER_LOOKUP_NAME);
		Configuration params = new Configuration();

		try {
			pyroMetricFlinkSink.open(params);

			for (double time = 0; time < 1.0; time += 0.1) {
				double value = rng.nextDouble();
				pyroMetricFlinkSink.__test_sendMetricMessage("testMetric", value, time);
				Thread.sleep(100);
			}

			System.out.println("Done");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
