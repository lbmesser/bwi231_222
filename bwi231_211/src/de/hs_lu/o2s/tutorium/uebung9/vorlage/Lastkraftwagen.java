package de.hs_lu.o2s.tutorium.uebung9.vorlage;

public class Lastkraftwagen extends Fahrzeug {

	private double geladeneNutzlast;

	public Lastkraftwagen(Motor motor, double hoechsgeschwindigkeit, double zulaessigeGesamtmasseInTonnen,
			int sitzplaetze) {
		super(motor, hoechsgeschwindigkeit, zulaessigeGesamtmasseInTonnen, sitzplaetze);
		this.geladeneNutzlast = 0;
	}

	public double getGeladeneNutzlast() {
		return this.geladeneNutzlast;
	}

	public void setGeladeneNutzlast(double geladeneNutzlast) {
		this.geladeneNutzlast = geladeneNutzlast;
	}

}
