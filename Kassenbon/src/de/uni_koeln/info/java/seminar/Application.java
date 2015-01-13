package de.uni_koeln.info.java.seminar;

import java.util.Date;

import de.uni_koeln.info.java.seminar.data.Brot;
import de.uni_koeln.info.java.seminar.data.Dvd;
import de.uni_koeln.info.java.seminar.data.Kaese;
import de.uni_koeln.info.java.seminar.data.Wurst;

/**
 * 
 * @author matana
 *
 */
public class Application {

	public static void main(String[] args) {

		Kaese kaese = new Kaese("Weichkässe", 3, 100, 150, new Date());
		Wurst wurst = new Wurst("Mett", 2, 200, 300, new Date());
		Dvd dvd = new Dvd("Der unglaubliche Hulk", 15, 2);
		Brot brot = new Brot("Vollkorn", 4, 1000, 1000, new Date());

		Warenkorb warenkorb = new Warenkorb(150);

		warenkorb.addProdukt(kaese);
		warenkorb.addProdukt(wurst);
		warenkorb.addProdukt(dvd);
		warenkorb.addProdukt(brot);

		warenkorb.bezahlen();
	
	}
}
