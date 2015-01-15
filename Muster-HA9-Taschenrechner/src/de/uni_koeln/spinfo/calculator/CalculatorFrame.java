/*
 * Created on 12.05.2005
 *
 */
package de.uni_koeln.spinfo.calculator;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

import de.uni_koeln.spinfo.calculator.menu.CalculatorMenuBar;
import de.uni_koeln.spinfo.calculator.panels.NumbersPanel;
import de.uni_koeln.spinfo.calculator.panels.OperatorsPanel;

/**
 * In dieser Klasse laufen alle Fäden zusammen - hier werden
 * Menüleiste und die einzelnen Panels erzeugt und kombiniert.
 * Dementsprechend ist diese Klasse etwas unübersichtlich,
 * auch wenn sie nur 4 Methoden enthält... aber diese Methoden
 * enthalten sehr viel Swing-Programmierung.
 * Sie müssen sie sich jedoch auch nicht näher ansehen, denn bzgl.
 * der "Logik" des Taschenrechners passiert hier nichts.
 * 
 * @author sschwieb
 *  
 */
public class CalculatorFrame extends JFrame {

	
	/**
	 * Diese Methode erzeugt die einzelnen Komponenten
	 * des Taschenrechners (Menüleiste, Nummern-Panel,
	 * Operatoren-Panel) und setzt Parameter wie Fenster-
	 * Grüße, Titel etc.
	 *
	 */
	public void createCalculatorComponents() {
		super.setJMenuBar(new CalculatorMenuBar());
		super.setSize(400, 250);
		super.setContentPane(createMainPanel());
		super.setTitle("Taschenrechner");
		prepareWindowBehaviour();
	}

	/**
	 * Hier wird ein "Listener" dem Taschenrechner-Fenster
	 * hinzugefügt. Dies ist ein etwas kompliziertes, aber sehr
	 * leistungsfähiges Konzept, das häufig bei graphischen
	 * Benutzeroberflächen eingesetzt wird und der Kommunikation
	 * von einzelnen "Elementen" der Benutzeroberfläche dient.
	 * <b>Details:</b>
	 * Der hier benutzte WindowListener "CalculatorWindowListener"
	 * "hört" quasi, wenn Sie das Fenster schließen wollen, und führt
	 * die Methode "windowClosing" aus, die wiederum das Dialogfenster
	 * "Beenden bestätigen" anzeigt.
	 */
	private void prepareWindowBehaviour() {
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new CalculatorWindowListener());
		
	}

	/**
	 * Diese Methode erzeugt das Haupt-Panel des Taschenrechners
	 * (blau markiert, wenn Sie die Klassenvariable der
	 * Klasse Application auf "true" setzen).
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel createMainPanel() {
		JPanel mainPanel = new JPanel();
		BoxLayout layout = new BoxLayout(mainPanel, BoxLayout.Y_AXIS);
		mainPanel.setLayout(layout);
		mainPanel.add(createDisplayPanel());
		mainPanel.add(Box.createVerticalStrut(15));
		Box box = Box.createHorizontalBox();
		mainPanel.add(box);
		box.add(Box.createHorizontalStrut(5));
		box.add(new NumbersPanel());
		box.add(Box.createHorizontalStrut(5));
		box.add(Box.createGlue());
		box.add(new OperatorsPanel());
		box.add(Box.createHorizontalStrut(5));
		mainPanel.add(Box.createGlue());
		if(Application.SHOW_PANELS_IN_DIFFERENT_COLORS) {
			box.setBackground(Color.PINK);
			box.setBorder(new LineBorder(Color.PINK));
			mainPanel.setBackground(Color.BLUE);
			mainPanel.setBorder(new LineBorder(Color.BLUE));
		}
		return mainPanel;
	}

	/**
	 * Diese Methode erzeugt das "Display"-Panel des
	 * Taschenrechners.
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel createDisplayPanel() {
		JPanel displayPanel = new JPanel();
		displayPanel.setBackground(Color.WHITE);
		FlowLayout layout = new FlowLayout(FlowLayout.RIGHT);
		displayPanel.setLayout(layout);
		displayPanel.add(CalculatorDisplay.getDisplay(), null);
		return displayPanel;
	}

} 
