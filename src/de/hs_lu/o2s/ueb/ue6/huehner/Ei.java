// Keine Punkte, wurde bereits so zur Verfügung gestellt.
package de.hs_lu.o2s.ueb.ue6.huehner;

public class Ei {
	
	String farbe;
	Double groesse;
	
	
	public Ei() {
		
	}
	
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
		return "Ei mit Farbe " + this.getFarbe() +
				" und Groesse " + this.getGroesse();
	}
	
	
	
	
	
	// --------- Get-Set Methoden (Standard) ----------
	
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	
	public Double getGroesse() {
		return groesse;
	}
	public void setGroesse(double groesse) {
		this.groesse = groesse;
	}
	
	
}
