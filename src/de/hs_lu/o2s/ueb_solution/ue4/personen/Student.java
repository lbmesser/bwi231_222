// 33 Punkte

package de.hs_lu.o2s.ueb_solution.ue4.personen;

public class Student extends Person {
	
	private String matrNr;
	
	// --------------------- UE 4 --------------------
	
	/**
	 * Studiengebuehr
	 */
	// Gesamt: 5 Punkte
	// Kommentar: 2 Punkte
	private static double studiengebuehr = 180.0; // 3 Punkte
	
	/**
	 * Anzahl Studiensemester
	 */
	// Gesamt: 4 Punkte
	// Kommentar: 2 Punkte
	private int studiensemester; // 2 Punkte
	
	// Gesamt: 4 Punkte
	// Kommentar: 2 Punkte
	public static double getStudiengebuehr() { // 1 Punkt
		return studiengebuehr; // 1 Punkt
	}
	
	// Gesamt: 4 Punkte
	// Kommentar: 2 Punkte
	public double getGesamtgebuehr() {  // 1 Punkt
		return this.studiensemester * studiengebuehr; // 1 Punkt
	}
	
	// Gesamt: 6 Punkte
	// Kommentar: 2 Punkte
	public Student(String name, int studiensemester) { // 2 Punkte
		super(name);  // 1 Punkt
		this.studiensemester = studiensemester;  // 1 Punkt
	}
	
	// Gesamt: 6 Punkte
	// Kommentar: 2 Punkte
	public Student(String name, String matrNr, int studiensemester) { // 2 Punkte
		this(name, studiensemester); // 1 Punkt
		this.matrNr = matrNr; // 1 Punkt
	}
	
	// ------------------- Ende UE4 -----------------
	// ---- 4 Punkte weiter unten für's auskommentieren ----
	
	/**
	 * Konstruktor f�r Studenten (aus VL4)
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
		//this(name, geburtsjahr);  // horizontaler Aufruf  // UE4: muss auskommentiert werden
		// 2 Punkte
		super(name, geburtsjahr);  // UE4: muss hinzugefügt werden
		this.matrNr = matrNr;
	}
	
	/**
	 * Neuer Konstruktor: VL5 - vertikaler Konstruktoraufruf
	 * @param name Name der Person (des Studenten)
	 * @param geburtsjahr Geburtsjahr der Person (des Studenten)
	 */
	// UE4: muss auskommentiert werden!
	// 2 Punkte
//	public Student(String name, int geburtsjahr){
//		super(name, geburtsjahr); // Aufruf des Konstruktors von Person (vertikal) 
//	}
	
	
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




