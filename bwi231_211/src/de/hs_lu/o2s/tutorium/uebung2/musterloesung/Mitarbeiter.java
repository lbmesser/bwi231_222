package de.hs_lu.o2s.tutorium.uebung2.musterloesung;

public abstract class Mitarbeiter {

	static double steuersatz = 0.5;
	private double jahresBruttoGehalt;

	public Mitarbeiter() {
		this.setJahresBruttoGehalt(30000);
	}
	
	public Mitarbeiter(double jahresBruttoGehalt) {
		this.setJahresBruttoGehalt(jahresBruttoGehalt);
	}

	public int berechneNettoGehalt() {
		int nettoGehalt = (int) Math.round(this.getJahresBruttoGehalt() * (1 - steuersatz));
		return nettoGehalt;
	}

	public String toString() {
		double steuern = this.getJahresBruttoGehalt() - this.berechneNettoGehalt();
		String result = this.getClass().getSimpleName() + " mit Jahresbruttoeinkommen " + this.getJahresBruttoGehalt()
				+ ", zahlt " + steuern + " Steuern.";
		return result;
	}

	public double getJahresBruttoGehalt() {
		return this.jahresBruttoGehalt;
	}

	public void setJahresBruttoGehalt(double jahresBruttoGehalt) {
		this.jahresBruttoGehalt = jahresBruttoGehalt;
	}

}
