package worldobjects.buildings;

/**
 * Ein Flughafen.
 * @author sschwieb
 *
 */
public class Airfield extends Building {
	
	private String name;
	
	public Airfield(int x, int y, String name) {
		super(x, y);
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "Flughafen " + name;
	}

}
