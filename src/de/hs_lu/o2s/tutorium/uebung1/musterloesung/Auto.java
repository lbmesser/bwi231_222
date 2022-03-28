package de.hs_lu.o2s.tutorium.uebung1.musterloesung;

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
		super();
		this.kennzeichen = kennzeichen;
		this.tankinhalt = tankinhalt;
		this.verbrauch = verbrauch;
		this.kilometerstand = kilometerstand;
		this.besitzer = besitzer;
	}

	public String getKennzeichen() {
		return kennzeichen;
	}

	public void setKennzeichen(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}

	public double getTankinhalt() {
		return tankinhalt;
	}

	public void setTankinhalt(double tankinhalt) {
		this.tankinhalt = tankinhalt;
	}

	public double getVerbrauch() {
		return verbrauch;
	}

	public void setVerbrauch(double verbrauch) {
		this.verbrauch = verbrauch;
	}

	public double getKilometerstand() {
		return kilometerstand;
	}

	public void setKilometerstand(double kilometerstand) {
		this.kilometerstand = kilometerstand;
	}

	public Person getBesitzer() {
		return besitzer;
	}

	public void setBesitzer(Person besitzer) {
		this.besitzer = besitzer;
	}

	public String toString() {
		String result = "";
		if (this.isZugelassen())
			result = "\nKilometerstand: " + this.kilometerstand + "\nVerbrauch: " + this.verbrauch + "\nKennzeichen: "
					+ this.kennzeichen + "\nBesitzer: " + this.besitzer;
		else
			result = "Achtung, Auto ist nicht zugelassen.";
		return result;
	}

	private boolean isZugelassen() {
		if (this.besitzer != null && this.kennzeichen != null)
			return true;
		return false;
	}

}
