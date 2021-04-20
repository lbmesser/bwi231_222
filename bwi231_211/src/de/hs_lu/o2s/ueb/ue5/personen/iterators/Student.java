package de.hs_lu.o2s.ueb.ue5.personen.iterators;

//ACHTUNG: In dieser Klasse m�ssen Sie nichts �ndern
public class Student extends Person {
	/**
	 * Matrikelnummer
	 */
	private String matrNr;
	
	/**
	 * Konstruktor f�r Studenten
	 * @param name Name des Studenten
	 * @param matrNr Matrikelnummer des Studenten
	 */
	public Student(String name, String matrNr){
		super(name);
		this.matrNr = matrNr;
	}
	
	/**
	 * Konstruktor f�r einen Student, der auch die Attribute von 
	 * Person (Name und Geburtsjahr) �bergeben bekommt
	 * @param name Name der Person (des Studenten)
	 * @param geburtsjahr Geburtsjahr der Person (des Studenten)
	 * @param matrNr Matrikelnummer des Studenten
	 */
	public Student(String name, int geburtsjahr, String matrNr){
		this(name, geburtsjahr);
		this.matrNr = matrNr;
	}
	
	/**
	 * Konstruktor f�r einen Student, der nur Attribute von 
	 * Person (Geburtsjahr und name) �bergeben bekommt
	 * @param name Name der Person (des Studenten)
	 * @param geburtsjahr Geburtsjahr der Person (des Studenten)
	 */
	public Student(String name, int geburtsjahr){
		super(name, geburtsjahr); // Aufruf des Konstruktors von Person 
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
	
	/**
	 * �berschreibt die abstrakte Methode String getHS_Status() aus Person
	 * @return Hochschulstatus des Studenten als String "Student"
	 */
	public String getHS_Status() {
		return "Student";
	}
}