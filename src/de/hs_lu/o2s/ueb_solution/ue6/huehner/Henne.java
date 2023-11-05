// 13 Punkte
package de.hs_lu.o2s.ueb_solution.ue6.huehner;

public class Henne {
	
	String name;
	Ei ei;
	
	/** 
	 * Konstruktor zum Anlegen einer Henne mit Ei
	 * @param name Name der Henne
	 * @param ei Ei der Henne (Objekt von der Klasse Ei)
	 */
	public Henne(String name, Ei ei) {
		super();
		this.name = name;
		this.ei = ei;
	}
	
	/** 
	 * Konstruktor zum Anlegen einer Henne ohne Ei
	 * @param name Name der Henne 
	 */
	public Henne(String name) {
		super();
		this.name = name;		
	}
		
	/**
	 * Ausgabe der Henne als String
	 */
	// Aufgabe 1c
	// 6 Punkte
	public String toString(){
		try {
			this.checkValidEi();
		} catch (KeinValidesEiException kee) {
			return kee.getMessage();
		}
		return "Henne mit Name " + this.getName() + " und " + this.getEi();
	}
	
	/**
	 * Prueft, ob die Henne ein korrekt spezifiziertes Ei hat. 
	 * Falls nicht, wird eine Exception geworfen.
	 * @throws HenneVorhandenException
	 */
	// Aufgabe 1b
	// 7 Punkte
	public void checkValidEi() throws KeinValidesEiException{ // 2 Punkte
		if (this.getEi() == null || this.getEi().getFarbe() == null || this.getEi().getGroesse() == null){ // 1 Punkt
			throw new KeinValidesEiException(); // 1 Punkt
		}
	}
	
	
	
	// --------- Get-Set Methoden (Standard) ----------
	
	public String getName() {
		return name;
	}	
	public void setName(String name) {
		this.name = name;
	}
	
	public Ei getEi() {
		return ei;
	}	
	public void setEi(Ei ei) {
		this.ei = ei;
	}
	
	
	
}
	

