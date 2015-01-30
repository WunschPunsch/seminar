
/**
 * Basisklasse der exemplarischen Vererbungshierarchie.
 * Jedes Fahrzeug hat ein Baujahr und einen Hersteller, die durch
 * getter-Methoden abgefragt werden können.
 */
public class Fahrzeug {

	protected int baujahr;
	
	private String hersteller;
	
	public int getBaujahr() {
		return baujahr;
	}

	public String getHersteller() {
		System.out.println("GetHersteller in Fahrzeug");
		return hersteller;
	}
	
	
}
