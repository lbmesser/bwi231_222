package de.hs_lu.o2s.tutorium.uebung9.musterloesung;

public class Anhaenger {

	private String anzahlAchsen;
	private String anhaengerArt;

	public Anhaenger(String anzahlAchsen, String anhaengerArt) {
		this.anzahlAchsen = anzahlAchsen;
		this.anhaengerArt = anhaengerArt;
	}

	public String getAnzahlAchsen() {
		return this.anzahlAchsen;
	}

	public void setAnzahlAchsen(String anzahlAchsen) {
		this.anzahlAchsen = anzahlAchsen;
	}

	public String getAnhaengerArt() {
		return this.anhaengerArt;
	}

	public void setAnhaengerArt(String anhaengerArt) {
		this.anhaengerArt = anhaengerArt;
	}

}
