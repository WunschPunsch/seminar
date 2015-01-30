/*
 * Created on 14.05.2005
 *
 */
package de.uni_koeln.spinfo.calculator.operationbuttons;

import javax.swing.ImageIcon;


/**
 * Diese K
 * @author sschwieb
 *
 */
public class PowerOfButtonAction extends AbstractButtonAction {

	/**
	 * Dieser Konstruktor unterscheidet sich von den Konstruktoren
	 * von MultiplyButtonAction und AddButtonAction dadurch, dass
	 * als Parameter für den Konstruktor der Superklasse nicht ein
	 * String-Objekt, sondern ein Icon übergeben wird.
	 * Dieses wird als Symbol auf der Taste dargestellt.
	 * Um ein ImageIcon zu erzeugen, müssen Sie den Pfad zu einer
	 * Bilddatei angeben (funktioniert m.W. nur mit .png oder .gif-
	 * Dateien, ich bin mir da aber nicht ganz sicher).
	 * Dieser Pfad sollte relativ zum Projektverzeichnis angegeben
	 * werden - am einfachsten ist es, wenn Sie die Icon-Datei in
	 * das "icons"-Verzeichnis im Taschenrechner-Projekt kopieren
	 * und dann einfach den Dateinamen ändern.
	 * Achtung: Groß/Kleinschreibung ist hier relevant!
	 * Im "icons"-Verzeichnis finden sie ein paar weitere mathematische
	 * Icons, wirklich "schöne" habe ich leider nicht gefunden.
	 *
	 */
	public PowerOfButtonAction() {
		super(new ImageIcon("icons/lsub.png"));
	}
	
	/* (non-Javadoc)
	 * @see de.uni_koeln.spinfo.calculator.operationbuttons.AbstractButtonAction#executeOperation(long, long)
	 */
	protected void executeOperation(Integer firstParam, Integer secondParam) {
		// Nur, damit sich der Programmablauf etwas verfolgen lässt:
		System.out.println("executeOperation \"powerOf\" with " + firstParam + " and " + secondParam);
		// Die eigentliche Berechnung: In diesem Fall eine Addition.
		// Die Besonderheit dabei: die Variable "valueInMemory" ist eine
		// statische Variable der Superklasse.
		// Dadurch kann jede Action bequem auf den Speicher zugreifen,
		// und sicher sein, dass es sich um das aktuelle Zwischenergebnis
		// handelt.
		Double temp = Math.pow(firstParam, secondParam);
		valueInMemory = temp.intValue();
		// Natürlich sollte der Taschenrechner das Ergebnis auch darstellen.
		// Deshalb wird dem "Display" der neue Wert zugewiesen.
		//// CalculatorDisplay.setValue(valueInMemory);
		// Außerdem sollte sich das Display "löschen", wenn anschließend weitere
		// Zahlen eingegeben werden, so wie es von einem Taschenrechner
		// zu erwarten ist.
		//// CalculatorDisplay.prepareForClearDisplay();
	}

}
