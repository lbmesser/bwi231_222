package de.hs_lu.o2s.tutorium.uebung5.musterloesung;

public class Motorboot extends Boot {

	private int maxKW, krafstoffTankGroesse;

	public Motorboot(int gewicht, int sitze, int maxKnoten, double laenge, double breite, double hoehe, int maxKW,
			int kraftstoffTankGroesse) {
		super(gewicht, sitze, maxKnoten, laenge, breite, hoehe);
		this.maxKW = maxKW;
		this.krafstoffTankGroesse = kraftstoffTankGroesse;
	}

	public int getMaxKW() {
		return this.maxKW;
	}

	public void setMaxKW(int maxKW) {
		this.maxKW = maxKW;
	}

	public int getKrafstoffTankGroesse() {
		return this.krafstoffTankGroesse;
	}

	public void setKrafstoffTankGroesse(int krafstoffTankGroesse) {
		this.krafstoffTankGroesse = krafstoffTankGroesse;
	}

}
