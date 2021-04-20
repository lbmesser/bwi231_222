package de.hs_lu.o2s.ueb.ue4.personen;

public class Student extends Person {
	
	private String matrNr;
	
	/**
	 * Konstruktor für Studenten (aus VL4)
	 * @param name Name des Studenten
	 * @param matrNr Matrikelnummer des Studenten
	 */
	public Student(String name, String matrNr){
		super(name);
		this.matrNr = matrNr;
	}
	
	/**
	 * Neuer Konstruktor: VL5 Aufgabe 1 - horizontaler Konstruktoraufruf
	 * @param name Name der Person (des Studenten)
	 * @param geburtsjahr Geburtsjahr der Person (des Studenten)
	 * @param matrNr Matrikelnummer des Studenten
	 */
	public Student(String name, int geburtsjahr, String matrNr){
		this(name, geburtsjahr);  // horizontaler Aufruf
		this.matrNr = matrNr;
	}
	
	/**
	 * Neuer Konstruktor: VL5 - vertikaler Konstruktoraufruf
	 * @param name Name der Person (des Studenten)
	 * @param geburtsjahr Geburtsjahr der Person (des Studenten)
	 */
	public Student(String name, int geburtsjahr){
		super(name, geburtsjahr); // Aufruf des Konstruktors von Person (vertikal) 
	}
	
	
	/**
	 * @return Matrikelnummer des Studenten
	 */
	public String getMatrNr() {
		return matrNr;
	}
	
	/**
	 * Setzen der Matrikelnummer
	 * @param matrNr neue Matrikelnummer
	 */
	public void setMatrNr(String matrNr) {
		this.matrNr = matrNr;
	}
	
	public String toString(){
		return super.toString() +
							", Matrikelnummer: " + this.getMatrNr();
	}
	
}




