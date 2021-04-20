package de.hs_lu.o2s.v6.unterhaltung;

public class Disco extends Gewerbebetrieb implements Unterhaltend {

	/**
	 * Anzahl der Personen, die in die Disko passen
	 */
	private int anzahlPersonen;
	
	/**
	 * Konstruktor f�r Diskotheken
	 * @param anzahlPersonen Anzahl Personen, die in die Disko passen
	 */
	public Disco(int anzahlPersonen) {
		super();
		this.anzahlPersonen = anzahlPersonen;
	}
	
	/**
	 * Konstruktor f�r Diskotheken
	 * @param name Name des Gewerbebetriebs (der Disco)
	 * @param gruendungsjahr Gr�ndungsjahr des Gewerbebetriebs (der Disco)
	 * @param anzahlPersonen Anzahl Personen, die in die Disko passen
	 */
	public Disco(String name, int gruendungsjahr, int anzahlPersonen) {
		super(name, gruendungsjahr);
		this.anzahlPersonen = anzahlPersonen;
	}
	
	
	
	/**
	 * Getter f�r Anzahl Personen
	 * @return
	 */
	public int getAnzahlPersonen() {
		return anzahlPersonen;
	}

	/**
	 * Setter f�r Anzahl Personen
	 * @param anzahlPersonen
	 */
	public void setAnzahlPersonen(int anzahlPersonen) {
		this.anzahlPersonen = anzahlPersonen;
	}

	@Override
	public int getUnterhaltungswert() {
		return this.getAnzahlPersonen();
	}

}

