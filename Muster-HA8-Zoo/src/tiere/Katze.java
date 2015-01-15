package tiere;

public class Katze extends Tier {

	public Katze(String name, int alter) {
		super(name, 0,0, alter);
	}

	@Override
	public String sprich() {
		return "Die Katze '" + super.name + "' miaut.";
	}
	
	

}
