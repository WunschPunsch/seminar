
/**
 * Von Fahrzeug abgeleitete Klasse, die zusätzlich
 * noch die Variable anzahlDerSitze mit einführt.
 * @author spinfo
 *
 */
public class Auto extends Fahrzeug {

	private int anzahlDerSitze;

	public int getAnzahlDerSitze() {
		return anzahlDerSitze;
	}

	public void setAnzahlDerSitze(int anzahlDerSitze) {
		this.anzahlDerSitze = anzahlDerSitze;
	}
	
	
}
