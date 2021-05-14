package de.hs_lu.o2s.ueb.ue8.huehner;

public class Henne implements Comparable<Henne> {
	
	private String name;
	private Ei ei;
	
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
	public String toString(){
		if (this.checkEi()) return "Name " + this.getName() + " und " + this.getEi();
		else return "Henne mit Name " + this.getName() + " (keine Eier)";
	}
	
	/**
	 * Prueft, ob die Henne ein Ei hat. 
	 * Falls nicht, wird eine Exception geworfen.
	 * @throws HenneVorhandenException
	 */
	public boolean checkEi() {
		return !(this.getEi() == null);
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
	
	/**
	 * Prueft, ob zwei Hennen identisch sind (anhand des Namens)
	 * @return Ergebnis des String-Vergleichs mit compareTo
	 */
	public int compareTo(Henne o) {
		return this.getName().compareTo(o.getName());
	}
	
	
	
}
	

