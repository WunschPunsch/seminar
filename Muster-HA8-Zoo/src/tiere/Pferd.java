package tiere;

import tiere.interfaces.HatFell;
import tiere.interfaces.Pflanzenfresser;

public class Pferd extends Tier implements Pflanzenfresser, HatFell{

	public Pferd(String name, int alter) {
		super(name, 0,0, alter);
	}

	@Override
	public String sprich() {
		return "Das Pferd '" + super.name + "' wiehert.";
	}

	@Override
	public void pflanzenFressen() {
		System.out.println(getName() + " hat Pflanzen gefressen.");
	}
	
}
