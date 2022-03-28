package de.hs_lu.o2s.tutorium.uebung2.musterloesung;

public class Hilfskraft extends Handwerker {

	public Hilfskraft(double jahresBruttoGehalt) {
		super(jahresBruttoGehalt); // vertikaler Konstruktoraufruf
	}

	public int berechneNettoGehalt() {
		if (this.getJahresBruttoGehalt() < 10000)
			return (int) this.getJahresBruttoGehalt();
		int nettoGehalt = (int) Math.round(this.getJahresBruttoGehalt() * (1 - Handwerker.steuersatz));
		return nettoGehalt;
	}
}
