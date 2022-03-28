package de.hs_lu.o2s.o2sprobe.bestellung;

public abstract class Bestellung {
	
	private String lieferant;

	/**
	 * @return the lieferant
	 */
	public String getLieferant() {
		return lieferant;
	}

	/**
	 * @param lieferant the lieferant to set
	 */
	public void setLieferant(String lieferant) {
		this.lieferant = lieferant;
	}

	public Bestellung(String lieferant) {
		super();
		this.lieferant = lieferant;
	}
	
	public abstract int getGesamtMenge();
	
	public String toString() {
		return this.getClass().getSimpleName() + " für Lieferant " + this.getLieferant() + " mit Gesamtmenge "
				+ this.getGesamtMenge();
	}

}
