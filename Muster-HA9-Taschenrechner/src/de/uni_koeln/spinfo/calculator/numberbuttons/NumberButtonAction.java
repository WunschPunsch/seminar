/*
 * Created on 12.05.2005
 *
 */
package de.uni_koeln.spinfo.calculator.numberbuttons;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import de.uni_koeln.spinfo.calculator.CalculatorDisplay;

/**
 * @author sschwieb
 *
 */
public class NumberButtonAction extends AbstractAction {
	
	/**
	 * Die Zahl, die diese Taste repräsentiert
	 */
	private Integer number;

	/**
	 * Konstruktor für eine NumberButtonAction, der eine
	 * Zahl benötigt. Bei Betätigung der Taste wird die Zahl
	 * an das CalculatorDisplay weitergeschickt und dort
	 * dargestellt.
	 * @param number
	 */
	public NumberButtonAction(Integer number) {
		// Wie auch bei den OperationButtons wird hier
		// eine Zeichenkette übergeben, die dann als Beschriftung
		// der Taste dient.
		super("" + number);
		// Damit sich die Taste bei Betätigung daran "erinnern" kann,
		// welche Zahl sie repräsentiert, wird sie gespeichert:
		this.number = number;
	}
	
	/**
	 * Diese Methode wird bei Mausklick auf die Taste "von Swing"
	 * aufgerufen und ruft die Methode CalculatorDisplay.appendNumber
	 * mit der Zahl, die diese Taste repräsentiert, auf.
	 */
	public void actionPerformed(ActionEvent e) {
		CalculatorDisplay.appendNumber(number);
	}

}
