package worldobjects.vehicles.air;

import worldobjects.buildings.Airfield;

public class Jumbo extends Plane {

	public Jumbo(int x, int y, int yearOfConstruction) {
		super(x, y, yearOfConstruction);
	}

	public Jumbo(Airfield airfield, int yearOfConstruction) {
		this(airfield.getX(), airfield.getY(), yearOfConstruction);
		airfield.parkVehicle(this);
	}
	
	@Override
	public String toString() {
		return "Jumbo (Created " + super.getYearOfConstruction() + ") " + super.toString();
	}
	

}
