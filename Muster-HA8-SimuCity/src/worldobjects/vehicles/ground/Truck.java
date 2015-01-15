package worldobjects.vehicles.ground;

import worldobjects.buildings.ParkingLot;

public class Truck extends Automobile {

	public Truck(ParkingLot garage, int yearOfConstruction) {
		super(garage.getX(), garage.getY(), "grey", yearOfConstruction);
		garage.parkVehicle(this);
	}

	@Override
	protected String getDetails() {
		return "Truck (" + super.getColor() + ", created " + super.getYearOfConstruction() + ")";
	}
	
	

}
