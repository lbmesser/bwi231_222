package de.hs_lu.o2s.tut8.uebung;

public class Auto extends Fahrzeug {

	private String karosserieform;

	public Auto(Motor motor, double hoechsgeschwindigkeit, double zulaessigeGesamtmasseInTonnen, int sitzplaetze,
			String karosserieform) {
		super(motor, hoechsgeschwindigkeit, zulaessigeGesamtmasseInTonnen, sitzplaetze);
		this.karosserieform = karosserieform;
	}

	public String getKarosserieform() {
		return this.karosserieform;
	}

	public void setKarosserieform(String karosserieform) {
		this.karosserieform = karosserieform;
	}

	@Override
	public String toString() {
		String result = this.getClass().getSimpleName() + " hat eine " + this.getKarosserieform()
				+ " Karosserie, einen " + this.getMotor() + " Motor, eine Hoechstgeschwindigkeit von "
				+ this.getHoechsgeschwindigkeit() + ", eine zulaessigen Gesamtmasse in Tonnen von "
				+ this.getZulaessigeGesamtmasseInTonnen() + " und " + this.getSitzplaetze() + " Sitzplaetze";
		return result;
	}
	
	
	

}
