
public class Intervall {
	
	Integer addiereVonBis(Integer von, Integer bis) {
		Integer ergebnis = von;	// setze ergebnis auf Wert von "von"
		
		if (von == bis){		// wenn von == bis,
			ergebnis += bis;	// dann addiere beide
		}
		
		while (von < bis){		// solange von < bis
			von++;				// erhöhe von um 1,
			ergebnis += von;	// addiere von zum ergebnis
		}
		
		return ergebnis;		// gib ergebnis zurück
	}

}
