// 20 Punkte

package de.hs_lu.o2s.ueb_solution.ue3.mittelalter;

public class Koenigreich { // 1 Punkt

	public static Einwohner[] einwohnerA; // 1 Punkt

	/**
	 * Legt vier Einwohner unterschiedlichen Standes mit jeweils 20 Talern Einkommen
	 * an.
	 * 
	 * @param args
	 */
	// Gesamt: 3 Punkte
	public static void main(String[] args) {
		steuerbescheid(new Koenig(20)); // war gegeben
		steuerbescheid(new Adel(20)); // war gegeben
		steuerbescheid(new Bauer(20)); // war gegeben
		steuerbescheid(new Leibeigener(20)); // war gegeben

		koenigreichAnlegen(); // 1 Punkt
		System.out.println("Gesamtsumme der Steuern im Königreich: " + steuernImKoenigreich()); // 1 Punkt
		staendeAusgeben(); // 1 Punkt
	}

	/**
	 * Gibt das zu versteuernde Einkommen fuer einen Einwohner aus
	 * 
	 * @param einwohner
	 *            Der Einwohner
	 * @param einkommen
	 *            Das Jahreseinkommen des Einwohners
	 */
	 // war gegeben
	static void steuerbescheid(Einwohner einwohner) {

		System.out.println(einwohner.getClass().getSimpleName() + ": Einkommen " + einwohner.einkommen
				+ ", zu versteuerndes Einkommen " + einwohner.getZuVersteuerndesEinkommen() + ", Steuer "
				+ einwohner.getSteuer());
	}

	/**
	 * Aufgabe 3 b
	 */
	// 6 Punkte
	static void koenigreichAnlegen() {
		einwohnerA = new Einwohner[12];

		einwohnerA[0] = new Koenig(300);
		for (int i = 1; i < 4; i++)
			einwohnerA[i] = new Adel(100);
		for (int i = 4; i < 8; i++)
			einwohnerA[i] = new Bauer(40);
		for (int i = 8; i < 12; i++)
			einwohnerA[i] = new Leibeigener(50);
	}

	/**
	 * Druckt die Gesamtsumme der Steuern aus
	 */
	// 4 Punkte
	static int steuernImKoenigreich() {
		int summe = 0;
		for (Einwohner einw : einwohnerA) {
			summe += einw.getSteuer();
			System.out.println(einw.getSteuer());
		}
		return summe;
	}

	/**
	 * Druckt die Staende aller Einwohner aus und sagt an, wann der Koenig kommt
	 */
	// 5 Punkte
	static void staendeAusgeben() {

		for (Einwohner einw : einwohnerA) {
			if (einw instanceof Koenig)
				((Koenig) einw).druckDich();
			System.out.println("Stand: " + einw.getClass().getSimpleName());
		}
	}

}