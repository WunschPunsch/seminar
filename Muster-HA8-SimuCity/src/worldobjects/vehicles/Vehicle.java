
package worldobjects.vehicles;

import worldobjects.WorldObject;



/**
 * Abstrakte Basisklasse für alle Fahrzeuge.
 * @author sschwieb
 *
 */
public abstract class Vehicle extends WorldObject{
	
	/**
	 * Farbe des Fahrzeugs
	 */
	private String color;
	
	/**
	 * Baujahr
	 */
	private int yearOfConstruction;
	
	/**
	 * Konstruktor, der die Objekt-Variablen der Klasse setzt:
	 */
	public Vehicle(int x, int y, String color, int yearOfConstruction) {
		super(x,y);
		this.color = color;
		this.yearOfConstruction = yearOfConstruction;
	}


	public String getColor() {
		return color;
	}

	public int getYearOfConstruction() {
		return yearOfConstruction;
	}
	
	/**
	 * Bewegt das Fahrzeug an eine neue Position. Da
	 * sich Fahrzeuge unterschiedliche bewegen können,
	 * ist diese Methode abstrakt.
	 */
	public abstract boolean moveTo(int x, int y);
	
	/**
	 * Hilfsmethode, die die Koordinaten neu setzt.
	 * Da diese Methode nicht von jeder Stelle aus
	 * aufgerufen werden soll (dafür ist moveTo() gedacht),
	 * 
	 * @param x
	 * @param y
	 */
	protected void setCoordinates(int x, int y) {
		setX(x);
		setY(y);
	}
	
	@Override
	public String toString() {
		return "Position: " + getX() + ", " + getY();
	}
	
}
