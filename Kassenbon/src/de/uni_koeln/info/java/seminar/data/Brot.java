package de.uni_koeln.info.java.seminar.data;

import java.util.Date;

public class Brot extends Produkt implements Lebensmittel {

	private int referenceGrams;
	private Date haltbarkeit;

	public Brot(String name, int preis, int refGrams, int menge, Date bis) {
		super(name, preis, menge);
		setReferenceGrams(refGrams);
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
	public void setReferenceGrams(int refGrams) {
		this.referenceGrams = refGrams;

	}

	@Override
	public int getReferenceGrams() {
		return referenceGrams;
	}

}
