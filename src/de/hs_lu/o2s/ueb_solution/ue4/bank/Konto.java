// 17 Punkte

package de.hs_lu.o2s.ueb_solution.ue4.bank;

public abstract class Konto {
	private String name; // 1 Punkt
	private String adresse;  // 1 Punkt
	protected double kontostand; // zugreifbar in den Unterklassen  // 1 Punkt

	/**
	 * Konstruktor zum Anlegen des Kontos
	 * 
	 * @param name
	 * @param adresse
	 */
	// 2 Punkte
	public Konto(String name, String anschrift) {
		this.name = name;
		this.adresse = anschrift;
		this.kontostand = 0;
	}
	
	/**
	 * Get-Methode f�r Kontostand
	 * @return
	 */
	// 1 Punkte
	public double getKontostand() {
		return kontostand;
	}

	/**
	 * Einzahlen des �bergebenen Betrags auf das Konto
	 * 
	 * @param betrag
	 */
	// 2 Punkte
	public void einzahlen(double betrag) {
		this.kontostand += betrag;
	}

	/**
	 * Ausgabe des Kontos
	 */
	// 3 Punkte
	public String toString() {
		return "Inhaber: " + name + "\n" 
				+ "Kontostand: " + kontostand + "\n"
				+ "Anschrift: " + adresse;
	}

	/**
	 * Abstrakte Methode: Berechnung der Zinsen und Aufschlag auf / Abzug vom
	 * Kontostand je nach Kontotyp
	 */
	// 1 Punkt
	public abstract void berechneZins();

	/**
	 * Abstrakte Methode: Auszahlen
	 * 
	 * @param betrag
	 *            der auszuzahlende Betrag
	 */
	// 1 Punkt
	public abstract void auszahlen(double betrag);

	/**
	 * Protected-Methode - nur von den Subklassen zugreifbar. Um Code-Redundanzen zu
	 * vermeiden
	 * 
	 * @param betrag
	 * @param verfuegbarerBetrag
	 */
	// 4 Punkte
	protected void auszahlenMitPruefung(double betrag, double verfuegbarerBetrag) {
		if (betrag <= verfuegbarerBetrag) {
			this.kontostand -= betrag;
			System.out.println("Der Betrag " + betrag + " wird ausgezahlt");
		} 
		else {
			System.out.println("Der Betrag " + betrag + " ist nicht auszahlbar!");
		}
	}
}
