/*
 * Created on 12.05.2005
 *
 */
package de.uni_koeln.spinfo.calculator.numberbuttons;

import javax.swing.JButton;


/**
 * Diese Klasse repräsentiert einen der Zahlen-Buttons
 * im Taschenrechner-Programm und veranschaulicht damit einen
 * weiteren Vorteil der Objektorientierung: Wiederverwertbarkeit.
 * Statt für jede Zahl von 0 bis 9 eine eigene Klasse zu erzeugen,
 * wird einfach 10 mal ein NumberButton angelegt und die jeweilige
 * Zahl im Konstruktor übergeben.
 * Die Methode, die dies übernimmt, finden Sie in der Klasse NumbersPanel.
 * Wenn Sie möchten, können Sie noch weitere Tasten hinzufügen (für zwei
 * ist ja noch Platz). Dann haben Sie einen wirklich einzigartigen
 * Taschenrechner!
 * 
 * @author sschwieb
 * @see de.uni_koeln.spinfo.calculator.numberbuttons.NumberButtonAction
 * @see de.uni_koeln.spinfo.calculator.panels.NumbersPanel
 *
 */
public class NumberButton extends JButton{
	
/**
 * Erzeugt einen NumberButton, der die übergebene Zahl interpretiert
 * und bei Betätigung an das CalculatorDisplay "schickt".
 * @param number
 */
	public NumberButton(Integer number) {
		super.setAction(new NumberButtonAction(number));
	}

}
