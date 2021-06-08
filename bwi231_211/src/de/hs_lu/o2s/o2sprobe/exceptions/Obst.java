package de.hs_lu.o2s.o2sprobe.exceptions;

public class Obst {
	private boolean reif;
	
	public Obst() {
		this.reif = false;
	}

	/**
	 * @return the reif
	 */
	public boolean isReif() {
		return reif;
	}

	/**
	 * @param reif the reif to set
	 */
	public void setReif(boolean reif) {
		this.reif = reif;
	}
	
	public void essen() throws NichtReifException {
		if(isReif()) {
			System.out.println("Lecker");
		} else {
			throw new NichtReifException();
		}
	}

}
