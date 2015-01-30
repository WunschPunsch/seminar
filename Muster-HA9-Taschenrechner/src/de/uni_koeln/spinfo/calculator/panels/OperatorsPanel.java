/*
 * Created on 12.05.2005
 *
 */

package de.uni_koeln.spinfo.calculator.panels;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import de.uni_koeln.spinfo.calculator.Application;
import de.uni_koeln.spinfo.calculator.operationbuttons.AbstractButtonAction;
import de.uni_koeln.spinfo.calculator.operationbuttons.AddButtonAction;
import de.uni_koeln.spinfo.calculator.operationbuttons.DivideButton;
import de.uni_koeln.spinfo.calculator.operationbuttons.MultiplyButtonAction;
import de.uni_koeln.spinfo.calculator.operationbuttons.PowerOfButtonAction;
import de.uni_koeln.spinfo.calculator.operationbuttons.ResultButtonAction;
import de.uni_koeln.spinfo.calculator.operationbuttons.SubtractButton;

/**
 * Ein Panel ist eine Art Fläche in Swing, auf der weitere Elemente
 * (wie z.B. Buttons) "abgelegt" werden können.
 * Dieses Panel enthält die Operatortasten des Rechners, während bspw.
 * das NumbersPanel die Zahlentasten enthält.
 * Wenn Sie die statische Variable SHOW_PANELS_IN_DIFFERENT_COLORS
 * der Klasse Application auf "true" setzen und das Programm laufen
 * lassen, wird der Hintergrund dieses Panels rot hervorgehoben.
 * @author sschwieb
 */
public class OperatorsPanel extends JPanel {

	/**
	 * Der Konstruktor ruft die initialize()-Methode auf,
	 * mit deren Hilfe sämtliche "Operator-Buttons" erzeugt werden.
	 *
	 */
	public OperatorsPanel() {
		initialize();
		if(Application.SHOW_PANELS_IN_DIFFERENT_COLORS) {
			super.setBackground(Color.RED);
			super.setBorder(new LineBorder(Color.RED));
		}
	}
	
	/**
	 * Diese Methode müssen Sie um eine Zeile pro selbsterzeugter
	 * Operation erweitern! Sehen Sie sich den Sourcecode an, um
	 * zu sehen, wie dies bei den bereits vorhandenen Operationen
	 * funktioniert.
	 *
	 */
	private void initialize() {
		// Layouts sind Swing-Konzepte, mit denen
		// auf plattformunabhängige Weise GUI-Komponenten
		// strukturiert werden können. Hier wird ein Layout verwendet,
		// dass GUI-Komponenten in einer Art Tabelle (mit 4 Zeilen
		// und 3 Spalten) strukturiert. 
		// Wenn Sie sich dies veranschaulichen möchten, ändern Sie
		// doch einfach mal die beiden Parameter!
		// Ansonsten können Sie die Layouts aber auch getrost ignorieren -
		// hier und überall im Programm
		GridLayout layout = new GridLayout(4,3);
		this.setLayout(layout);
		// WICHTIG:
		// Diese Methode fügt einen Operator-Button ("+", "-"...)
		// zum Taschenrechner hinzu. Wenn Sie einen eigenen Operator
		// programmiert haben, müssen Sie hier die addOperatorButton()-
		// Methode mit Ihrer "Action" als Parameter aufrufen!
		addOperatorButton(new MultiplyButtonAction());
		addOperatorButton(new AddButtonAction());
		addOperatorButton(new PowerOfButtonAction());
		addOperatorButton(new ResultButtonAction());
		addOperatorButton(new SubtractButton()); //eigener Button 
		addOperatorButton(new DivideButton()); //eigener Button 
	}
	
	/**
	 * Diese Methode fügt eine Operation zum Taschenrechner hinzu.
	 * Sie müssen diese Methode in der Methode initialize() aufrufen
	 * und als Parameter Ihre "Action" übergeben, damit sie auch
	 * auf dem Taschenrechner erscheint!
	 * Sehen Sie sich den Sourcecode dieser Klasse für weitere Details
	 * an.
	 * @param operation Die "Action", die hinzugefügt werden soll
	 */
	private void addOperatorButton(AbstractButtonAction operation) {
		// 1.) Es wird ein neuer Button erzeugt
		JButton button = new JButton();
		// 2.) Dieser Button bekommt die übergebene "Action" zugeweisen
		button.setAction(operation);
		// 3.) Dann wird der Button zum Taschenrechner hinzugefügt.
		add(button);
		
	}
}
