import java.io.IOException;


public class Main {

	public static void main(String[] args) {
		
		//Tier erzeugen
		Tier t1 = new Tier("Garfield", "orange", 6);
		
		//Instanz der IO-Klasse erzeugen (liest und schreibt Dateien)
		IO io = new IO();
		
		//Daten des Tier-Objektes speichern
		try {
			io.writeFile(t1.getName() + "\n"
					   + t1.getColor() + "\n"
					   + t1.getAge(),
					   "tier.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Daten wieder auslesen
		String s = "";
		try {
			s = io.readFile("tier.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Aus den Daten Tier-Objekt bauen
		String[] daten = s.split("\n");
		Tier t2 = new Tier(daten[0], daten[1], Integer.parseInt(daten[2]));
		
		//Eigenschaften des ausgelesenen Tieres auf der Konsole ausgeben
		System.out.println("Name: " + t2.getName() + "\n"
				+ "Farbe: " + t2.getColor() + "\n"
				+ "Alter: " + t2.getAge());
	}

}
