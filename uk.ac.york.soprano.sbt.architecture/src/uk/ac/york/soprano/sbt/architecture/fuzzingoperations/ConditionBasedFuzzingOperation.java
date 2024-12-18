package uk.ac.york.soprano.sbt.architecture.fuzzingoperations;

import java.io.IOException;

import uk.ac.york.soprano.sbt.architecture.simulator.SimCore;

public abstract class ConditionBasedFuzzingOperation extends ConditionBasedGeneral {
	private static final long serialVersionUID = 1L;

	public ConditionBasedFuzzingOperation(String topic) {
		super(topic);
	}

	protected void checkConditionState(Context ctx) {
		try {
			if (isActive.value() == null) {
				isActive.update(false);
			}

			if (!isActive.value()) {
				if (evalStartCondition()) {
					if (shouldActivateByCount()) {
						isActive.update(true);
						activationCount.update(activationCount.value() + 1);
						SimCore.getInstance().registerFuzzingStart(getUniqueID());
					}
				}
			} else {
				if (evalEndCondition()) {
					isActive.update(false);
					SimCore.getInstance().registerFuzzingEnd(getUniqueID());
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected abstract boolean evalEndCondition();
}
