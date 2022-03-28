package de.hs_lu.o2s.v3.cardgames;

public class AppTestKartenstapel {

	public static void main(String[] args) {
		// Anlegen eines neuen Spiels
		Kartenspiel spiel1 = new Kartenspiel();
		
		// das Spiel auf den Kartenstapel legen
		Kartenstapel stapel1 = new Kartenstapel(spiel1);
		
		Spielkarte karte1 = spiel1.getKartenAA()[0][0]; // kreuz 2
		Spielkarte karte2 = spiel1.getKartenAA()[1][3]; // pik 5
		
		stapel1.push(karte1); // Stapel hat zunächst 52 Karten, nach dem Push sollten es 53 sein
		stapel1.push(karte2); // Stapel hat zunächst 53 Karten, nach dem Push sollten es 54 sein
		

	}

}
