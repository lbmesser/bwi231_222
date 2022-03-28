package de.hs_lu.o2s.v3.cardgames;

public class AppTestKartenspiel {

	public static void main(String[] args) {
		Kartenspiel spiel = new Kartenspiel();

		System.out.println(spiel.getKartenAnzahl());
		
		System.out.println();
		
		System.out.println(spiel.getPunktwert());
		
		System.out.println(spiel.toString());
	}

}
