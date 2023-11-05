/* Klasse war bereits so gegeben, daher keine Punkte. */
package de.hs_lu.o2s.ueb_solution.ue4.personen;

public class Person {
	
	
	private String name;
	private int geburtsjahr; 
	
	/**
	 * Konstruktor f�r eine "leere" Person
	 */
	public Person(){
		super(); // dies kann auch weggelassen werden
	}
	
	/**
	 * Konstruktor f�r Person mit �bergebenem Name
	 * @param name Name der Person
	 */
	public Person(String name) {
		super();
		this.setName(name);
	}
	
	/**
	 * Konstruktor f�r Person mit �bergebenem Namen und Geburtsjahr
	 * @param name
	 * @param geburtsjahr
	 */
	public Person(String name, int geburtsjahr) {
		super();
		this.setName(name);
		this.setGeburtsjahr(geburtsjahr);
	}
	
	/**
	 * Ausgabe der Person auf der Konsole
	 */
	public void druckDich(){
		System.out.println(this.toString());
	}
	
	/**
	 * Nicht �berschreibbare Methode 
	 * @return String der Person
	 */
	public final String toPersonString(){
		String personString = this.getClass().getSimpleName() +
								" mit Name: " + this.getName() +
								" und Geburtsjahr: " + this.getGeburtsjahr();
		return personString;
	}
	
	/**
	 * R�ckgabe der Person als String
	 */
	public String toString(){
		return this.toPersonString();
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

