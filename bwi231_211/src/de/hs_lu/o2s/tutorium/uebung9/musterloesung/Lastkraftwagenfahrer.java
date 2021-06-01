package de.hs_lu.o2s.tutorium.uebung9.musterloesung;

public class Lastkraftwagenfahrer extends Mitarbeiter {

	private String fuehrerscheinKlasse;

	public Lastkraftwagenfahrer(String mitarbeiternummer, String name, String fueherscheinKlasse) {
		super(mitarbeiternummer, name);
		this.fuehrerscheinKlasse = fueherscheinKlasse;
	}

	public String getFuehrerscheinKlasse() {
		return this.fuehrerscheinKlasse;
	}

	public void setFuehrerscheinKlasse(String fuehrerscheinKlasse) {
		this.fuehrerscheinKlasse = fuehrerscheinKlasse;
	}

	@Override
	public String toString() {
		return "Lastkraftwagenfahrer [fuehrerscheinKlasse=" + fuehrerscheinKlasse + "]";
	}

}
