/*
 * Created on 12.05.2005
 *
 */
package de.uni_koeln.spinfo.calculator;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * <p>
 * Diese Klasse ist gleichzeitig "Anzeige" des Taschenrechners und Speicher der
 * aktuell eingegebenen Zahl. Auffällig an dieser Klasse ist, dass sie einen als
 * "private" markierten Konstruktor hat - also eigentlich gar nicht erzeugt
 * werden kann...?
 * </p>
 * <p>
 * Doch, aber nur innerhalb dieser Klasse - hier in der Methode getDisplay().
 * Dadurch kann gewährleistet werden, dass nur ein Objekt dieser Klasse erzeugt
 * wird (sehen Sie sich den SourceCode der Methode getDisplay() einmal an - sind
 * nur 4 Zeilen), so dass es nicht passieren kann, dass auf einmal mehrere
 * Displays für den Taschenrechner existieren, die alle unterschiedliche Werte
 * darstellen, was sicherlich zu Chaos führen würde.
 * </p>
 * <p>
 * (Ähnlich wird auch in der Klasse System vorgegangen - versuchen Sie einmal,
 * mit "new System()" eine neue Instanz anzulegen und sehen Sie sich die
 * Fehlermeldung an!)
 * </p>
 * <p>
 * Ansonsten enthält diese Klasse mehrere statische Methoden, die die
 * Manipulation bzw. das Auslesen der Daten ermöglichen.
 * </p>
 * 
 * @author sschwieb
 *
 */
public class CalculatorDisplay extends JLabel {

	/**
	 * 	
	 */
	private static final long serialVersionUID = -6525616951693415523L;

	/**
	 * Die einzige Instanz des Taschenrechners, die beim ersten Aufruf der
	 * Methode "getDisplay()" erzeugt wird und danach immer zurückgegeben wird.
	 * So kann sichergestellt werden, dass alle Komponenten, die das Display
	 * benötigen, auch auf das gleiche Objekt zugreifen.
	 */
	private static CalculatorDisplay display;

	/**
	 * Eine boolesche Variable, mit deren Hilfe das Display an den "richtigen"
	 * Stellen zurückgesetzt wird: Wenn Sie bspw. "12 + " eintippen und dann
	 * "5", soll das Display natürlich nicht "125" anzeigen, sondern lediglich
	 * "5". Also wird nach Betätigung eine Operator-Taste diese Variable auf
	 * "true" gesetzt und nach Eingabe der nächsten Zahl wieder auf "false".
	 * Dies geschieht mit Hilfe der Methode "prepareForClearDisplay()", die
	 * Operator-Buttons aufrufen - sehen Sie sich einmal die Methode
	 * "executeOperation" der Klasse AddButtonAction an.
	 * 
	 * @see de.uni_koeln.spinfo.calculator.operationbuttons.AddButtonAction
	 */
	private static boolean clearBeforeAppendNumber = true;

	/**
	 * Konstruktor, der aus den oben angegebenen Gründen als "private"
	 * deklariert worden ist. Der Sourcecode ist nicht interessant, hier werden
	 * lediglich die Schriftgröße und das Layout modifiziert.
	 *
	 */
	private CalculatorDisplay() {
		Font oldFont = super.getFont();
		Font newFont = new Font(oldFont.getName(), oldFont.getStyle(),
				oldFont.getSize() * 2);
		super.setFont(newFont);
		setBackground(Color.WHITE);
		this.setOpaque(true);
		super.setHorizontalTextPosition(SwingConstants.RIGHT);
		setText("0");
	}

	/**
	 * Gibt "die" Instanz der Klasse zurück. (Siehe auch den Kommentar zu dieser
	 * Klasse).
	 * 
	 * @return das Display des Taschenrechners
	 */
	public static CalculatorDisplay getDisplay() {
		if (display == null) {
			display = new CalculatorDisplay();
		}
		return display;
	}

	/**
	 * Fügt die übergebene Zahl im Display ein. Ist die Variable
	 * clearBeforeAppendNumber auf "true" gesetzt (durch die Methode
	 * prepareForClearDisplay(), die von Operator- Buttons wie AddButtonAction
	 * aufgerufen wird), so wird die vorher dargestellte Zahl gelöscht,
	 * andernfalls wird die Zahl der vorher dargestellten Zahl hinzugefügt.
	 * 
	 * @see de.uni_koeln.spinfo.calculator.operationbuttons.AddButtonAction
	 * @param number
	 */
	public static void appendNumber(int number) {
		if (clearBeforeAppendNumber) {
			getDisplay().setText("");
			clearBeforeAppendNumber = false;
		}
		String text = getDisplay().getText() + number;
		getDisplay().setText(text);
	}

	/**
	 * Gibt die aktuell dargestellte Zahl als Integer zurück. Diese Methode wird
	 * von der Methode actionPerformed in der Klasse AbstractButtonAction
	 * aufgerufen, um den zweiten der beiden notwendigen Parameter für die
	 * Ausführung einer Taschenrechner-Operation zu erhalten (der erste
	 * Parameter (die "alte" Zahl) wird in einer statischen Variable in der
	 * Klasse AbstractButtonAction gespeichert).
	 * 
	 * @see de.uni_koeln.spinfo.calculator.operationbuttons.AbstractButtonAction
	 * @return den Wert, der aktuell im Display dargestellt wird
	 */
	public static Integer getValue() {
		String valueAsString = getDisplay().getText();
		return Integer.parseInt(valueAsString);
	}

	/**
	 * Zeigt die übergebene Zahl im Display an. Diese Methode muss von
	 * Operator-Actions wie bspw. AddButtonAction aufgerufen werden!
	 * 
	 * @see de.uni_koeln.spinfo.calculator.operationbuttons.AddButtonAction
	 * @param value
	 */
	public static void setValue(long value) {
		getDisplay().setText("" + value);
	}

	/**
	 * Bereitet das Display auf "Löschen bei der Eingabe der nächsten Zahl" vor.
	 * Diese Methode muss von Operator-Actions wie bspw. AddButtonAction
	 * aufgerufen werden!
	 * 
	 * @see de.uni_koeln.spinfo.calculator.operationbuttons.AddButtonAction
	 */
	public static void prepareForClearDisplay() {
		clearBeforeAppendNumber = true;
	}

}
