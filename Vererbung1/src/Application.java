

public class Application {
	
	public static void main(String[] args) {
		Auto auto = new Auto();
		auto.setAnzahlDerSitze(5);
		/*
		 * Da die Klasse Auto von Fahrzeug abgeleitet ist,
		 * können sämtliche Methoden der Superklasse ebenfalls
		 * verwendet werden - hier getBaujahr() und getHersteller()
		 */
		System.out.println(auto.getAnzahlDerSitze());
		System.out.println(auto.getBaujahr());
		System.out.println(auto.getHersteller());
		
		/*
		 * Vererbung lässt sich auch als eine "ist ein"-Relation 
		 * betrachten: Ein Auto ist ein Fahrzeug, deshalb kann
		 * auf einem Fahrzeug-Array oder in einer Fahrzeug-Variablen
		 * auch ein Auto gespeichert werden. 
		 */
		Fahrzeug[] array = new Fahrzeug[3];
		array[0] = auto;	
		// Wird jedoch die Spezialisierung einer Subklasse benötigt,
		// so muss zunächst wieder gecastet werden:
		Fahrzeug f = array[0];
		Auto a = (Auto) f;
		System.out.println(a.getAnzahlDerSitze());
	}

}
