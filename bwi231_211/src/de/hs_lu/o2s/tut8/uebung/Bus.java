package de.hs_lu.o2s.tut8.uebung;

public class Bus extends Fahrzeug implements Nutzfahrzeuge {

	private int stehplaetze;

	public Bus(Motor motor, double hoechsgeschwindigkeit, double zulaessigeGesamtmasseInTonnen, int sitzplaetze,
			int stehplaetze) {
		super(motor, hoechsgeschwindigkeit, zulaessigeGesamtmasseInTonnen, sitzplaetze);
		this.stehplaetze = stehplaetze;
	}

	public int getStehplaetze() {
		return this.stehplaetze;
	}

	public void setStehplaetze(int stehplaetze) {
		this.stehplaetze = stehplaetze;
	}

	@Override
	public String toString() {
		String result = this.getClass().getSimpleName() + " hat " + this.getSitzplaetze() + " Sitzplaetze und "
				+ this.getStehplaetze() + " Stehplaetze. Es ist ein" + this.getMotor() + " Motor verbaut und der "
				+ this.getClass().getSimpleName() + " erreicht eine Hoechstgeschwindigkeit von "
				+ this.getHoechsgeschwindigkeit() + ". Die zulaessige Gesamtmasse in Tonnen betraegt "
				+ this.getZulaessigeGesamtmasseInTonnen();
		return result;
	}

	@Override
	public double getReturnOnInvest() {
		return 10;
	}

}
