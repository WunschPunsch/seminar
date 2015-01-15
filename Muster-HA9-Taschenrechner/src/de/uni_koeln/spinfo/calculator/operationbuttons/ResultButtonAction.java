/*
 * Created on 13.05.2005
 *
 */
package de.uni_koeln.spinfo.calculator.operationbuttons;

import de.uni_koeln.spinfo.calculator.CalculatorDisplay;

/**
 * Dies ist die "="-Taste des Taschenrechners. Sie ist
 * ebenfalls abgeleitet von der Klasse AbstractButtonAction, aber
 * in ihrer executeOperation-Methode wird keine Berechnung durchgeführt,
 * sondern lediglich das aktuelle Zwischenergebnis im Display dargestellt.
 * @author sschwieb
 *
 */
public class ResultButtonAction extends AbstractButtonAction {

	/**
	 * Dieser Konstruktor übergibt den String "=" an den 
	 * Konstruktor der Superklasse, die ihn als Beschriftung
	 * für die Taste benutzt.
	 *
	 */
	public ResultButtonAction() {
		super("=");
	}
	
	/* (non-Javadoc)
	 * @see de.uni_koeln.spinfo.calculator.operationbuttons.AbstractButtonAction#executeOperation()
	 */
	protected void executeOperation(Integer firstParam, Integer secondParam) {
		// Aktuellen Wert darstellen:
		CalculatorDisplay.setValue(valueInMemory);
		// Display auf "Löschen bei der Eingabe des nächsten Zeichens" vorbereiten
		CalculatorDisplay.prepareForClearDisplay();

	}

}
