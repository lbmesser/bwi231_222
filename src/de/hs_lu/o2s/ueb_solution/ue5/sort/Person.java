// 25 Punkte
package de.hs_lu.o2s.ueb_solution.ue5.sort;

public abstract class Person implements Comparable {
	
	/**
	 * Name der Person
	 */
	private String name;  // VL5-�nderung auf private
	
	/**
	 * Geburtsjahr der Person
	 */
	private int geburtsjahr; // VL5-�nderung auf private
	
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
	 * Abstrakte Methode: gibt den Hochschul-Status der Person zur�ck
	 * Da es eine abstrakte Methode ist, muss sie in beiden Subklassen
	 * �berschrieben werden
	 * @return Hochschulstatus der Person
	 */
	public abstract String getHS_Status();
	
	public void druckDich(){
		System.out.println(this.toString());
	}
	public final String toPersonString(){
		String personString = this.getClass().getSimpleName() +
								" mit Name: " + this.getName() +
								" und Geburtsjahr: " + this.getGeburtsjahr();
		return personString;
	}
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
	
	// BEGINN Aufgabe 2
	// 25 Punkte
	
	@Override
	public int compareTo(Object o) {
		if (o instanceof Person) {
			String myName = this.getName();
			String otherName = ((Person)o).getName();
			
			if (myName.equals(otherName)) {
				return ((Person)o).getGeburtsjahr() - this.getGeburtsjahr();
			}
						
			return myName.compareTo(otherName);		
		}
		else {
			System.out.println("compareTo: Übergebenes Objekt ist keine Person. Vergleich kann nicht durchgeführt werden.");
			return 0;
		}
	}
}

