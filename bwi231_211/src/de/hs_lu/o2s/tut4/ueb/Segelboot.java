package de.hs_lu.o2s.tut4.ueb;

public class Segelboot extends Boot {

	private double gesamtSegelflaeche;

	public Segelboot(int gewicht, int sitze, int maxKnoten, double laenge, double breite, double hoehe,
			double gesamtSegelflaeche) {
		super(gewicht, sitze, maxKnoten, laenge, breite, hoehe);
		this.gesamtSegelflaeche = gesamtSegelflaeche;
	}

	public double getGesamtSegelflaeche() {
		return this.gesamtSegelflaeche;
	}

	public void setGesamtSegelflaeche(double gesamtSegelflaeche) {
		this.gesamtSegelflaeche = gesamtSegelflaeche;
	}

}
