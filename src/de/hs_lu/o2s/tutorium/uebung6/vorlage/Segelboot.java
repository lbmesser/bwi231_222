package de.hs_lu.o2s.tutorium.uebung6.vorlage;

public class Segelboot extends Boot {

	private double segelFlaeche;
	private Rettungsboot rettungsboot;

	public Segelboot(String name, double preis, double segelFlaeche) {
		super(name, preis);
		this.segelFlaeche = segelFlaeche;
	}

	public double getSegelFlaeche() {
		return this.segelFlaeche;
	}

	public void setSegelFlaeche(double segelFlaeche) {
		this.segelFlaeche = segelFlaeche;
	}

	public Rettungsboot getRettungsboot() {
		return this.rettungsboot;
	}

	public boolean hasRettungsboot() {
		return (this.getRettungsboot() != null);
	}

	public void setRettungsboot(Rettungsboot rettungsboot) {
		this.rettungsboot = rettungsboot;
	}

}
