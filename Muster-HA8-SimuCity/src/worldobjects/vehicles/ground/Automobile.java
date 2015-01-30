package worldobjects.vehicles.ground;

import worldobjects.vehicles.Vehicle;

public abstract class Automobile extends Vehicle {

	public Automobile(int x, int y, String color, int yearOfConstruction) {
		super(x, y, color, yearOfConstruction);
	}
	

	@Override
	public boolean moveTo(int x, int y) { 
		System.out.println(this.toString() + " fährt nach [" + x + ", " + y + "]");
		super.setCoordinates(x, y);
		return true;
	}
	
	@Override
	public String toString() {
		return "Auto " + getDetails() + " " + super.toString();
	}


	protected abstract String getDetails();

}
