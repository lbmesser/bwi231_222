package de.hs_lu.o2s.v3.cardgames;

import java.lang.reflect.Array;

public class Spielkarte {
	/**
	 * Farbe der Karte (Kreuz, Pik, Herz, Karo)
	 */
	private String farbe;
	
	/**
	 * Wert der Karte (2,3,...,10, Bube, Dame, König, As, Joker)
	 */
	private String wert;
	
	/*
	 * Konstruktor, mit den Übergabeparametern Farbe und Wert
	 */
	public Spielkarte(String farbe, String wert) {
		this.farbe = farbe;
		this.wert = wert;
	}
	
	
	public Spielkarte() {
		// Ausgabe, wenn ein Objekt erzeugt wird ohne die Parameter wert und farbe
		System.out.println("Achtung, dies ist ein Spielkarte ohne Farbe und Wert.");
	}
	
	// Aufruf des Konstruktors Spielkarte(String farbe, String wert) über this(...)
	public Spielkarte(String farbe) {
		this(farbe, "dummy");
	}
	
	/**
	 * Gibt die Spielkarte als String aus
	 */
	public String toString() {
		String myString = "Spielkarte mit der Farbe " + farbe + " und dem Wert " + wert + ".";
		return myString;		
	}
	
	/**
	 * Gibt die Spielkarte als kurzen String aus
	 * Bsp: Karo As
	 */
	public String toStringKurz() {
		String myString = farbe + " " + wert;
		return myString;		
	}
	
	/**
	 * Methode die nur den Befehl enthält, die Spielkarte auf der Konsole auszugeben.
	 */
	public void druckDich() {
		System.out.println(this.toString());
	}
	
	/**
	 * Methode, die farbe zurückgibt
	 */
	public String getFarbe() {
		return this.farbe;
	}
	
	/**
	 * Methode, die wert zurückgibt
	 */
	public String getWert() {
		return this.wert;
	}
	
	/**
	 * Methode, die Punktwert zurückgibt
	 */
	public int getPunktwert() {
		int myVal = 0;
		String myWert = this.getWert(); // Bsp: "dame"
		
		if(myWert.equals("2")) myVal = 2;
		if(myWert.equals("3")) myVal = 3;
		if(myWert.equals("4")) myVal = 4;
		if(myWert.equals("5")) myVal = 5;
		if(myWert.equals("6")) myVal = 6;
		if(myWert.equals("7")) myVal = 7;
		if(myWert.equals("8")) myVal = 8;
		if(myWert.equals("9")) myVal = 9;
		if(myWert.equals("10")) myVal = 10;
		if(myWert.equals("bube")) myVal = 2;
		if(myWert.equals("dame")) myVal = 3;
		if(myWert.equals("koenig")) myVal = 4;
		if(myWert.equals("as")) myVal = 11;
		
		return myVal;
	}
	
	// eine Methode "setFarbe(String farbe)", die die Farbe der Spielkarte ändert,
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	
	// eine Methode "setWert(String wert)", die den Wert der Spielkarte ändert,
	public void setWert(String wert) {
		this.wert = wert;
	}
	
	/**
	 * eine Methode toString(boolean kurz) mit booleschem Eingabeparameter kurz, so dass
		für kurz == true die Methode toStringKurz() ausgeführt wird,
		für kurz == false die normale Methode toString() ausgeführt wird.
	 */
	// Sichtbarkeit + Rückgabewert + Methodenname (Eingabeparameter)
	public String toString(boolean kurz) {
		String rueckgabe;
		if(kurz == true) {
			rueckgabe = this.toStringKurz();
		} else {
			rueckgabe = this.toString();
		}
		return rueckgabe;
	}
	
	public void toString2(boolean kurz) {
		if(kurz == true) {
			System.out.println(this.toStringKurz());
		} else {
			System.out.println(this.toString());
		}
	}
	
}
