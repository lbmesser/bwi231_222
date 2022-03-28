package de.hs_lu.o2s.v10.bestellung;

public class AppBestellung {

	public static void main(String[] args) {
		
		// User Input wird "simuliert" durch Erzeugung von Objekten
		
		// Stammdaten fuer Kunden
		Kunde k1 = new Privatkunde("Meier", "Ludwigshafen");
		
		// Stammdaten fuer Artikel
		Artikel a1 = new Artikel(1, "Artikel 1", 1.5);
		Artikel a2 = new Artikel(2, "Artikel 2", 2.5);
		Artikel a3 = new Artikel(3, "Artikel 3", 3.5);
		
		// Bewegungsdaten (Bestellungen)
		Bestellung bestellungFuerKunde_k1_1 = new Bestellung(k1);
		bestellungFuerKunde_k1_1.setReady(true);
		try {
			Lieferung lieferungFuerKunde_k1_1 = (Lieferung) bestellungFuerKunde_k1_1.triggerNextStep();
		} catch (Exception e) {
			e.getMessage();
		}
		
		Bestellung bestellungFuerKunde_k1_2 = new Bestellung(k1);
		
		Bestellung bestellungFuerKunde_k1 = new Bestellung(k1);
				
		try {
			Position p1 = new Position(a1, 4);
			bestellungFuerKunde_k1.addPosition(p1);
			bestellungFuerKunde_k1.addPosition(new Position(a2, 3, 2.6));
			bestellungFuerKunde_k1.addPosition(new Position(a3, 2));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(bestellungFuerKunde_k1);
		
		bestellungFuerKunde_k1.setReady(true);
		
		try {
			bestellungFuerKunde_k1.addPosition(new Position(a3, 12));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		Lieferung lieferungFuerKunde_k1;
		try {
			lieferungFuerKunde_k1 = (Lieferung) bestellungFuerKunde_k1.triggerNextStep();
			lieferungFuerKunde_k1.setReady(true);
			
			Rechnung rechnungFuerKunde_k1 = (Rechnung) lieferungFuerKunde_k1.triggerNextStep();
			
			System.out.println("Preis der Bestellung: " + bestellungFuerKunde_k1.getPreis());		
			System.out.println("Preis der Lieferung : " + lieferungFuerKunde_k1.getPreis());
			System.out.println("Preis der Rechnung  : " + rechnungFuerKunde_k1.getPreis());
					
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
