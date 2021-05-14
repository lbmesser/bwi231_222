package de.hs_lu.o2s.v10.bestellung;

public class Bestellung extends BusinessDocument {

	static int currentNumberBestellung = 1;
	static final String prefixBestellung = "B-";
	
	public Bestellung(Kunde kunde) {
		super(kunde);  // vertikaler Konstruktoraufruf	
		this.setNr(currentNumberBestellung++);
	}

	@Override
	public BusinessDocument triggerNextStep() throws Exception {
		// soll ein Objekt vom Type Lieferung
		// die Lieferung soll die Positionen aus der Bestellung
		// komplett �bernehmen
		
		if(this.isReady()) {
			Lieferung lieferung = new Lieferung(this);
			return lieferung;
		}
		else {
			throw new Exception(this.getClass().getSimpleName() + " ist noch nicht fertig. Naechster Schritt noch nicht moeglich.");
		}
	}
	
	public String getPrefix() {
		return prefixBestellung;
	}
}
