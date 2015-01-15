/*
 * Created on 12.05.2005
 *
 */
package de.uni_koeln.spinfo.calculator.operationbuttons;


/**
 * Diese Klasse realisiert die "*"-Taste des Taschenrechners. Sie ist von
 * AbstractButtonAction abgeleitet, so dass lediglich die abstrakte Methode
 * "executeOperation" implementiert und der Konstruktor von AbstractButtonAction
 * aufgerufen werden muss. Dadurch wird der Aufwand für die Realisierung einer
 * neuen (mathematischen) Funktion auf ein Minimum reduziert - sehen Sie sich
 * den Sourcecode dieser Klasse an, er besteht aus lediglich 4 Anweisungen!
 * 
 * @author sschwieb
 *  
 */
public class MultiplyButtonAction extends AbstractButtonAction {

	/**
	 * Dieser Konstruktor übergibt den String "*" an den 
	 * Konstruktor der Superklasse, die ihn als Beschriftung
	 * für die Taste benutzt.
	 *
	 */
	public MultiplyButtonAction() {
		super("*");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.uni_koeln.spinfo.gui.operations.Operation#executeOperation()
	 */
	protected void executeOperation(Integer firstParam, Integer secondParam) {
		// Nur, damit sich der Programmablauf etwas verfolgen lässt:
		System.out.println("executeOperation \"multiply\" with " + firstParam
				+ " and " + secondParam);
		// Die eigentliche Berechnung: In diesem Fall eine Addition.
		// Die Besonderheit dabei: die Variable "valueInMemory" ist eine
		// statische Variable der Superklasse.
		// Dadurch kann jede Action bequem auf den Speicher zugreifen,
		// und sicher sein, dass es sich um das aktuelle Zwischenergebnis
		// handelt.
		valueInMemory = firstParam * secondParam;
		// Natürlich sollte der Taschenrechner das Ergebnis auch darstellen.
		// Deshalb wird dem "Display" der neue Wert zugewiesen.
		//// CalculatorDisplay.setValue(valueInMemory);
		// Außerdem sollte sich das Display "löschen", wenn anschließend weitere
		// Zahlen eingegeben werden, so wie es von einem Taschenrechner
		// zu erwarten ist.
		//// CalculatorDisplay.prepareForClearDisplay();
	}
}