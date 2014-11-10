package ha2.katze;

public class Application {

	public static void main(String[] args) {
		Katze bergmann = new Katze();
		bergmann.name = "Bergmann";
		bergmann.farbe = "braun";
		bergmann.gewicht = 42;
		bergmann.miau();
		System.out.println("Name: " + bergmann.name);
		System.out.println("Farbe: " + bergmann.farbe);
		System.out.println("Gewicht: " + bergmann.gewicht + "kg");
	}

}
