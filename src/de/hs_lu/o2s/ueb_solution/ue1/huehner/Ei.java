/*
 * 9 Punkte
 */
package de.hs_lu.o2s.ueb_solution.ue1.huehner;

public class Ei {
	// 2x 0.5 = 1 Punkt
	String farbe;
	double groesse;

	// 2 Punkte
	public Ei(String farbe, double groesse) {
		super();
		this.farbe = farbe;
		this.groesse = groesse;
	}
	
	// 1 Punkt
	public String getFarbe() {
		return farbe;
	}

	// 1 Punkt
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	// 1 Punkt
	public double getGroesse() {
		return groesse;
	}

	// 1 Punkt
	public void setGroesse(double groesse) {
		this.groesse = groesse;
	}
	
	// 2 Punkte
	public String toString() {
		return "Ei mit Farbe " + this.getFarbe() + " und Größe " + this.getGroesse();
	}

}