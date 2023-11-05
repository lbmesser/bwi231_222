// 5 Punkte
package de.hs_lu.o2s.ueb_solution.ue6.unterhaltung;

public class Disco extends Gewerbebetrieb implements Unterhaltend, Comparable<Unterhaltend> {

	/**
	 * Anzahl der Personen, die in die Disko passen
	 */
	private int anzahlPersonen;
	
	/**
	 * Konstruktor fuer Diskotheken
	 * @param anzahlPersonen Anzahl Personen, die in die Disko passen
	 */
	public Disco(int anzahlPersonen) {
		super();
		this.anzahlPersonen = anzahlPersonen;
	}
	
	/**
	 * Getter fuer Anzahl Personen
	 * @return
	 */
	public int getAnzahlPersonen() {
		return anzahlPersonen;
	}

	/**
	 * Setter fuer Anzahl Personen
	 * @param anzahlPersonen
	 */
	public void setAnzahlPersonen(int anzahlPersonen) {
		this.anzahlPersonen = anzahlPersonen;
	}

	@Override
	public int getUnterhaltungswert() {
		return this.getAnzahlPersonen();
	}
	
	public String toString(){
		return "Disco fuer " + this.getAnzahlPersonen() + " Gaeste " +
				"mit Unterhaltungswert " + this.getUnterhaltungswert();
	}

	@Override
	public int compareTo(Unterhaltend o) {
		return this.getUnterhaltungswert() - o.getUnterhaltungswert();
	}
	
	/**
	 * Prueft, ob ein Gast der Disco alt genug ist. Falls nicht,
	 * wird eine ZuJungException geworfen
	 * @param person
	 * @throws ZuJungException
	 */
	// Aufgabe 2b
	// 5 Punkte
	public void pruefeGast(Person person) throws ZuJungException { // 3 Punkte
		if (person.getGeburtsjahr() > 2003){ // 1 Punkt
			throw new ZuJungException(); // 1 Punkt
		}
	}

}

