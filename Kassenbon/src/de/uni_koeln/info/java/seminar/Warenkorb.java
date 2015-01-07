package de.uni_koeln.info.java.seminar;

import de.uni_koeln.info.java.seminar.data.Produkt;

/**
 * 
 * @author matana
 *
 */
public class Warenkorb {

	private Produkt[] produkte = new Produkt[2];
	private int cashMoney;
	private int nextElement = 0;
	private int zwischenSumme = 0;

	public Warenkorb(int cashMoney) {
		this.cashMoney = cashMoney;
	}

	public boolean addProdukt(Produkt produkt) {
		if ((zwischenSumme + produkt.getPreis()) > cashMoney) {
			System.out
					.println("Sie haben nicht mehr genug Geld zum Einkaufen...Legen Sie das letzte Produkt "
							+ produkt.getName() + " weg");
			return false;
		} else {
			if (!isSpaceAvailable())
				resize();
			else {
				produkte[nextElement] = produkt;
				nextElement++;
				zwischenSumme += produkt.getPreis();
				return true;
			}
		}
		return false;
	}

	private void resize() {
		Produkt[] tmp = new Produkt[produkte.length * 2];
		System.arraycopy(produkte, 0, tmp, 0, tmp.length);
		produkte = tmp;
	}

	private boolean isSpaceAvailable() {
		if (nextElement == produkte.length - 1)
			return false;
		else
			return true;
	}

}
