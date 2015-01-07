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

		Kaese kaese = new Kaese(10, 1, "weichkäse", new Date(), 1);
		Wurst wurst = new Wurst(30, 90, "mett", new Date(), 3);
		Dvd dvd = new Dvd(16, "Der unglaubliche Hulk", 1);
		Brot brot = new Brot(5, 1, "Vollkorn", new Date(), 2);

		Warenkorb warenkorb = new Warenkorb(150);

		warenkorb.addProdukt(kaese);
		warenkorb.addProdukt(wurst);
		warenkorb.addProdukt(dvd);
		warenkorb.addProdukt(brot);
		
		// TODO: An der Kasse bezahlen....
		// TODO: Quitung auf der Konsole ausgeben... 

	}

}
