package de.uni_koeln.info.java.seminar.data;

import java.util.Date;

public interface Lebensmittel {
	
	public void setHaltbarkeit(Date bis);
	
	public Date getHaltbarkeit();
	
	public void setGewicht(int gramm);
	
	public int getGewicht();

}
