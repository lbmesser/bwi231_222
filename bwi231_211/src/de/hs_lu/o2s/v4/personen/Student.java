package de.hs_lu.o2s.v4.personen;

public class Student extends Person {
	/**
	 * Matrikelnummer
	 */
	String matrNr;
	
	/**
	 * Konstruktor für Studenten
	 * @param name Name des Studenten
	 * @param matrNr Matrikelnummer des Studenten
	 */
	public Student(String name, String matrNr){
		this.name = name;
		this.matrNr = matrNr;
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
	
	/**
	 * Überschreibt die von Person geerbte Methode toString
	 * und erweitert die Rückgabe um die Matrikelnummer
	 */
	public String toString(){
		// Aufgabe 5 - Nutzung der toString-Methode von Person
		return super.toString() +
							" und Matrikelnummer: " + this.getMatrNr();
		
		// Aufgabe 3
		/*
		return "Student mit Name: " + this.getName() +
				", Geburtsjahr: " + this.getGeburtsjahr() +
				" und Matrikelnummer: " + this.getMatrNr();*/
	}
}




