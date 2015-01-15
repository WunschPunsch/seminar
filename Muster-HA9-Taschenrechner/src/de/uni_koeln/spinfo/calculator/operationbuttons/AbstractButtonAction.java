/*
 * Created on 12.05.2005
 *
 */
package de.uni_koeln.spinfo.calculator.operationbuttons;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;

import de.uni_koeln.spinfo.calculator.CalculatorDisplay;

/**
 * Diese Klasse sollten Sie sich ansehen, denn sie veranschaulicht
 * den Sinn von abstrakten Klassen an einem "echten", sinnvollen Beispiel
 * (im Gegensatz zum Autohaus etc). Außerdem müssen Sie sie als Hausaufgabe
 * ableiten...
 * Jeder der "Operationen-Buttons" wie "+", "-", "*", "/" hat gemeinsame
 * und individuelle Eigenschaften. Gemeinsam ist ihnen beispielsweise,
 * dass sie eine Beschriftung haben, und dass sie zwei Parameter benötigen,
 * um ausgeführt zu werden. Sie unterscheiden sich jedoch darin, <b>wie</b>
 * diese Operationen ausgeführt werden (Addition, Multiplikation etc).
 * Während also Methoden für die Darstellung etc. in dieser Klasse
 * (bzw. in ihrer Superklasse, aber das führt zu tief in Swing) implementiert
 * werden können, sind abgeleitete Klassen dafür verantwortlich, die
 * Operation tatsächlich auszuführen. Aus diesem Grund ist die Methode
 * "executeOperation()" in dieser Klasse abstrakt, so dass sie von jeder
 * abgeleiteten Klasse implementiert werden muss.
 * Die Verbindung von "Mausklick und Ausführung" ist jedoch immer gleich,
 * so dass der Methodenaufruf von "executeOperation()" von dieser Klasse
 * übernommen werden kann.
 * 
 * @author sschwieb
 *
 */
public abstract class AbstractButtonAction extends AbstractAction {

	/**
	 * Ein sinnvoller Einsatz von "static":
	 * Wenn auf einem (einfachen) Taschenrechner ein Operator
	 * gedrückt wird, muss sich der Taschenrechner diesen Operator
	 * und die aktuelle Eingabe "merken", aber erst ausführen, wenn 
	 * der nächste Operator ausgewählt wird, wie in folgendem Beispiel:
	 * 
	 * 15
	 * + // Zahl 15 und Operator "+" "merken"
	 * 12
	 * - // Operator "+" mit den Parameter 15 und 12 aufrufen und
	 *   // das Ergebnis sowie den neuen Operator "merken".
	 * ...
	 * 
	 * Die eingegebene Zahl wird auf der Variablen "valueInMemory"
	 * gespeichert, die als protected deklariert ist, damit sie von
	 * der jeweiligen Operation modfiziert werden kann (siehe Implementation
	 * der executeOperation()-Methode in AddButtonAction und MultiplyButtonAction).
	 * Der eingegebene Operator wird auf der Variablen lastAction
	 * gespeichert (s.u.).
	 */
	protected static Integer valueInMemory = 0;
	
	/**
	 * Ein sinnvoller Einsatz von "static":
	 * Wenn auf einem (einfachen) Taschenrechner ein Operator
	 * gedrückt wird, muss sich der Taschenrechner diesen Operator
	 * "merken", aber erst ausführen, wenn der nächste Operator
	 * ausgewählt wird, wie in folgendem Beispiel:
	 * 
	 * 15
	 * + // Zahl 15 und Operator "+" "merken"
	 * 12
	 * - // Operator "+" mit den Parameter 15 und 12 aufrufen und
	 *   // das Ergebnis sowie den neuen Operator "merken".
	 * ...
	 * 
	 * Der letzte Operator wird auf dieser Variablen gespeichert,
	 * die als "private" deklariert ist, damit nicht versehentlich
	 * eine falsche Operation zugewiesen wird und das Ergebnis falsch
	 * wird.
	 * Die eingegebene Zahl wird auf der Variablen "valueInMemory" (s.o.)
	 * gespeichert
	 */
	private static AbstractButtonAction lastAction = new AddButtonAction();
	
