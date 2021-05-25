package de.hs_lu.o2s.tut8.uebung;

public class Motor {

	private int hubraum;
	private double leistung;
	private String kraftstoff;

	public Motor(int hubraum, double leistung, String kraftstoff) {
		this.hubraum = hubraum;
		this.leistung = leistung;
		this.kraftstoff = kraftstoff;
	}

	public int getHubraum() {
		return this.hubraum;
	}

	public void setHubraum(int hubraum) {
		this.hubraum = hubraum;
	}

	public double getLeistung() {
		return this.leistung;
	}

	public void setLeistung(double leistung) {
		this.leistung = leistung;
	}

	public String getKraftstoff() {
		return this.kraftstoff;
	}

	public void setKraftstoff(String kraftstoff) {
		this.kraftstoff = kraftstoff;
	}

	@Override
	public String toString() {
		return "Motor [hubraum=" + hubraum + ", leistung=" + leistung + ", kraftstoff=" + kraftstoff + "]";
	}
}
