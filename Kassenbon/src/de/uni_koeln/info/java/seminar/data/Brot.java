package de.uni_koeln.info.java.seminar.data;

import java.util.Date;

public class Brot extends Produkt implements Lebensmittel {

	private int gramm;
	private Date haltbarkeit;

	public Brot(int preis, int gramm, String name, Date bis, int stueckeZahl) {
		super(preis, name, stueckeZahl);
		setGewicht(gramm);
		setHaltbarkeit(bis);
	}

	@Override
	public void setHaltbarkeit(Date haltbarkeit) {
		this.haltbarkeit = haltbarkeit;
	}

	@Override
	public Date getHaltbarkeit() {
		return haltbarkeit;
	}

	@Override
	public void setGewicht(int gramm) {
		this.gramm = gramm;
	}

	@Override
	public int getGewicht() {
		return gramm;
	}

}
