package tiere;

/**
 * Die Klasse Tier ist abstrakt, weil die Methode sprich() abstrakt definiert sein
 * soll. Subklassen von Tier müssen diese Methode entweder implementieren oder selber
 * als abstrakt definiert sein (wie bspw. Saeugetier).
 * Zusätzlich implementiert Tier das Interface Comparable, so dass sich bspw. Listen von
 * Tieren durch die Methode Collections.sort() sortieren lassen.
 *
 */
public abstract class Tier implements Comparable<Tier> {
	
	// Position des Tieres in einem Koordinatensystem
	int x, y;
	String name;
	int alter;
	
	public Tier(String name, int x, int y, int alter) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.alter = alter;
	}

	/**
	 * Diese Methode bewegt das jeweilige Tier an eine neue Stelle und gibt
	 * true zurück, falls die Bewegung erfolgreich war. In der Standard-Implementation
	 * in der Klasse Tier wird immer true zurückgegeben - sollte in einer
	 * Subklasse eine Bewegung jedoch nicht möglich sein (z.B. weil ein Meerestier
	 * aufs Land bewegt werden soll), könnte hier false zurückgegeben werden.
	 * @param xBewegung
	 * @param yBewegung
	 * @return
	 */
	public boolean bewege(int xBewegung, int yBewegung) {
		x += xBewegung;
		y += yBewegung;
		return true;
	}
	
	/**
	 * Jedes Tier kann ein Geräusch von sich geben (wird jedenfalls hier angenommen).
	 * In der Superklasse aller Tiere kann jedoch nichts implementiert werden, denn
	 * DAS Tier-Geräusch gibt es nicht... also wird hier einfach null zurückgegeben.
	 */
	public abstract String sprich();
	
	public void test() {
		String x = sprich();
		System.out.println("Länge des Satzes: " + x.length());
	}

	public int compareTo(Tier o) {
		Tier anderesTier = (Tier) o;
		return this.name.compareTo(anderesTier.name);
	}

	public String getName() {
		return name;
	}
	
	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	@Override
	public String toString(){
		return getName() + "(" + getAlter() + "): \"" + sprich() + "\"";
	}
	
}
