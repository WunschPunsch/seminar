package de.uni_koeln.spinfo.calculator.operationbuttons;


public class SubtractButton extends AbstractButtonAction {

	public SubtractButton() {
		super("-");
	}

	@Override
	protected void executeOperation(Integer firstParam, Integer secondParam) {
		System.out.println("executeOperation \"subtract\" with " + firstParam
				+ " and " + secondParam);
		valueInMemory = firstParam - secondParam; //eigentliche Operation
	}

}
