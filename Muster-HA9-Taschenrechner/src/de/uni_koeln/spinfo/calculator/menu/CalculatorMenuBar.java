/*
 * Created on 13.05.2005
 *
 */
package de.uni_koeln.spinfo.calculator.menu;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * <p><b>Typ:</b> 
 * Swing-Spezifische Klasse - hat fast nichts mit dem "eigentlichen" Programm zu tun.</p>
 * <p><b>Zweck:</b> 
 * Diese Klasse "ist" die Menüleiste des Taschenrechners.</p>
 * <p><b>Details:</b> 
 * Eine Instanz dieser Klasse ist die Menüleiste des
 * Taschenrechners. Wenn Sie Swing interessiert, können
 * Sie sich die Methode initMenus() im Quellcode ansehen;
 * wenn Sie wissen wollen, was beim Aufruf eines Menüpunks
 * passiert, können Sie sich die Klassen QuitAction und
 * AboutAction ansehen.</p>
 * 
 * @see de.uni_koeln.spinfo.calculator.menu.AboutAction
 * @see de.uni_koeln.spinfo.calculator.menu.QuitAction
 * @author sschwieb
 *
 */
public class CalculatorMenuBar extends JMenuBar{
	
	/**
	 * Der Konstruktor dieser Klasse ruft die Methode
	 * initMenus() auf, die die beiden Menüs dieses
	 * Programms erzeugt.
	 *
	 */
	public CalculatorMenuBar() {
		super();
		initMenus();
	}
	
	/**
	 * Initialisierung der Menüleiste. Benötigt werden zwei
	 * Menüs mit jeweils einem Menüpunkt. Prinzipiell lässt
	 * sich dies in drei Zeilen pro Menü lösen, wenn Sie es
	 * sich ansehen möchten, schauen Sie am besten in den Sourcecode
	 * dieser Methode.
	 *
	 */
	private void initMenus() {
		// Datei-Menü:
		// 1. Ein Menü erzeugen
		JMenu fileMenu = new JMenu("Datei");
		// 2. Einen Menüpunkt erzeugen
		JMenuItem quitMenuItem = new JMenuItem();
		// 3. Die "Aktion", die bei Auswahl des Menüpunktes ausgeführt
		// werden soll, erzeugen:
		QuitAction quit = new QuitAction();
		// 4. Der Menüpunkt muss "wissen", welche Aktion er ausführen
		// soll, also muss sie zugewiesen werden:
		quitMenuItem.setAction(quit);
		// 5. Jetzt muss noch der Menüpunkt zum Menü hinzugefügt werden:
		fileMenu.add(quitMenuItem);
		// 6. Und schließlich das Menü zur Menüleiste:
		this.add(fileMenu);
		// Fertig! Jetzt fehlt nur noch das Info-Menü.
		// Die folgenden Zeilen sind
		// Äquivalent zu den obigen. Durch die Verschachtelung
		// in der add-Methode sind sie jedoch auch schwieriger
		// zu lesen...
		JMenu aboutMenu = new JMenu("Info");
		aboutMenu.add(new JMenuItem(new AboutAction()));
		this.add(aboutMenu);
	}

}
