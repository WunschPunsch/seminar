package de.uni_koeln.info.java.seminar.data;

import java.util.Date;

public class Kaese extends Produkt implements Lebensmittel {

	private int referenceGrams;
	private Date haltbarkeit;

	public Kaese(String name, int preisPerMenge, int referenceGrams, int menge,
			Date bis) {
		super(name, preisPerMenge, menge);
		setHaltbarkeit(bis);
		setReferenceGrams(referenceGrams);
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
	public void setReferenceGrams(int refGramms) {
		this.referenceGrams = refGramms;

	}

	@Override
	public int getReferenceGrams() {
		return referenceGrams;
	}

}
