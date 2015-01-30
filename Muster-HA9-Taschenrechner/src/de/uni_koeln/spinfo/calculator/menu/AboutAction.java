/*
 * Created on 12.05.2005
 *
 */
package de.uni_koeln.spinfo.calculator.menu;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

/** <p><b>Typ:</b> 
* Von einer Swing-Klasse abgeleitete Klasse, die die "Aktion" "Über dieses Programm" realisiert.</p>
* <p><b>Zweck:</b> 
* Bewirkt, dass ein Dialog geöffnet wird, und der "über dieses Programm"-Text angezeigt wird.</p>
* <p><b>Details:</b> 
* Siehe Dokumentation der Methode "actionPerformed" in dieser Klasse oder
* die Dokumentation der Methode "askForQuit" in QuitAction, wenn Sie mehr
* Über Dialoge lernen wollen.</p>
* @see de.uni_koeln.spinfo.calculator.menu.CalculatorMenuBar
* @see de.uni_koeln.spinfo.calculator.menu.QuitAction
* @author sschwieb
*/
public class AboutAction extends AbstractAction {

	public AboutAction() {
		super("Über diesen Taschenrechner");
	}

	/**
	 * Diese Methode wird "von Swing" aufgerufen, wenn der entsprechende
	 * Menüpunkt aufgerufen wird. Wenn Sie sich den Sourcecode ansehen,
	 * werden Sie feststellen, dass sich ein einfacher Dialog wie dieser
	 * in ein bis zwei Zeilen programmieren lässt.
	 * Wenn Sie andere Dialogtypen kennen lernen wollen, sehen Sie bitte
	 * im Sourcecode der Klasse QuitAction nach.
	 */
	public void actionPerformed(ActionEvent e) {
		String message = "Hier könnte Ihr Name stehen!\nDiesen Text können Sie in der Klasse \"" + this.getClass().getName() + "\" ändern.";
		JOptionPane.showMessageDialog(null,message,"Über diesen Taschenrechner...",JOptionPane.INFORMATION_MESSAGE);
	}
}
