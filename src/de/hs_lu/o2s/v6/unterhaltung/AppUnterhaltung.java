package de.hs_lu.o2s.v6.unterhaltung;


public class AppUnterhaltung {

	public static void main(String[] args) {
		
		Disco myDisco = new Disco(500);
		
		Kneipe myKneipe = new Kneipe((float) 2.60, 
				new String[]{"Pils", "Altbier", "Wein", "Sekt"});
		
		Unterhaltend[] betriebeA = new Unterhaltend[2]; // Array vom Interface-Typ
		betriebeA[0] = myDisco;
		betriebeA[1] = myKneipe;
				
		Disco[] dA = new Disco[1]; // Array vom Interface-Typ
		dA[0] = myDisco;
		
		// Ermittlung des Gesamt-Unterhaltungswerts im Array betriebeA
		int gesamtwert = 0;
		for (Unterhaltend myBetrieb : betriebeA){
			System.out.println(myBetrieb.toString());
			gesamtwert += myBetrieb.getUnterhaltungswert();
		}
		System.out.println("Der Gesamt-Unterhaltungswert " +
							"meiner Betriebe ist " + gesamtwert);
		
		
		// Casting und Interfaces: von der Klasse zum Interface casten
		Disco myDisco1 = new Disco(200);
		if (myDisco1 instanceof Unterhaltend){
			System.out.println("myDisco1 ist Unterhaltend");
			Unterhaltend myUnterhaltend = (Unterhaltend) myDisco1;
			System.out.println(myUnterhaltend);
		}
		
		// Casting und Interfaces: vom Interface zur Klasse casten		
		Unterhaltend myDisco2 = new Disco(300);
		if (myDisco2 instanceof Disco){
			System.out.println("myDisco2 ist eine Disco");
			Disco myNewDisco = (Disco) myDisco2;
			System.out.println(myNewDisco);
		}
	
		
	}

}



