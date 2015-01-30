package ha2.fehler;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fehler2 fehler = new Fehler2();
		System.out.println(fehler.addValues(1,2));
		fehler.printString("Dieser String wird 5 mal ausgegeben");
		fehler.printNumber(10, 12);
	}

}
