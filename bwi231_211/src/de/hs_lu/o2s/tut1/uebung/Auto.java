package de.hs_lu.o2s.tut1.uebung;

public class Auto {

	private String kennzeichen;
	private double tankinhalt, verbrauch, kilometerstand;
	private Person besitzer;

	public Auto() {
		System.out.println("Achtung! Es wurde ein Standard Konstruktor verwendet!");
	}

	public Auto(double tankinhalt, double verbrauch, double kilometerstand, String kennzeichen) {
		this.tankinhalt = tankinhalt;
		this.verbrauch = verbrauch;
		this.kilometerstand = kilometerstand;
		this.kennzeichen = kennzeichen;
	}

	public Auto(String kennzeichen, double tankinhalt, double verbrauch, double kilometerstand, Person besitzer) {
		this.kennzeichen = kennzeichen;
		this.tankinhalt = tankinhalt;
		this.verbrauch = verbrauch;
		this.kilometerstand = kilometerstand;
		this.besitzer = besitzer;
	}

	public String getKennzeichen() {
		return this.kennzeichen;
	}

	public void setKennzeichen(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}

	public double getTankinhalt() {
		return this.tankinhalt;
	}

	public void setTankinhalt(double tankinhalt) {
		this.tankinhalt = tankinhalt;
	}

	public double getVerbrauch() {
		return this.verbrauch;
	}

	public void setVerbrauch(double verbrauch) {
		this.verbrauch = verbrauch;
	}

	public double getKilometerstand() {
		return this.kilometerstand;
	}

	public void setKilometerstand(double kilometerstand) {
		this.kilometerstand = kilometerstand;
	}

	public Person getBesitzer() {
		return this.besitzer;
	}

	public void setBesitzer(Person besitzer) {
		this.besitzer = besitzer;
	}

	@Override
	public String toString() {
		String result = "";
		if (this.besitzer == null || this.kennzeichen == null)
			result = "Achtung, Auto ist nicht zugelassen";
		else
			result = "Kilometerstand: " + this.kilometerstand + "\nVerbrauch: " + this.verbrauch + "\nKennzeichen: "
					+ this.kennzeichen + "\nBesitzer: " + this.besitzer;
		return result;
	}

}
