package worldobjects.vehicles.ground;

import worldobjects.buildings.ParkingLot;

public class PassengerCar extends Automobile {
	
	private int numberOfSeats;

	public PassengerCar(int x, int y, String color, int yearOfConstruction, int numberOfSeats) {
		super(x, y, color, yearOfConstruction);
		this.numberOfSeats = numberOfSeats;
	}

	public PassengerCar(ParkingLot garage, String color, int yearOfConstruction, int numberOfSeats) {
		this(garage.getX(), garage.getY(), color, yearOfConstruction, numberOfSeats);
		garage.parkVehicle(this);
	}
	
	@Override
	protected String getDetails() {
		return "Passenger Car (" + numberOfSeats + " seats, " + super.getColor() + ", created " + super.getYearOfConstruction() + ")";
	}

}
