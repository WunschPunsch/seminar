package worldobjects.vehicles.air;

import worldobjects.vehicles.Vehicle;

public abstract class Plane extends Vehicle {

	public Plane(int x, int y, int yearOfConstruction) {
		super(x, y, "white", yearOfConstruction);
	}

	@Override
	public boolean moveTo(int x, int y) {
		System.out.println(this.toString() + " fliegt nach [" + x + ", " + y + "]" );
		super.setCoordinates(x,y);
		return true;
	}

}
