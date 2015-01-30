package tiere;

import tiere.interfaces.HatFell;

public class Hund extends Tier implements HatFell {

	public Hund(String name, int alter) {
		super(name, 0,0, alter);
	}

	@Override
	public String sprich() {
		return "Der Hund '" + super.name + "' bellt.";
	}
	
	

}
