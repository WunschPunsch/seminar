package de.uni_koeln.info.java.seminar.data;

/**
 * 
 * @author matana
 *
 */
public class Produkt {

	private double preisPerMenge;
	private String name;
	private int menge;

	public Produkt(String name, double preisPerMenge, int menge) {
		this.name = name;
		this.preisPerMenge = preisPerMenge;
		this.menge = menge;
	}

	public int getMenge() {
		return menge;
	}

	public void setMenge(int menge) {
		this.menge = menge;
	}

	public double getPreisPerMenge() {
		return preisPerMenge;
	}

	public void setPreisPerMenge(double preis) {
		this.preisPerMenge = preis;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("%5s %30s %7s EUR", getMenge(), getName(),
				getPreisPerMenge());
	}
}
