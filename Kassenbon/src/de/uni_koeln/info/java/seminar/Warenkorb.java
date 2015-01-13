package de.uni_koeln.info.java.seminar;

import de.uni_koeln.info.java.seminar.data.Lebensmittel;
import de.uni_koeln.info.java.seminar.data.Produkt;

/**
 * 
 * @author matana
 *
 */
public class Warenkorb {

	private Produkt[] produkte = new Produkt[2];
	private double cashMoney;
	private int nextElement = 0;
	private double zwischenSumme = 0;
	private double preisPerRefGramm;

	public Warenkorb(int cashMoney) {
		this.cashMoney = cashMoney;
	}

	public void addProdukt(Produkt produkt) {

		// Are we handling with Lebensmittel?Ï
		if (produkt instanceof Lebensmittel) {
			preisPerRefGramm = produkt.getPreisPerMenge() * produkt.getMenge()
					/ ((Lebensmittel) produkt).getReferenceGrams();
			if (zwischenSumme + preisPerRefGramm > cashMoney) {

				System.out
						.println("Sie haben nicht mehr genug Geld zum Einkaufen...Legen Sie das letzte Produkt "
								+ produkt.getName() + " weg");

			} else {
				add(produkt);
				zwischenSumme += preisPerRefGramm;
				System.out.println("Zwischensumme: " + zwischenSumme);

			}

		}

		else {

			if ((zwischenSumme + produkt.getPreisPerMenge()) > cashMoney) {
				System.out
						.println("Sie haben nicht mehr genug Geld zum Einkaufen...Legen Sie das letzte Produkt "
								+ produkt.getName() + " weg");

			} else {

				add(produkt);
				zwischenSumme += produkt.getPreisPerMenge();
				System.out.println("Zwischensumme: " + zwischenSumme);

			}
		}

	}

	private void resize() {
		Produkt[] tmp = new Produkt[produkte.length * 2];
		System.arraycopy(produkte, 0, tmp, 0, produkte.length);
		produkte = tmp;
	}

	private boolean isSpaceAvailable() {
		if (nextElement == produkte.length)
			return false;
		else
			return true;
	}

	private void add(Produkt produkt) {
		if (!isSpaceAvailable()) {
			resize();
		}
		produkte[nextElement] = produkt;
		nextElement++;
		System.out.println(produkt.getName() + " wurde hinzugefügt");

	}

	public void bezahlen() {

		System.out.println("Sie haben folgende Produkte gekauft: ");

		System.out.format("%30s %5s %15s  %10s %n", "Produkt", "Menge", "@",
				"Preis");
		for (Produkt p : produkte) {

			if (p != null) {

				String name = p.getName();
				int menge = p.getMenge();
				double preisPerMenge = p.getPreisPerMenge();

				if (p instanceof Lebensmittel) {

					int referenceGrams = ((Lebensmittel) p).getReferenceGrams();

					System.out.format("%30s %5s %15s  %10s %n", name, menge,
							preisPerMenge + " EUR X " + referenceGrams, menge
									* preisPerMenge / referenceGrams + " EUR");
				} else {

					System.out.format("%30s %5s %15s  %10s %n", name, menge,
							preisPerMenge + " EUR", menge * preisPerMenge
									+ " EUR");

				}

			}
		}
		System.out.format("%30s %5s %15s %10s %n", "", "", "", "");

		System.out.format("%30s %5s %15s %10s %n", "TOTAL", "", "",
				zwischenSumme + " EUR");

		System.out.format("%30s %5s %15s %10s %n", "GEGEBEN", "", "", cashMoney
				+ " EUR");

		// update cash
		cashMoney = cashMoney - zwischenSumme;

		System.out.format("%30s %5s %15s %10s %n", "WECHSELGELD", "", "",
				cashMoney + " EUR");

	}
}
