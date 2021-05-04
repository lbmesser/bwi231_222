package de.hs_lu.o2s.tut5.uebung;

public class Segelboot extends Boot {

	private double gesamtSegelflaeche;
	private int anzahlKajueten;

	public Segelboot(int gewicht, int sitze, int maxKnoten, double laenge, double breite, double hoehe,
			double gesamtSegelflaeche, int anzahlKajueten) {
		super(gewicht, sitze, maxKnoten, laenge, breite, hoehe);
		this.gesamtSegelflaeche = gesamtSegelflaeche;
		this.anzahlKajueten = anzahlKajueten;
	}

	public double getGesamtSegelflaeche() {
		return this.gesamtSegelflaeche;
	}

	public void setGesamtSegelflaeche(double gesamtSegelflaeche) {
		this.gesamtSegelflaeche = gesamtSegelflaeche;
	}

	public int getAnzahlKajueten() {
		return this.anzahlKajueten;
	}

	public void setAnzahlKajueten(int anzahlKajueten) {
		this.anzahlKajueten = anzahlKajueten;
	}
	
	

}
