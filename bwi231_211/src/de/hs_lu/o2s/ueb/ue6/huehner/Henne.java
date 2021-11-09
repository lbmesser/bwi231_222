package de.hs_lu.o2s.ueb.ue6.huehner;

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
	public String toString(){
		return "Dies ist eine Henne mit Name " + this.getName() + " und " + this.getEi();
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
	

