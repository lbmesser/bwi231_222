package de.hs_lu.o2s.o2sprobe.computer;

public class PC {
	
	private int speicher;

	/**
	 * @return the speicher
	 */
	public int getSpeicher() {
		return speicher;
	}

	/**
	 * @param speicher the speicher to set
	 */
	public void setSpeicher(int speicher) {
		this.speicher = speicher;
	}

	public PC(int speicher) {
		super();
		this.speicher = speicher;
	}
	
	public String toString() {
		return "PC mit Speicher " + this.speicher;
	}

}
