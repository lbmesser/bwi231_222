package de.hs_lu.o2s.v10.bestellung;

public class Rechnung extends BusinessDocument {

	static int currentNumberRechnung = 1;
	static final String prefixRechnung = "R-";
	
	public Rechnung(Lieferung lieferung) {
		super();
		
		// Uebertrage saemtliche Positionen aus der Lieferung in 
		// die Lieferung
		for (Position pos : lieferung.getPos()) {
			try {
				this.addPosition(pos);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		this.setKunde(lieferung.getKunde());
		
		this.setNr(currentNumberRechnung++);	
		
		this.druckeRechnung();	
			
	}
	
	@Override
	public BusinessDocument triggerNextStep() {
		return null;
	}
	
	public void druckeRechnung() {
		System.out.println();
		System.out.println("---------------- DRUCK RECHNUNG --------------------");
		System.out.println(this);
		System.out.println("Rechnungsanschrift: " + this.getKunde().getRechnungsAdresse());
		System.out.println("---------------- ENDE DRUCK RECHNUNG ---------------");
	}
	
	public String getPrefix() {
		return prefixRechnung;
	}

}
