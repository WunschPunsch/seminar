package de.uni_koeln.spinfo.calculator.operationbuttons;


public class DivideButton extends AbstractButtonAction {

	public DivideButton() {
		super("/");
	}

	@Override
	protected void executeOperation(Integer firstParam, Integer secondParam) {
		System.out.println("executeOperation \"divide\" with " + firstParam
				+ " and " + secondParam);
		valueInMemory = firstParam / secondParam; //eigentliche Operation
	}

}
