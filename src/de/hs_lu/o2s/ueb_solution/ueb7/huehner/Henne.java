package de.hs_lu.o2s.ueb_solution.ueb7.huehner;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Henne implements Comparable<Henne> {
	
	private String name;
	private Ei ei;
	private Date geburtsdatum;
	
	private DateFormat df = new SimpleDateFormat("MM.dd.yyyy");
	
	/** 
	 * Konstruktor zum Anlegen einer Henne mit Ei
	 * @param name Name der Henne
	 * @param ei Ei der Henne (Objekt von der Klasse Ei)
	 */
	public Henne(String name, Ei ei, Date geburtsdatum) {
		this(name, geburtsdatum);
		this.ei = ei;
		
	}
	
	/** 
	 * Konstruktor zum Anlegen einer Henne ohne Ei
	 * @param name Name der Henne 
	 */
	public Henne(String name, Date geburtsdatum) {
		super();
		this.name = name;		
		this.geburtsdatum = geburtsdatum;
	}
		
	/**
	 * Ausgabe der Henne als String
	 */
	public String toString(){
		if (this.checkEi()) return "Name " + this.getName() + ", Geburtsdatum " + df.format(this.getGeburtsdatum()) + " und " + this.getEi();
		else return "Henne mit Name " + this.getName() + ", Geburtsdatum " + df.format(this.getGeburtsdatum()) + " (keine Eier)";
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
	
	
	
	public Date getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(Date geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	/**
	 * Prueft, ob zwei Hennen identisch sind (anhand des Namens und Geburtsdatums)
	 * @return Ergebnis des String-Vergleichs mit compareTo; wenn die Namen gleich sind, dann wird das Geburtsdatum verglichen
	 */
	public int compareTo(Henne o) {
		if(this.getName().equals(o.getName())) {
			return this.getGeburtsdatum().compareTo(o.getGeburtsdatum());
		}
		else {
			return this.getName().compareTo(o.getName());
		}
	}
	
	
	
}
	

