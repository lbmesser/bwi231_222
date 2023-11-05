// 10 Punkte
package de.hs_lu.o2s.ueb_solution.ue3.mittelalter;

public class Einwohner {

	// 1 Punkt
	public int einkommen; // tatsaechliches Jahreseinkommen

	/**
	 * Konstruktor mit �bergebenem Einkommen des Einwohners
	 * 
	 * @param einkommen
	 *            Jahreseinkommen in Talern
	 */
	// 2 Punkte
	public Einwohner(int einkommen) {
		this.einkommen = einkommen;
	}

	/**
	 * Standardkonstruktor
	 */
	// 1 Punkt
	public Einwohner() {
		this(20);
	}

	/**
	 * Im Standardfall muessen die Einwohner 80% seines Jahreseinkommens versteuern.
	 * 
	 * @return Jahreseinkommen des Einwohners
	 */
	// 2 Punkte
	public int getZuVersteuerndesEinkommen() {
		return (int) Math.round(einkommen * 0.8);
	}

	/**
	 * Ermittelt die Steuer des Einwohners (nach Standardvorgehen)
	 * 
	 * @return Ermittelte Steuer des Einwohners
	 */
	// 3 Punkte
	public int getSteuer() {
		int steuer = (int) Math.round(this.getZuVersteuerndesEinkommen() * 0.19); // Rundung (25%)

		// minimale Steuer sicherstellen
		if (steuer < 5)
			steuer = 5;

		return steuer;
	}
}
