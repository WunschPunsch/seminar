
/**
 * Aufgabe 10-2
 * @author bkis
 *
 */
public class AddNumbers {
	
	/**
	 * Zahlen im Array addieren ohne Abbruchbedingung...
	 * @return
	 */
	public static int addNumbers(int[] numbers){
		int result = 0;
		int i = 0;
		
		while(true){
			try {
				result += numbers[i];
				i++;
			} catch (IndexOutOfBoundsException e){
				e.printStackTrace();
				break;
			}
		}
		
		return result;
	}

}
