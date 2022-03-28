package de.hs_lu.o2s.v5.personen;

public class Person {
	
	/**
	 * Name der Person
	 */
	private String name;  // VL5-Änderung auf private
	
	/**
	 * Geburtsjahr der Person
	 */
	private int geburtsjahr; // VL5-Änderung auf private
	
	/**
	 * Konstruktor für eine "leere" Person
	 */
	public Person(){
		super(); // dies kann auch weggelassen werden
		System.out.println("Person() wird ausgeführt"); // Aufgabe 5.2
	}
	
	/**
	 * Konstruktor für Person mit übergebenem Name
	 * @param name Name der Person
	 */
	public Person(String name) {
		super();
		System.out.println("Person(String) wird ausgeführt");
		this.setName(name);
	}
	
	/**
	 * Konstruktor für Person mit übergebenem Namen und Geburtsjahr
	 * @param name
	 * @param geburtsjahr
	 */
	public Person(String name, int geburtsjahr) {
		super();
		System.out.println("Person(String, int) wird ausgeführt");
		this.setName(name);
		this.setGeburtsjahr(geburtsjahr);
	}
	
	/**
	 * Gibt die Person als Text auf der Konsole aus
	 */
	public void druckDich(){
		System.out.println(this.toString());
	}
	
	/**
	 * erzeugt einen String, der die Person beschreibt
	 * @return
	 */
	public final String toPersonString(){
		String personString = this.getClass().getSimpleName() +
								" mit Name: " + this.getName() +
								" und Geburtsjahr: " + this.getGeburtsjahr();
		return personString;
	}
	
	/**
	 * erzeugt einen String, der die Person beschreibt
	 */
	public String toString(){
		return this.toPersonString();
	}
	
	/** 
	 * Get-Methode für Name
	 * @return Name der Person
	 */
	public String getName() {
		return name;
	}
	/**
	 * Set-Methode für Name
	 * @param name Name der Person
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get-Methode für Geburtsjahr
	 * @return Geburtsjahr der Person
	 */
	public int getGeburtsjahr() {
		return geburtsjahr;
	}
	/**
	 * Set-Methode für Geburtsjahr
	 * @param geburtsjahr Geburtsjahr der Person
	 */
	public void setGeburtsjahr(int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}
}

