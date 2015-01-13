package de.uni_koeln.info.java.seminar.data;

import java.util.Date;

public class Wurst extends Produkt implements Lebensmittel {

	private Date haltbarkeit;
	private int referenceGrams;

	public Wurst(String name, int preisPerMenge, int refgrams, int menge, Date bis) {
		super(name, preisPerMenge, menge);
		setHaltbarkeit(bis);
		setReferenceGrams(refgrams);
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
