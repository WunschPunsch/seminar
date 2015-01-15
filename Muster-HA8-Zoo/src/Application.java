import java.util.Collections;
import java.util.Vector;

import tiere.Hund;
import tiere.Katze;
import tiere.Pferd;
import tiere.Tier;


public class Application {
	
	public static void main(String[] args) {
		Vector<Tier> tiere = new Vector<Tier>();
	//	tiere.add(new Tier("Seltsames Tier", 1, 1));
		tiere.add(new Katze("Katze", 2));
		Pferd pferd = new Pferd("Silberpfeil", 3);
		tiere.add(pferd);
		tiere.add(new Hund("Bello", 8));
		tiere.add(new Hund("Alfons", 7));
		
		for(int i = 0; i < tiere.size(); i++) {
			System.out.println("Tier " + i + ": " + tiere.get(i).sprich());
		}
		pferd.test();
		/*
		 * Weil jedes Tier das Interface Comparable implementiert, kann
		 * hier die Hilfsmethode Collections.sort() aufgerufen werden, die
		 * dafür sorgt, dass die Liste der Tiere sortiert wird.
		 */
		Collections.sort(tiere);
		
		for (Tier t : tiere){
			System.out.println(t);
		}
		
		Collections.sort(tiere, new TierAlterComparator());
		
		for (Tier t : tiere){
			System.out.println(t);
		}
		
	}

}
