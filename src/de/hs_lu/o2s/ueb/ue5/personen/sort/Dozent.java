package de.hs_lu.o2s.ueb.ue5.personen.sort;

public class Dozent extends Person {
	
	/**
	 * Besoldungsgruppe des Dozenten
	 */
	private String besoldungsgruppe;
	
	/**
	 * Konstruktor f�r einen Dozenten
	 * @param name Name
	 * @param besoldungsgruppe Besoldungsgruppe
	 */
	public Dozent(String name, String besoldungsgruppe){
		super(name);
		this.besoldungsgruppe = besoldungsgruppe;
	}
	
	/**
	 * Konstruktor f�r einen Dozenten mit Geburtsjahr
	 * @param name Name des Dozenten
	 * @param geburtsjahr Geburtsjahr des Dozenten 
	 * @param besoldungsgruppe Besoldungsgruppe des Dozenten
	 */
	public Dozent(String name, int geburtsjahr, String besoldungsgruppe){
		super(name, geburtsjahr);
		this.besoldungsgruppe = besoldungsgruppe;
	}
	
	/**
	 * Get-Methode f�r besoldungsgruppe
	 * @return Besoldungsgruppe des Dozenten
	 */
	public String getBesoldungsgruppe() {
		return besoldungsgruppe;
	}
	
	/**
	 * Set-Methode f�r besoldungsgruppe
	 * @param besoldungsgruppe Neue Besoldungsgruppe des Dozenten
	 */
	public void setBesoldungsgruppe(String besoldungsgruppe) {
		this.besoldungsgruppe = besoldungsgruppe;
	}
	
	/**
	 * �berschreibt die abstrakte Methode String getHS_Status() aus Person
	 * @return Hochschulstatus des Dozenten als String "Dozent"
	 */
	public String getHS_Status() {
		return "Dozent";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
