package de.hs_lu.o2s.tutorium.uebung9.vorlage;

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
}
