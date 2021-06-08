package de.hs_lu.o2s.o2sprobe.bestellung;

public class TerminBestellung extends Bestellung implements Versendbar {
	
	private int lieferzeit;
	private int menge;
	private boolean fertig = false;

	public TerminBestellung(String lieferant) {
		super(lieferant);
	}
	
	public TerminBestellung(String lieferant, int lieferzeit, int menge) {
		this(lieferant);
		this.lieferzeit = lieferzeit;
		this.menge = menge;
	}

	@Override
	public int getGesamtMenge() {
		return this.menge;
	}

	/**
	 * @return the fertig
	 */
	public boolean isFertig() {
		return fertig;
	}

	/**
	 * @param fertig the fertig to set
	 */
	public void setFertig(boolean fertig) {
		this.fertig = fertig;
	}

	@Override
	public void versenden() {
		if(fertigZumVersenden()) {
			System.out.println("Versende: " + this.toString());
		} else {
			System.out.println("TerminBestellung noch nicht fertig.");
		}
	}

	@Override
	public boolean fertigZumVersenden() {
		if (this.isFertig()) {
			return true;
		} else {
			return false;
		}
	}

}
