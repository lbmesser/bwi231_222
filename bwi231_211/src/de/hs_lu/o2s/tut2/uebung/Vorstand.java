package de.hs_lu.o2s.tut2.uebung;

public class Vorstand extends Mitarbeiter {

	public Vorstand(double jahresBruttoGehalt) {
		super(jahresBruttoGehalt);
	}

	public int berechneNettoGehalt() {
		int nettoGehalt = super.berechneNettoGehalt();
		if (this.getJahresBruttoGehalt() >= 1000000) {
			nettoGehalt = nettoGehalt - 100000;
		}
		return nettoGehalt;
	}

}
