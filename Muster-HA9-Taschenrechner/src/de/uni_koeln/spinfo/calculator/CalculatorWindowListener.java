/*
 * Created on 14.05.2005
 * 
 */
package de.uni_koeln.spinfo.calculator;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import de.uni_koeln.spinfo.calculator.menu.QuitAction;

/**
 * <p><b>Typ:</b> 
 * Swing-Spezifische Klasse - hat nichts mit dem "eigentlichen" Programm zu tun.</p>
 * <p><b>Zweck:</b> 
 * Bewirkt letztlich, dass dann, wenn in das "Schließen"-Feld in der Titelleiste
 * des Programms (Rotes X unter Windows) ein Dialog geöffnet wird und erst dann, wenn
 * der Anwender das Beenden bestätigt, das Programm wirklich beendet wird.</p>
 * <p><b>Details:</b> 
 * Ein Objekt dieser Klasse wird in der Klasse CalculatorFrame instanziiert und
 * mit dem CalculatorFrame verbunden. Wird das Schließen-Symbol in der Fensterleiste
 * des Taschenrechners angeklickt, so wird die Methode "windowClosing" in dieser
 * Klasse aufgerufen.</p>
 * <p><b>Noch mehr Details:</b>
 * siehe Abschnitt "Events und Listeners" in der globalen Dokumentation.</p>
 * @see de.uni_koeln.spinfo.calculator.CalculatorFrame 
 * @see de.uni_koeln.spinfo.calculator.menu.QuitAction
 * @author sschwieb
 */
public class CalculatorWindowListener extends WindowAdapter {

	/**
	 * Eine Instanz von QuitAction, die für den Beenden-Dialog
	 * zuständig ist.
	 */
	private QuitAction quitAction = new QuitAction();
	
	/**
	 * Diese Methode wird von Swing aufgerufen, wenn das Taschenrechner-Fenster
	 * geschlossen wird. Da sich das Programm genau so verhalten soll, wie wenn
	 * der Menupunkt "Datei->Beenden" aufgerufen wird, lässt sich hier die Klasse
	 * QuitAction prima wiederverwerten, indem einfach die Methode "askForQuit"
	 * einer Instanz von QuitAction aufgerufen wird, die das Dialog-Fenster öffnet
	 * und das Beenden des Programms einleitet.
	 */
	public void windowClosing(WindowEvent e) {
		quitAction.askForQuit();
	}
}
