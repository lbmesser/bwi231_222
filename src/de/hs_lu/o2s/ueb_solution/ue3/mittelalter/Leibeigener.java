// 10 Punkte
package de.hs_lu.o2s.ueb_solution.ue3.mittelalter;

public class Leibeigener extends Bauer { // 1 Punkt

	// 2 Punkte
	public Leibeigener(int einkommen) {
		this.einkommen = einkommen;
	}
	
	// 2 Punkte
	public Leibeigener() {
		this.einkommen = 0;
	}
	
	/**
	 * Ueberschreibt Methode aus der Superklasse Einwohner,
	 * da fuer Leibeigene das zu versteuernde Einkommen nicht
	 * das gesamte Jahreseinkommmen ist, sondern dieses
	 * vor Versteuerung um 12 Taler reduziert wird..
	 * Bei einem Jahreseinkommen von weniger als 12 Talern werden 0 Taler versteuert.
	 */
	// 5 Punkte
	public int getZuVersteuerndesEinkommen()  {
		int zvse = super.getZuVersteuerndesEinkommen();
		
		if (zvse <= 12) return 0;
		else return zvse -= 12;
	}
}
