package de.hs_lu.o2s.tut2.uebung;

public class Mitarbeiter {

	private double jahresBruttoGehalt;
	static double steuersatz = 0.5;

	public Mitarbeiter() {
		this.setJahresBruttoGehalt(30000);
	}

	public Mitarbeiter(double jahresBruttoGehalt) {
		this.setJahresBruttoGehalt(jahresBruttoGehalt);
	}

	public double getJahresBruttoGehalt() {
		return this.jahresBruttoGehalt;
	}

	public void setJahresBruttoGehalt(double jahresBruttoGehalt) {
		this.jahresBruttoGehalt = jahresBruttoGehalt;
	}

	public int berechneNettoGehalt() {
		int nettoBetrag = (int) Math.round(this.getJahresBruttoGehalt() * (1 - steuersatz));
		return nettoBetrag;
	}

	public String toString() {
		double steuern = this.getJahresBruttoGehalt() * steuersatz;
		// Alternativ double steuern =
		// this.getJahresBruttoGehalt()-this.berechneNettogehalt();
		String result = this.getClass().getSimpleName() + " mit Jahresbruttoeinkommen " + this.getJahresBruttoGehalt()
				+ ", zahlt " + steuern + " Steuern.";
		return result;
	}

}
