// 14 Punkte

package de.hs_lu.o2s.ueb_solution.ue4.bank;

public class Girokonto extends Konto{
	
	private static double ueberziehungszins; // 1 Punkt
	private double kreditlimit; // 1 Punkt

	// 3 Punkte
	public Girokonto(String name, String anschrift, double kreditlimit) {
		super(name, anschrift);
		this.kreditlimit = kreditlimit;
	}

	// 2 Punkte
	public static void setUeberziehungszins(double zins){
		Girokonto.ueberziehungszins = zins;
	}
	
	// 2 Punkte
	public void setKreditrahmen(double limit) {
		this.kreditlimit = limit;
	}
	
	// 2 Punkte
	public void auszahlen(double betrag){
		this.auszahlenMitPruefung(betrag, this.kontostand + this.kreditlimit);
	}

	// 3 Punkte
	public void berechneZins(){
		if (this.kontostand < 0)
			this.kontostand *= 1 + (Girokonto.ueberziehungszins / 100);
	}

}