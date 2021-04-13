package de.hs_lu.o2s.tut2.uebung;

public class Handwerker extends Mitarbeiter {

	static double steuersatz = 0.35;

	public Handwerker(double jahresBruttoGehalt) {
		super(jahresBruttoGehalt);
	}

	public int berechneNettoGehalt() {
		int nettoBetrag = (int) Math.round(this.getJahresBruttoGehalt() * (1 - steuersatz));
		return nettoBetrag;
	}
}
