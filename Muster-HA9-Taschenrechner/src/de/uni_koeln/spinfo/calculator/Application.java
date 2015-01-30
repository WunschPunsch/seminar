
package de.uni_koeln.spinfo.calculator;
/*
 * Created on 12.05.2005
 *
 */

/**
 * Dies ist der "Einstiegspunkt" für die JVM, denn diese Klasse
 * enthält die main-Methode. Allerdings besteht diese Methode
 * nur aus 3 Zeilen - das "Fenster" des Taschenrechners wird
 * erzeugt, initialisiert und geöffnet.
 * Weiterhin enthält diese Klasse eine boolesche Klassenvariable,
 * die Sie einmal auf "true" setzen können, wenn Sie sehen wollen,
 * wo genau die scheinbar "unsichtbaren" Panels (NumbersPanel und
 * OperatorsPanel) liegen.
 * 
 * @author sschwieb
 *
 */
public class Application {
	
	/**
	 * Eine Klassenvariable, die bei der Erzeugung einiger Panels
	 * ausgelesen wird. Falls sie den Wert "true" hat, werden diese
	 * Panels farblich markiert, so dass Sie in etwa sehen können,
	 * welches Panel wo auftaucht.
	 */
	public static final boolean SHOW_PANELS_IN_DIFFERENT_COLORS = false;

	/**
	 * Der Einstiegspunkt in das Taschenrechner-Programm.
	 * Erzeugt wird eine Instanz von CalculatorFrame, die initialisiert
	 * und dargestellt wird.
	 * Dass das Programm sich danach nicht automatisch beendet, liegt daran,
	 * dass Java netterweise selbst merkt, dass ein Fenster geöffnet wurde
	 * und es nicht verkehrt sein kann, so lange zu laufen, bis der Anwender
	 * das Programm beendet.
	 * @param args
	 */
	public static void main(String[] args) {
		CalculatorFrame calculator = new CalculatorFrame();
		calculator.createCalculatorComponents();
		calculator.setVisible(true);
	}
}
