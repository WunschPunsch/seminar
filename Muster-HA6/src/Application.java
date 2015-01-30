
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StringArray array = new StringArray(10);
		
		for(int i = 0; i < 10; i++) {
			array.add("Zahl " + i);
		}
		
		//test der delete-methode
		array.delete(4);
		
		for(int i = 0; i < array.size(); i++) {
			System.out.println("An Position " + i + ": " + array.get(i));
		}
	}

}
