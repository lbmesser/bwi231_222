package de.hs_lu.o2s.v4.personen;

public class Person {
	
	/**
	 * Name der Person
	 */
	String name;
	
	/**
	 * Geburtsjahr der Person
	 */
	int geburtsjahr;
	
	/**
	 * Konstruktor für eine "leere" Person
	 */
	public Person(){}
	
	/**
	 * Konstruktor für Person mit übergebenem Name
	 * @param name Name der Person
	 */
	public Person(String name) {
		this.setName(name);
	}
	
	/**
	 * Konstruktor für Person mit übergebenem Namen und Geburtsjahr
	 * @param name
	 * @param geburtsjahr
	 */
	public Person(String name, int geburtsjahr) {
		this.setName(name);
		this.setGeburtsjahr(geburtsjahr);
	}
	
	/**
	 * Ausgabe des Strings der Person auf die Konsole
	 * (Aufgabe 7 aus VL4)
	 */
	public void druckDich(){
		System.out.println(this.toString());
	}
	
	/**
	 * Gibt den Namen und das Geburtsjahr der Person aus
	 */
	public String toString(){
		// Original toString-Methode:
//		String personString = "Person mit Name: " + this.getName() +
//				" und Geburtsjahr: " + this.getGeburtsjahr();
		
		// Aufgabe 6
		String personString = this.getClass().getSimpleName() +
								" mit Name: " + this.getName() +
								" und Geburtsjahr: " + this.getGeburtsjahr();
		return personString;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGeburtsjahr() {
		return geburtsjahr;
	}
	public void setGeburtsjahr(int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}
}
