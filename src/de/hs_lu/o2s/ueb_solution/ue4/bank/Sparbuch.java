// 10 Punkte

package de.hs_lu.o2s.ueb_solution.ue4.bank;

public class Sparbuch extends Konto{
	private static double zinssatz; // 1 Punkt

	// 2 Punkte
	public static void setZins(double zins){
		Sparbuch.zinssatz = zins;
	}
	
	// 2 Punkte
	public Sparbuch(String name, String anschrift) {
		super(name, anschrift);
	}
	
	// 2 Punkte
	public void auszahlen(double betrag){
		super.auszahlenMitPruefung(betrag, this.kontostand);
	}
	
	// 3 Punkte
	public void berechneZins(){
		this.kontostand *= 1 + (Sparbuch.zinssatz / 100);
	}
}