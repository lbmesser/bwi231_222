package de.hs_lu.o2s.v1.cardgames;

public class AppTestSpielkarte {

	public static void main(String[] args) {
		
		// Erzeugung der Objekte
		Spielkarte myCard1 = new Spielkarte();
		Spielkarte myCard2 = new Spielkarte();
		
		// kreuz as
		myCard1.farbe = "kreuz";
		myCard1.wert = "as";
		
		// karo 10
		myCard2.farbe = "karo";
		myCard2.wert = "10";
		
		// Ausgabe der beiden Objekte auf der Konsole
		System.out.println("myCard1 hat die Farbe " + myCard1.farbe + " und den Wert " + myCard1.wert);
		System.out.println("myCard2 hat die Farbe " + myCard2.farbe + " und den Wert " + myCard2.wert);

	}

}
