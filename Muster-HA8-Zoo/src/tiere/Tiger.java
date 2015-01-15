package tiere;

import tiere.interfaces.Fleischfresser;
import tiere.interfaces.HatFell;

public class Tiger extends Tier implements Fleischfresser, HatFell {
	
	public Tiger(String name, int alter) {
		super(name, 0, 0, alter);
	}
	
	public String sprich() {
		return "Tigergeräusch";
	}
	
	public void fleischFressen() {
		System.out.println("Fleisch gefressen.");
	}

	
}


