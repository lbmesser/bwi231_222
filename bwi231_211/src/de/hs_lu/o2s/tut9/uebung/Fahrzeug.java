package de.hs_lu.o2s.tut9.uebung;

public abstract class Fahrzeug {

	private Motor motor;
	private double hoechsgeschwindigkeit, zulaessigeGesamtmasseInTonnen;
	private int sitzplaetze;

	public Fahrzeug(Motor motor, double hoechsgeschwindigkeit, double zulaessigeGesamtmasseInTonnen, int sitzplaetze) {
		this.motor = motor;
		this.hoechsgeschwindigkeit = hoechsgeschwindigkeit;
		this.zulaessigeGesamtmasseInTonnen = zulaessigeGesamtmasseInTonnen;
		this.sitzplaetze = sitzplaetze;
	}

	public Motor getMotor() {
		return this.motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public double getHoechsgeschwindigkeit() {
		return this.hoechsgeschwindigkeit;
	}

	public void setHoechsgeschwindigkeit(double hoechsgeschwindigkeit) {
		this.hoechsgeschwindigkeit = hoechsgeschwindigkeit;
	}

	public double getZulaessigeGesamtmasseInTonnen() {
		return this.zulaessigeGesamtmasseInTonnen;
	}

	public void setZulaessigeGesamtmasseInTonnen(double zulaessigeGesamtmasseInTonnen) {
		this.zulaessigeGesamtmasseInTonnen = zulaessigeGesamtmasseInTonnen;
	}

	public int getSitzplaetze() {
		return this.sitzplaetze;
	}

	public void setSitzplaetze(int sitzplaetze) {
		this.sitzplaetze = sitzplaetze;
	}
}
