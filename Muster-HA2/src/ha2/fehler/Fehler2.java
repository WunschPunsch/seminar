package ha2.fehler;

public class Fehler2 {
	
	Integer addValues(Integer a, Integer b) {
		Integer summe = a + b;
		return summe;
	}
	
	void printString(String string) {
		System.out.println(string); // Diese Lösung ist extrem unelegant!
		System.out.println(string); // Da wir im Seminar noch keine Schleifen 
		System.out.println(string); // gelernt haben, muss es leider so gehen.
		System.out.println(string);
	}
	
	void printNumber(Integer zahl1, Integer zahl2) {
		System.out.println("Summe von " + zahl1 + " und " + zahl2 + " ist: " + (zahl1 + zahl2));
	}
	
}
