package worldobjects.buildings;

import java.util.ArrayList;
import java.util.List;

import worldobjects.WorldObject;
import worldobjects.vehicles.Vehicle;

/**
 * Abstrakte Basisklasse für alle Gebäude.
 * @author sschwieb
 *
 */
public abstract class Building extends WorldObject {
	
	protected List<Vehicle> vehicles;
	

	public Building(int x, int y) {
		super(x,y);
		this.vehicles = new ArrayList<Vehicle>();
	}
	
	
	public void parkVehicle(Vehicle v) {
		if(vehicles.contains(v)) {
			return;
		}
		v.moveTo(getX(), getY());
		vehicles.add(v);
	}
	
	
	public Vehicle getNextVehicle() {
		if(vehicles.size() == 0) return null;
		Vehicle v = vehicles.remove(0);
		return v;
	}

	
	public int getNumberOfVehicles() {
		return vehicles.size();
	}
	

}
