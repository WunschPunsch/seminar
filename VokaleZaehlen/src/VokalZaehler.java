
public class VokalZaehler {
	
	
	public Integer zaehleVokale(String zeichenKette) {
		zeichenKette = zeichenKette.toLowerCase();
		Integer aktuellePosition = 0;
		Integer letztePosition = zeichenKette.length()-1;
		Integer anzahlVokale = 0;
		
		while(aktuellePosition <= letztePosition) {
			Character buchstabe = zeichenKette.charAt(aktuellePosition);
			if(buchstabe == 'a') {
				anzahlVokale++;
			} else if (buchstabe == 'e') {
				anzahlVokale++;
			} else if (buchstabe == 'i') {	// Natürlich ist diese Lösung
				anzahlVokale++;				// sehr unschön - da wir aber
			} else if (buchstabe == 'o') {	// zu diesem Zeitpunkt noch
				anzahlVokale++;				// keine Aussagenlogik o.ä. benutzt haben,
			} else if (buchstabe == 'u') { 	// ist die eine der möglichen
				anzahlVokale++;				// "Notlösungen".
			}
			aktuellePosition++;
		}
		
		System.out.println("Anzahl aller Vokale in '" + zeichenKette + "': " + anzahlVokale);
		return anzahlVokale;
	}
	
	
}
