// 17 Punkte
package de.hs_lu.o2s.ueb_solution.ue4.bank;

public class Bausparkonto extends Konto{
	
	private static double zinssatz; // 1 Punkt
	private double vertragssumme; // 1 Punkt
	private boolean summeErreicht; // 1 Punkt

	// 3 Punkte
	public Bausparkonto(String name, String anschrift, double summe) {
		super(name, anschrift);
		this.vertragssumme = summe;
	}

	// 2 Punkte
	public static void setZins(double zins){
		Bausparkonto.zinssatz = zins;
	}
	
	// 1 Punkt
	public void setBausparsumme(double summe){
		this.vertragssumme = summe;
	}

	// 3 Punkte
	public void auszahlen(double betrag){
		if (summeErreicht)
			super.auszahlenMitPruefung(betrag,this.kontostand);
		else
			System.out.println("Vertragssumme nicht erreicht");
	}
	
	// 3 Punkte
	public void einzahlen(double betrag){
		super.einzahlen(betrag);
		if (this.kontostand >= vertragssumme)
			summeErreicht = true;
	}
	
	// 2 Punkte
	public void berechneZins(){
		this.kontostand *= 1 + (Bausparkonto.zinssatz / 100);
	}

}