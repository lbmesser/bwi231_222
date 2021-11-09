package de.hs_lu.o2s.tutorium.uebung2.vorlage;

public abstract class Mitarbeiter {

	static double steuersatz = 0.5;
	private double jahresBruttoGehalt;

	public int berechneNettoGehalt() {
		int nettoGehalt = (int) Math.round(this.getJahresBruttoGehalt() * (1 - steuersatz));
		return nettoGehalt;
	}

	public abstract String toString();

	public double getJahresBruttoGehalt() {
		return this.jahresBruttoGehalt;
	}

	public void setJahresBruttoGehalt(double jahresBruttoGehalt) {
		this.jahresBruttoGehalt = jahresBruttoGehalt;
	}

}
