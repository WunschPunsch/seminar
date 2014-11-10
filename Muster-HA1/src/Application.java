
public class Application {

	public static void main(String[] args) {
		Fehler f = new Fehler();
		f.variable1 = 10;
		f.variable2 = 10;
		f.variable3 = "zwanzig";
		f.methode1();
		f.methode2();
		f.methode3();
		System.out.println("Alle Fehler sind verschwunden!");
	}

}
