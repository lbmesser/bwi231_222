package de.hs_lu.o2s.tutorium.tut3.ueb;

public class Dozent extends Person implements Hochschulangehoeriger {

	private int personalNummer;
	private String fachbereich;

	public Dozent(String name, String geburtsdatum) {
		super(name, geburtsdatum);
	}

	public Dozent(String name, String geburtsdatum, int personalNummer, String fachbereich) {
		super(name, geburtsdatum);
		this.setPersonalNummer(personalNummer);
		this.setFachbereich(fachbereich);
	}

	public int getPersonalNummer() {
		return this.personalNummer;
	}

	public void setPersonalNummer(int personalNummer) {
		this.personalNummer = personalNummer;
	}

	public String getFachbereich() {
		return this.fachbereich;
	}

	public void setFachbereich(String fachbereich) {
		this.fachbereich = fachbereich;
	}

}
