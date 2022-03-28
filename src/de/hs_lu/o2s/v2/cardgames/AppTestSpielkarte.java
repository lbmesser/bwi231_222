package de.hs_lu.o2s.v2.cardgames;

public class AppTestSpielkarte {

	public static void main(String[] args) {
		
		// Erzeugung der Objekte (Ohne Konstruktor)
		/*
		// Spielkarte myCard1 = new Spielkarte();
		// Spielkarte myCard2 = new Spielkarte();
		
		// kreuz as
		myCard1.setFarbe("Kreuz");
		myCard1.setWert("as");
		
		// karo 10
		myCard2.setFarbe("karo");
		myCard2.setWert("10");
		*/
		
		// Erzeugung der Objekte mit Hilfe des neuen Konstruktors
		Spielkarte myCard1 = new Spielkarte("kreuz", "as");
		Spielkarte myCard2 = new Spielkarte("karo", "10");
		
		
		
		// Ausgabe der beiden Objekte auf der Konsole
		System.out.println("myCard1 hat die Farbe " + myCard1.getFarbe() + " und den Wert " + myCard1.getWert());
		System.out.println("myCard2 hat die Farbe " + myCard2.getFarbe() + " und den Wert " + myCard2.getWert());
		
		// Ausgabe über toString-Methode
		System.out.println(myCard1.toString());
		System.out.println(myCard2.toString());

		// Ausgabe der kurzen toString-Methode
		System.out.println(myCard1.toStringKurz());
		System.out.println(myCard2.toStringKurz());
		
		// Nutzung von druckDich
		myCard1.druckDich();
		myCard2.druckDich();
		
		// leerer Konstruktor
		Spielkarte myCard3 = new Spielkarte();
		
		// Ausgabe der MyCard 4 mit horizontalem Konstruktoraufruf
		Spielkarte myCard4 = new Spielkarte("kreuz");
		System.out.println(myCard4.toString());
		
		// Vergleiche
		Spielkarte myCard5 = new Spielkarte("kreuz", "as");
		Spielkarte myCard6 = new Spielkarte("kreuz", "as");
		
		// Vergleich mit ==
		System.out.println(myCard5 == myCard6);
		
		// Vergleich mit equals
		System.out.println(myCard5.equals(myCard6));
	}

}
