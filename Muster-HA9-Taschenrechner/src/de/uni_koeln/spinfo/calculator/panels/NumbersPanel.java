/*
 * Created on 12.05.2005
 *
 */
package de.uni_koeln.spinfo.calculator.panels;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import de.uni_koeln.spinfo.calculator.Application;
import de.uni_koeln.spinfo.calculator.numberbuttons.NumberButton;

/**
 * Ein Panel ist eine Art Fläche in Swing, auf der weitere Elemente (wie z.B.
 * Buttons) "abgelegt" werden können. Dieses Panel enthält die Zahlentasten des
 * Rechners, während bspw. das OperatorsPanel die Operator-Tasten enthält. Wenn
 * Sie die statische Variable SHOW_PANELS_IN_DIFFERENT_COLORS der Klasse
 * Application auf "true" setzen und das Programm laufen lassen, wird der
 * Hintergrund dieses Panels grün hervorgehoben.
 * 
 * @author sschwieb
 */
public class NumbersPanel extends JPanel {

	/**
	 * Der Konstruktor dieser Klasse ruft die Methode initialize() auf, die die
	 * notwendigen Buttons für die Zahlen 1 bis 9 und 0 erstellt.
	 *
	 */
	public NumbersPanel() {
		super();
		initialize();
		if (Application.SHOW_PANELS_IN_DIFFERENT_COLORS) {
			super.setBackground(Color.GREEN);
			super.setBorder(new LineBorder(Color.GREEN));
		}
	}

	/**
	 * Diese Methode erzeugt die Buttons für das Zahlen- Feld des
	 * Taschenrechners. Da jeder NumberButton lediglich eine Zahl als Parameter
	 * im Konstruktor benötigt, lässt sich dies einfach in einer for-Schleife
	 * erledigen.
	 *
	 */
	private void initialize() {
		// Layout: Sorgt dafür, wie die Buttons auf diesem
		// Panel verteilt werden. Hier wird ein Layout verwendet,
		// dass Objekte wie in einer Tabelle mit 4 Zeilen und 3
		// Spalten anordnet.
		GridLayout layout = new GridLayout(4, 3);
		this.setLayout(layout);
		// Erzeugung der Zahlentasten 1 bis 9:
		for (int i = 1; i < 10; i++) {
			// 1. Button erzeugen:
			NumberButton numberButton = new NumberButton(i);
			// 2. Button zu diesem Panel hinzufügen:
			add(numberButton);
		}
		// Erzeugung der Taste 0:
		NumberButton numberButton = new NumberButton(0);
		add(numberButton);
		// Zwei Buttons passen noch auf dieses Panel -
		// warum nicht einfach mal eine Taste für die Zahl 13 anlegen?

		// NumberButton strangeButton = new NumberButton(13);
		// add(strangeButton);
	}

}
