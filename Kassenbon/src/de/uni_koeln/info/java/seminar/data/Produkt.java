package de.uni_koeln.info.java.seminar.data;


/**
 * 
 * @author matana
 *
 */
public class Produkt {

	private int preis;
	private String name;
	private int stueckZahl;

	public Produkt(int preis, String name, int stueckeZahl) {
		this.preis = preis;
		this.name = name;
		this.stueckZahl = stueckeZahl;
	}

	public int getStueckZahl() {
		return stueckZahl;
	}

	public void setStueckZahl(int stueckZahl) {
		this.stueckZahl = stueckZahl;
	}

	public int getPreis() {
		return preis;
	}

	public void setPreis(int preis) {
		this.preis = preis;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("%s, kostet %s EURO", getName(), getPreis());
	}
}
