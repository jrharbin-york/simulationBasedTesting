package uk.ac.york.soprano.sbt.architecture.metrics.flink;

import org.apache.flink.streaming.api.functions.source.RichParallelSourceFunction;

import uk.ac.york.soprano.sbt.architecture.data.ControlMessage;
import uk.ac.york.soprano.sbt.architecture.data.ControlMessage.CONTROL_COMMAND;
import uk.ac.york.soprano.sbt.architecture.simulator.SimCore;

public class TriggeredControlProducer extends RichParallelSourceFunction<ControlMessage> {

	private static final long serialVersionUID = 1L;
	private static double TRIGGER_TIME = 0;
	private static final long SLEEP_TIME_MS = 100;
	
	public TriggeredControlProducer(double triggerTime) {
		TRIGGER_TIME = triggerTime;
	}

	@Override
	public void run(SourceContext<ControlMessage> ctx) throws Exception {
		// No need to cancel
		boolean running = true;
		while (running) {
			
			double time = SimCore.getInstance().getTime();
			if (time > TRIGGER_TIME) {
				CONTROL_COMMAND cmd = ControlMessage.CONTROL_COMMAND.END_SIMULATION;
				// 	Other control commands here - need to set up in commandToString
				ControlMessage cMsg = new ControlMessage(cmd);
				ctx.collect(cMsg);
			}			
			Thread.sleep(SLEEP_TIME_MS);
		}
	}

	@Override
	public void cancel() {

	}

}
