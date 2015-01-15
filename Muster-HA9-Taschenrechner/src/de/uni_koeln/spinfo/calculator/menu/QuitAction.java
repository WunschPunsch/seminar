/*
 * Created on 12.05.2005
 *
 */
package de.uni_koeln.spinfo.calculator.menu;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

/**
 * <p><b>Typ:</b> 
 * Von einer Swing-Klasse abgeleitete Klasse, die die "Aktion Beenden" realisiert.</p>
 * <p><b>Zweck:</b> 
 * Bewirkt, dass ein Dialog geöffnet wird, in dem der Benutzer bestätigen muss, dass
 * er das Programm wirklich beenden will.</p>
 * <p><b>Details:</b> 
 * Siehe Dokumentation der Methode "askForQuit" in dieser Klasse.</p>
 * @see de.uni_koeln.spinfo.calculator.menu.CalculatorMenuBar
 * @see de.uni_koeln.spinfo.calculator.CalculatorWindowListener
 * @author sschwieb
 */
public class QuitAction extends AbstractAction {

	public QuitAction() {
		super("Taschenrechner beenden");
	}
	
	/**
	 * Diese Methode wird "von Swing" aufgerufen, wenn der Punkt "Beenden"
	 * im Datei-Menü aufgerufen wird. Das funktioniert, weil in der Methode
	 * "initMenus()" in CalculatorMenuBar eine Instanz dieser Klasse erzeugt
	 * und mit dem Menüpunkt verbunden wird. Wie dies geschieht, können Sie im
	 * Sourcecode der Klasse CalculatorMenuBar sehen.
	 */
	public void actionPerformed(ActionEvent e) {
		askForQuit();
	}
	
	/**
	 * Diese Methode "fragt" den Anwender, ob er das Programm beenden möchte.
	 * Falls er bestätigt, wird es beendet.
	 * Da Dialoge häufig benötigt werden, bietet Swing mit der Klasse JOptionPane
	 * eine einfach zu benutzende Klasse mit (statischen!) Methoden, um Standard-
	 * Dialoge wie den "Beenden"-Dialog in diesem Programm schnell realisieren zu können.
	 * Wenn es Sie interessiert, können Sie ja einmal ausprobieren, welche anderen
	 * Dialogtypen JOptionPane noch bietet!
	 * Im Quellcode dieser Methode sehen Sie ein auskommentiertes Beispiel dazu.
	 *
	 */
	public void askForQuit() {
//		String eingabe = JOptionPane.showInputDialog(null,"Das ist ein InputDialog - Tippen Sie doch mal etwas hier ein!");
//		JOptionPane.showMessageDialog(null,"Sie haben \"" + eingabe + "\" eingegeben.","Ein langweiliger Titel",JOptionPane.INFORMATION_MESSAGE);
		int result = JOptionPane.showConfirmDialog(null,"Möchten Sie wirklich diesen Taschenrechner verlassen?");
		if(result == JOptionPane.OK_OPTION) {
			System.exit(0);
		}
	}

}
