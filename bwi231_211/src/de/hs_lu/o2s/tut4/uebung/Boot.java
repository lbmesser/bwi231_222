package de.hs_lu.o2s.tut4.uebung;

public class Boot {

	private int gewicht, sitze, maxKnoten;
	private double laenge, breite, hoehe;

	public Boot(int gewicht, int sitze, int maxKnoten, double laenge, double breite, double hoehe) {
		this.gewicht = gewicht;
		this.sitze = sitze;
		this.maxKnoten = maxKnoten;
		this.laenge = laenge;
		this.breite = breite;
		this.hoehe = hoehe;
	}

	public int getGewicht() {
		return this.gewicht;
	}

	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}

	public int getSitze() {
		return this.sitze;
	}

	public void setSitze(int sitze) {
		this.sitze = sitze;
	}

	public int getMaxKnoten() {
		return this.maxKnoten;
	}

	public void setMaxKnoten(int maxKnoten) {
		this.maxKnoten = maxKnoten;
	}

	public double getLaenge() {
		return this.laenge;
	}

	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}

	public double getBreite() {
		return this.breite;
	}

	public void setBreite(double breite) {
		this.breite = breite;
	}

	public double getHoehe() {
		return this.hoehe;
	}

	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}

}
