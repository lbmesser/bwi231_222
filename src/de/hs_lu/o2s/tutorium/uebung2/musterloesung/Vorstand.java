package de.hs_lu.o2s.tutorium.uebung2.musterloesung;

public class Vorstand extends Mitarbeiter {

	public Vorstand(double jahresBruttoEinkommen) {
		super(jahresBruttoEinkommen);
	}

	public int berechneNettoGehalt() {
		int nettoGehalt = (int) Math.round(this.getJahresBruttoGehalt() * (1 - Mitarbeiter.steuersatz));
		if (this.getJahresBruttoGehalt() >= 1000000)
			nettoGehalt -= 100000;
		return nettoGehalt;
	}
}
