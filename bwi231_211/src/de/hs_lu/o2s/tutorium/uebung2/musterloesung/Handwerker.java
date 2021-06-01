package de.hs_lu.o2s.tutorium.uebung2.musterloesung;

public class Handwerker extends Mitarbeiter {

	static double steuersatz = 0.35;

	public Handwerker(double jahresBruttoGehalt) {
		super(jahresBruttoGehalt);
	}

	public int berechneNettoGehalt() {
		int nettoGehalt = (int) Math.round(this.getJahresBruttoGehalt() * (1 - steuersatz));
		return nettoGehalt;
	}
}
