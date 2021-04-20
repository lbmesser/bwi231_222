package de.hs_lu.o2s.tut2.uebung;

public class Hilfskraft extends Handwerker {

	static double steuersatz = 0.25;

	public Hilfskraft(double jahresBruttoGehalt) {
		super(jahresBruttoGehalt);
	}

	public int berechneNettoGehalt() {
		if (this.getJahresBruttoGehalt() < 10000)
			return (int) this.getJahresBruttoGehalt();
		int nettoBetrag = (int) Math.round(this.getJahresBruttoGehalt() * (1 - steuersatz));
		return nettoBetrag;
	}

}
