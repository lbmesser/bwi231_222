package de.hs_lu.o2s.v5.personen;

public class Student extends Person {
	/**
	 * Matrikelnummer
	 */
	private String matrNr;
	
	/**
	 * Konstruktor für Studenten (aus VL4)
	 * @param name Name des Studenten
	 * @param matrNr Matrikelnummer des Studenten
	 */
	public Student(String name, String matrNr){
		super(name);
		this.matrNr = matrNr;
		System.out.println("Student(String, String) wird ausgeführt"); 
	}
	
	/**
	 * Neuer Konstruktor: VL5 Aufgabe 1
	 * Konstruktor für einen Student, der auch die Attribute von 
	 * Person (Name und Geburtsjahr) übergeben bekommt
	 * @param name Name der Person (des Studenten)
	 * @param geburtsjahr Geburtsjahr der Person (des Studenten)
	 * @param matrNr Matrikelnummer des Studenten
	 */
	public Student(String name, int geburtsjahr, String matrNr){
		//super(name, geburtsjahr); // Aufruf des Konstruktors von Person 
		//this(name, geburtsjahr, matrNr); // funktioniert nicht
		this(name, geburtsjahr); // Exkurs zu this
		//this.name = name; // funktioniert nicht
		//this.geburtsjahr = geburtsjahr; // funktioniert nicht
		System.out.println("Student(String, int, String) wird ausgeführt"); // Aufgabe 5.2
		this.matrNr = matrNr;
	}
	
	/**
	 * Neuer Konstruktor: VL5 - Exkurs zu this
	 * Konstruktor für einen Student, der nur Attribute von 
	 * Person (Geburtsjahr und name) übergeben bekommt
	 * @param name Name der Person (des Studenten)
	 * @param geburtsjahr Geburtsjahr der Person (des Studenten)
	 */
	public Student(String name, int geburtsjahr){
		super(name, geburtsjahr); // Aufruf des Konstruktors von Person 
		System.out.println("Student(String, int) wird ausgeführt");
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
		
		/*
		return "Student mit Name: " + this.getName() +
				", Geburtsjahr: " + this.getGeburtsjahr() +
				", Matrikelnummer: " + this.getMatrNr();*/
	}
	
	public static void main(String[] args) {
		// Visualisierung der Konstruktor-Aufrufe mit Jive
		// im Teil "Exkurs zu this"
		Student stud = new Student("Meyer", 1977);
		stud.druckDich();
	}
}




