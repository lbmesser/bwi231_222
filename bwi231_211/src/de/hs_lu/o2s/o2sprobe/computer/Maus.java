package de.hs_lu.o2s.o2sprobe.computer;

public class Maus {
	
	private PC angeschlossenAn;

	/**
	 * @return the angeschlossenAn
	 */
	public PC getAngeschlossenAn() {
		return angeschlossenAn;
	}

	/**
	 * @param angeschlossenAn the angeschlossenAn to set
	 */
	public void setAngeschlossenAn(PC angeschlossenAn) {
		this.angeschlossenAn = angeschlossenAn;
	}

	public Maus(PC angeschlossenAn) {
		super();
		this.angeschlossenAn = angeschlossenAn;
	}
	
	public Maus() {
		this.angeschlossenAn = null;
	}
	
	public String toString() {
		if(this.getAngeschlossenAn() == null) {
			return "Maus nicht angeschlossen";
		} else {
			return "Maus angeschlossen an " + this.getAngeschlossenAn().toString();
		}
	}

}
