package de.hs_lu.o2s.ueb.ue8.huehner;

public class Ei {
	
	private String farbe;
	private double groesse;
	
	
	
	/**
	 * Konstruktor zum Anlegen eines Eis
	 * @param farbe Farbe des Eis (String)
	 * @param groesse Groesse des Eis (double)
	 */
	public Ei(String farbe, double groesse) {
		super();
		this.farbe = farbe;
		this.groesse = groesse;
	}
	
	/**
	 * Ausgabe des Eis als String
	 */
	public String toString(){
		return "Farbe " + this.getFarbe() +
				" und Groesse " + this.getGroesse();
	}
	
	
	
	
	
	// --------- Get-Set Methoden (Standard) ----------
	
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	
	public double getGroesse() {
		return groesse;
	}
	public void setGroesse(double groesse) {
		this.groesse = groesse;
	}
	
	
}
