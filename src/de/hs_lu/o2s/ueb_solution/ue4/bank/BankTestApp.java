package de.hs_lu.o2s.ueb_solution.ue4.bank;

public class BankTestApp {

	public static void main(String[] args) {
		System.out.println("--------------------------------");
		System.out.println("----------- Sparbuch -----------");
		System.out.println("--------------------------------");
		Sparbuch spar = new Sparbuch("Dagobert Duck", "Entenhausen");
		Sparbuch.setZins(2.5);

		System.out.println(spar.toString());
		spar.einzahlen(100);

		System.out.println("Sparbuch-Kontostand: " + spar.getKontostand());
		spar.auszahlen(50);
		System.out.println("Sparbuch-Kontostand: " + spar.getKontostand());
		spar.auszahlen(60); // nicht verf�gbar
		System.out.println("Sparbuch-Kontostand: " + spar.getKontostand());

		System.out.println("\n--------------------------------");
		System.out.println("---------- Girokonto -----------");
		System.out.println("--------------------------------");

		Girokonto giro = new Girokonto("Donald Duck", "Entenhausen", 100);

		System.out.println(giro.toString());
		Girokonto.setUeberziehungszins(13.5);

		giro.einzahlen(100);
		System.out.println("Girokonto-Kontostand: " + giro.getKontostand());

		giro.auszahlen(90);
		System.out.println("Girokonto-Kontostand: " + giro.getKontostand());

		giro.auszahlen(80); // innerhalb des Kreditrahmens
		System.out.println("Girokonto-Kontostand: " + giro.getKontostand());

		giro.auszahlen(80); // nicht mehr im Kreditrahmen
		System.out.println("Girokonto-Kontostand: " + giro.getKontostand());

		// Werden auch wirklich keine Habenzinsen auf das Girokonto gezahlt?
		giro.berechneZins();
		System.out.println("Girokonto-Kontostand: " + giro.getKontostand());

		System.out.println("\n--------------------------------");
		System.out.println("-------- Bausparkonto ----------");
		System.out.println("--------------------------------");

		Bausparkonto bauspar = new Bausparkonto("Mickey Mouse", "Entenhausen", 1000);
		System.out.println(bauspar.toString());

		Bausparkonto.setZins(3.0);

		bauspar.einzahlen(500);
		System.out.println("Bausparkonto-Kontostand: " + bauspar.getKontostand());

		bauspar.auszahlen(400); // Bausparsumme noch nicht erreicht
		System.out.println("Bausparkonto-Kontostand: " + bauspar.getKontostand());

		bauspar.einzahlen(600);
		System.out.println("Bausparkonto-Kontostand: " + bauspar.getKontostand());

		bauspar.auszahlen(800); // Bausparsumme erreicht
		System.out.println("Bausparkonto-Kontostand: " + bauspar.getKontostand());

		bauspar.auszahlen(100); // Bausparsumme war erreicht
		System.out.println("Bausparkonto-Kontostand: " + bauspar.getKontostand());

		bauspar.auszahlen(300); // So viel ist nicht auf dem Konto
		System.out.println("Bausparkonto-Kontostand: " + bauspar.getKontostand());
		
		bauspar.berechneZins();
		System.out.println("Bausparkonto-Kontostand: " + bauspar.getKontostand());

	}

}