	/**
	 * Der Konstruktor erfordert ein String-Objekt, d.h. Ihre Klasse
	 * <b>muss</b> den Konstruktor der Superklasse mit einem String-
	 * Objekt aufrufen. Dieser String wird dann als Beschriftung der
	 * Taste verwendet. Alternativ können Sie, wenn Sie möchten, auch
	 * den zweiten Konstruktor benutzen, der statt einem Text ein
	 * Icon darstellt.
	 * @param symbol der Text, mit dem die Taste beschriftet werden soll
	 */
	public AbstractButtonAction(String symbol) {
		super(symbol);
	}

	/**
	 * Dieser alternative Konstruktor erfordert ein "ImageIcon"-Objekt,
	 * das Sie zwar noch nicht kennen, das jedoch leicht erzeugt werden 
	 * kann. Das übergebene Icon wird für die Taste benutzt, wie es
	 * mit der "PowerOfX"-Taste geschieht.
	 * Wenn Sie weitere Icons verwenden möchten, sehen Sie sich im
	 * Konstruktor von PowerOfButtonAction an, wie dies gemacht wird.
	 * (Ganz einfach - es handelt sich um eine Zeile Code!)
	 * @param icon das Icon, dass auf der Taste dargestellt werden soll
	 */
	public AbstractButtonAction(ImageIcon icon) {
		super(null,icon);
	}

	/**
	 * Diese Methode wird "von Swing" aufgerufen, wenn der Anwender
	 * auf den entsprechenden Button klickt. Warum, und was der Parameter
	 * bedeutet, kann hier nicht erläutert werden. 
	 * Wichtig ist jedoch, dass diese Methode die (abstrakte) Methode
	 * executeOperation() aufruft, die Sie implementieren müssen.
	 * Auf den ersten Blick mag es seltsam erscheinen, dass hier eine
	 * Methode aufgerufen werden kann, die gar nicht konkret vorliegt,
	 * doch da eine abstrakte Klasse nicht instantiiert werden kann, sondern
	 * nur eine Klasse, die die abstrakten Methoden implementiert, ist
	 * gewährleistet, dass zum Zeitpunkt der Ausführung der Methode diese
	 * auch "vorhanden" ist.
	 */
	public void actionPerformed(ActionEvent e) {
		lastAction.executeOperation(valueInMemory,CalculatorDisplay.getValue());
		CalculatorDisplay.setValue(valueInMemory);	//diese beiden Zeilen wurden aus den
		CalculatorDisplay.prepareForClearDisplay();	//Button-Klassen hierher verschoben (siehe Aufgabe!)
		lastAction = this;
	}
	
	/**
	 * <p>Diese Methode müssen Sie implementieren, damit die entsprechende
	 * Operation auch tatsächlich ausgeführt wird. Ein Beispiel finden
	 * Sie in den bereits von dieser Klasse abgeleiteten Klassen für 
	 * Multiplikation und Addition (auch in diesem Package).
	 * Wenn Sie sich den Sourcecode der Klassen ansehen, werden Sie fest-
	 * stellen, dass diese Klassen äußerst wenig Code enthalten, der zudem
	 * nichts mit der graphischen Benutzeroberfläche zu tun hat.
	 * Dies ist der Sinn von abstrakten Methoden und Klassen: Allgemeine
	 * Funktionalität wird von der spezifischen Funktionalität getrennt,
	 * und nur die spezifische Funktionalität muss tatsächlich implementiert
	 * werden.</p>
	 * <p>Gleichzeitig ist diese Methode ein gutes Beispiel für das Schlüsselwort
	 * "protected", denn es ist nicht notwendig, dass auf diese Methode außerhalb
	 * dieses Packages zugegriffen werden kann - lediglich abgeleitete Klassen
	 * (sowie natürlich diese Klasse) müssen diese Methode kennen und ggf. implementieren.
	 * Dadurch wird vermieden, dass versehentlich an anderer Stelle diese Methode
	 * aufgerufen wird und der Taschenrechner plötzlich unsinnige Ergebnisse
	 * anzeigt.<p>
	 * <p>...</p>
	 */
	protected abstract void executeOperation(Integer firstParam, Integer secondParam);

}
