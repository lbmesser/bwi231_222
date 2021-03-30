package de.hs_lu.o2s.ueb.ue2.cardgames;

public class Spielkarte {
	
	/**
	 * Farbe der Karte (Kreuz, Pik, Herz, Karo)
	 */
	String farbe;
	
	/**
	 * Wert der Karte (2, 3, ..., 10, Bube, Dame, K�nig, As, Joker)
	 */
	String wert;  

	/**
	 * Konstruktor ohne Uebergabeparameter - macht keinen Sinn
	 */
	public Spielkarte(){
		System.out.println("Achtung, diese Spielkarte " +
				"hat noch keine Farbe und noch keinen Wert");
	}
	
	/**
	 * Konstruktor mit Parametern - bitte diesen benutzen
	 * @param farbe Farbe der Karte
	 * @param wert Wert der Karte
	 */
	public Spielkarte(String farbe, String wert){
		this.farbe = farbe;
		this.wert = wert;
		//this.init(farbe, wert); // Alternative (aus Exkurs: init-3)
	}
	
	/**
	 * Konstruktor fuer eine Spielkarte, an die nur eine Farbe uebergeben
	 * wird. Fuer den Wert wird dann standardmaessig der String "dummy"
	 * eingetragen.
	 * @param farbe Farbe der neuen Spielkarte
	 */
	public Spielkarte(String farbe) {
		this(farbe, "dummy"); // dies ist ein horizontaler Konstruktor-Aufruf
		//this.init(farbe, "dummy"); // dies ist die Alternative mit der Init-Methode
	}
	
	
	
	
	/**
	 * Gibt den Punktwert der Spielkarte zurueck
	 * @return Punktwert der Karte
	 */
	public int getPunktwert(){
		int myVal = 0;
		String myWert = this.getWert();
		if (myWert.equals("2")) myVal = 2;
		if (myWert.equals("3")) myVal = 3;
		if (myWert.equals("4")) myVal = 4;
		if (myWert.equals("5")) myVal = 5;
		if (myWert.equals("6")) myVal = 6;
		if (myWert.equals("7")) myVal = 7;
		if (myWert.equals("8")) myVal = 8;
		if (myWert.equals("9")) myVal = 9;
		if (myWert.equals("10")) myVal = 10;
		if (myWert.equals("bube")) myVal = 2;
		if (myWert.equals("dame")) myVal = 3;
		if (myWert.equals("koenig")) myVal = 4;
		if (myWert.equals("as")) myVal = 11;
		return myVal;
	}
	
	/**
	 * Initialisiert die Spielkarte mit den uebergebenen Parametern
	 * fuer farbe und wert
	 * @param farbe
	 * @param wert
	 */
	public void init(String farbe, String wert) {
		this.farbe = farbe;
		this.wert = wert;				
	}
	
	/**
	 * Initialisiert die Farbe der Spielkarte. Fuer den Wert wird
	 * das Attribut aber auf null gesetzt (also hat die Spielkarte
	 * keinen Wert)
	 * @param farbe
	 */
	public void init(String farbe) {
		this.init(farbe, null);
	}
	
	/**
	 * Setzt die Spielkarte komplett zurueck auf eine Spielkarte,
	 * die keine Farbe und keinen Wert hat.
	 * Dabei wird die init(String farbe, String wert)-Methode
	 * aufgerufen.
	 */
	public void init() {
		this.init(null, null);
	}
	
	
	
	/**
	 * Setter fuer farbe
	 */
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	
	/**
	 * Setter fuer Wert
	 * @param wert
	 */
	public void setWert(String wert) {
		this.wert = wert;
	}
	
	/**
	 * Getter fuer Farbe
	 * @return Farbe der Karte
	 */
	public String getFarbe() {
		return farbe;
	}
	
	/**
	 * Getter fuer Wert
	 * @return Wert der Karte
	 */
	public String getWert() {
		return wert;
	}
	
	/**
	 * gibt die Karte als String auf der Konsole aus
	 */
	public void druckDich(){
		System.out.println(this.toString());
	}
	
	/**
	 * Gibt die Karte als String zurueck
	 * @param kurz wenn true, dann die Kurzversion des Textes
	 * @return Karte als String
	 */
	public String toString(boolean kurz){
		if (kurz) return this.toStringKurz();
		else return this.toString();
	}
	
	/**
	 * Gibt die Karte als String zurueck
	 */
	public String toString(){
		String myString = "Spielkarte mit Farbe " + farbe +
							" und Wert " + wert;
		return myString;
	}
	
	/**
	 * Gibt die Karte als kurzen String zurueck
	 * @return
	 */
	public String toStringKurz(){
		return farbe + " " + wert;
	}

}
