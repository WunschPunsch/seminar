
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		World world = new World();
		System.out.println("***********************");
		System.out.println("Erzeuge Welt...");
		world.populateWorld(6);
		world.printWorld();
		System.out.println();
		System.out.println("***********************");
		System.out.println("Bewege Fahrzeuge...");
		world.flyAPlane(15,30);
		for(int i = 0; i < 5; i++) {
			world.driveACar(i+1, i*2);
		}
		System.out.println();
		System.out.println("***********************");
		System.out.println("Neuer 'Weltzustand':");
		world.printWorld();
		System.out.println();
		System.out.println("***********************");
		System.out.println("Alles wieder einparken:");
		world.parkAllVehicles();
		System.out.println();
		System.out.println("***********************");
		System.out.println("Neuer 'Weltzustand':");
		world.printWorld();
	}

}
