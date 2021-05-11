package de.hs_lu.o2s.v9.collections;

public class Spielkarte {

	/**
	 * Farbe der Karte (Kreuz, Pik, Herz, Karo)
	 */
	private String farbe;
	
	/**
	 * Wert der Karte (2,3,...,10, Bube, Dame, König, As, Joker)
	 */
	private String wert;
	
	/**
	 * Konstruktor zum Erzeugen der Spielkarte
	 * @param farbe als String
	 * @param wert als String
	 */
	public Spielkarte(String farbe, String wert) {
		this.farbe = farbe;
		this.wert = wert;
	}
	
	public Spielkarte() {
		System.out.println("Achtung diese Spielkarte hat noch keine Farbe und keinen Wert");
	}
	
	public Spielkarte(String farbe) {
		this(farbe, "musterwert"); // Horizontaler Konstruktoraufruf
	}
	
	/**
	 * Gibt die Spielkarte als String zurück
	 * z.B. "Spielkarte mit Farbe kreuz und Wert as"
	 */
	public String toString() {
		String myString = "Spielkarte mit Farbe " + this.farbe + " und Wert " + this.wert;
		return myString; 
	}
	
	/**
	 * Gibt die Spielkarte als kurzen String zurück, z.B. "kreuz as"
	 */
	public String toStringKurz() {
		return this.farbe + " " + this.wert;
	}

	public String toString(boolean kurz) {
		if (kurz == true) {
			return this.farbe + " " + this.wert;
		} else {
			return "Spielkarte mit Farbe " + this.farbe + " und Wert " + this.wert;
		}
	}
	
	
	/**
	 * Ausgabe der Spielkarte auf der Konsole
	 */
	public void druckDich() {
		System.out.println(this.toString());
	}
	
	public int getPunktwert() {
		int myPunktwert = 0;
		String myWert = this.wert;
		
		/*
		if(myWert.equals("2")) {
			myPunktwert = 2;
		}
		*/
		if(myWert.equals("2")) myPunktwert = 2;
		if(myWert.equals("3")) myPunktwert = 3;
		if(myWert.equals("4")) myPunktwert = 4;
		if(myWert.equals("5")) myPunktwert = 5;
		if(myWert.equals("6")) myPunktwert = 6;
		if(myWert.equals("7")) myPunktwert = 7;
		if(myWert.equals("8")) myPunktwert = 8;
		if(myWert.equals("9")) myPunktwert = 9;
		if(myWert.equals("10")) myPunktwert = 10;
		if(myWert.equals("bube")) myPunktwert = 2;
		if(myWert.equals("dame")) myPunktwert = 3;
		if(myWert.equals("koenig")) myPunktwert = 4;
		if(myWert.equals("as")) myPunktwert = 11;
		
		return myPunktwert;
	}

	/**
	 * @return the farbe
	 */
	public String getFarbe() {
		return farbe;
	}

	/**
	 * @param farbe the farbe to set
	 */
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	/**
	 * @return the wert
	 */
	public String getWert() {
		return wert;
	}

	/**
	 * @param wert the wert to set
	 */
	public void setWert(String wert) {
		this.wert = wert;
	}

	public boolean equals(Spielkarte otherCard) {
		if(!this.getFarbe().equals(otherCard.getFarbe())) {
			return false;
		} else if(!this.getWert().equals(otherCard.getWert())) {
			return false;
		} else {
			return true;
		}
	}
	
	public Spielkarte clone() {
		return new Spielkarte(this.farbe, this.wert);
	}
}
