import java.util.ArrayList;

import worldobjects.buildings.Airfield;
import worldobjects.buildings.ParkingLot;
import worldobjects.vehicles.Vehicle;
import worldobjects.vehicles.air.Jumbo;
import worldobjects.vehicles.air.Plane;
import worldobjects.vehicles.ground.Automobile;
import worldobjects.vehicles.ground.PassengerCar;
import worldobjects.vehicles.ground.Truck;

/**
 * Repräsentiert die Welt, bestehend aus Flughafen, Parkplatz und einer beliebigen
 * Anzahl von Fahrzeugen.
 * @author sschwieb
 *
 */
public class World {
	
	private Airfield airfield;
	
	private ParkingLot parkingLot;
	
	private ArrayList<Vehicle> allVehicles;
	
	/**
	 * Initialisierung aller benötigten Variablen
	 */
	public World() {
		airfield = new Airfield(1, 1, "Köln-Bonn");
		parkingLot = new ParkingLot(2, 2);
		allVehicles = new ArrayList<Vehicle>();
	}
	
	/**
	 * "Bevölkert" die Welt mit Fahrzeugen
	 * @param numberOfVehicles
	 */
	public void populateWorld(int numberOfVehicles) {
		int initialYear = 1950;
		for(int i = 0; i < numberOfVehicles; i++) {
			Vehicle v = getNextVehicle(i, initialYear + i);
			allVehicles.add(v);
		}
	}
	
	/**
	 * Gibt Informationen über die Welt aus
	 */
	public void printWorld() {
		System.out.println("*************************");
		System.out.println("Die Welt besteht aus einem Flugplatz, einem Parkplatz und " + allVehicles.size() + " Fahrzeugen.");
		System.out.println("Fahrzeug-Details:");
		for(int i = 0; i < allVehicles.size(); i++) {
			Object o = allVehicles.get(i);
			System.out.println("   - " + o);
		}
		System.out.println("Gebäude-Details:");
		System.out.println("Auf dem Parkplatz stehen " + parkingLot.getNumberOfVehicles() + " Fahrzeuge.");
		System.out.println("Auf dem " + airfield + " stehen " + airfield.getNumberOfVehicles() + " Flugzeuge.");
	}
	
	/**
	 * Fliegt ein Flugzeug an eine neue Position
	 */
	public void flyAPlane(int newX, int newY) {
		Plane plane = (Plane) airfield.getNextVehicle();
		if(plane == null) {
			System.out.println("Der Flugplatz ist leer");			
		} else {
			plane.moveTo(newX, newY);
		}
	}
	
	/**
	 * Fährt ein Auto an eine neue Position
	 */
	public void driveACar(int newX, int newY) {
		Automobile auto = (Automobile) parkingLot.getNextVehicle();
		if(auto == null) {
			System.out.println("Der Parkplatz ist leer");
		} else {
			auto.moveTo(newX, newY);
		}
	}

	/**
	 * Parkt alle Fahrzeuge wieder in Flughafen bzw. Parkplatz
	 */
	public void parkAllVehicles() {
		for(int i = 0; i < allVehicles.size(); i++) {
			Vehicle v = (Vehicle) allVehicles.get(i);
			if(v instanceof Plane) {
				airfield.parkVehicle((Plane) v);
			}
			if(v instanceof Automobile) {
				parkingLot.parkVehicle((Automobile) v);
			}
		}
	}
	
	private Vehicle getNextVehicle(int vehicleNumber, int yearOfConstruction) {
		if(vehicleNumber % 5 == 0) {
			return new Jumbo(airfield, yearOfConstruction);
		} else {
			int choice = vehicleNumber % 3;
			switch (choice) {
				case 1: return new PassengerCar(parkingLot, "blue", yearOfConstruction, 4);
				case 2: return new PassengerCar(parkingLot, "red", yearOfConstruction, 2);
				default: return new Truck(parkingLot, yearOfConstruction);
			}
		}
	}
	

}
