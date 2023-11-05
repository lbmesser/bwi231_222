package de.hs_lu.o2s.ueb_solution.ue4.bank;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class TestKonto extends TestCase {

	private final double sparbuchZins = 2.5;
	private final double giroZins = 13.5;
	private final double bausparZins = 3.0;
	
	private ByteArrayOutputStream outContent;
	
	public void setUp() {
		outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
	}

	// --------------------------------------- Sparbuch -------------------------------------------------------
	
	public void testSparbuchEinzahlen() {
		Sparbuch sparbuch = new Sparbuch("Dagobert Duck", "Entenhausen");
		Sparbuch.setZins(sparbuchZins);
		
		sparbuch.einzahlen(100);
		assertEquals("Der Konstostand nach der erstmaligen Einzahlung von 100 sollte 100 sein", 100.0, sparbuch.kontostand);	
	}
	
	public void testSparbuchEinzahlenAuszahlenGueltig() {
		Sparbuch sparbuch = new Sparbuch("Dagobert Duck", "Entenhausen");
		Sparbuch.setZins(sparbuchZins);
		
		sparbuch.einzahlen(100);
		assertEquals("Der Konstostand nach der erstmaligen Einzahlung von 100 sollte 100 sein", 100.0, sparbuch.kontostand);	
		
		sparbuch.auszahlen(50);
		
		assertEquals("Der Konstostand nach Auszahlung von 50 bei vorherigem Konstostand 100 sollte 50 sein", 50.0, sparbuch.kontostand);
	}
	
	public void testSparbuchEinzahlenAuszahlenUngueltig() {
		Sparbuch sparbuch = new Sparbuch("Dagobert Duck", "Entenhausen");
		Sparbuch.setZins(sparbuchZins);
		
		sparbuch.einzahlen(100);
		assertEquals("Der Konstostand nach der erstmaligen Einzahlung von 100 sollte 100 sein", 100.0, sparbuch.kontostand);	
		
		sparbuch.auszahlen(120);
		
		outContent.reset();
		sparbuch.auszahlen(120); // nicht verf�gbar
		assertEquals("Der Versuch, bei einem Kontostand von 100 dann 120 auszuzahlen, sollte fehlschlagen und genau die definierte Nachricht ausgeben", "Der Betrag 120.0 ist nicht auszahlbar!\n", outContent.toString());
		
	
	}
	
	public void testSparbuchVerzinsung() {
		Sparbuch sparbuch = new Sparbuch("Dagobert Duck", "Entenhausen");
		Sparbuch.setZins(sparbuchZins);
	
		sparbuch.einzahlen(100);
		assertEquals("Der Konstostand nach der erstmaligen Einzahlung von 100 sollte 100 sein", 100.0, sparbuch.kontostand);	
		
		sparbuch.auszahlen(50);
		
		assertEquals("Der Konstostand nach Auszahlung von 50 bei vorherigem Konstostand 100 sollte 50 sein", 50.0, sparbuch.kontostand);
		
		sparbuch.berechneZins();
		assertEquals("Es sollten " + 50.0 * sparbuchZins / 100.0 + " Zinsen auf den Kontostand aufgeschlagen werden", 50.0 + 50.0 * sparbuchZins / 100.0, Math.round(100.0 * sparbuch.kontostand) / 100.0);

	}
	
	
	// --------------------------------------- Girokonto -------------------------------------------------------	
	
	public void testGirokontoEinzahlen() {
		Girokonto giro = new Girokonto("Donald Duck", "Entenhausen", 100);
		
		Girokonto.setUeberziehungszins(giroZins);
		giro.einzahlen(100);
				
		assertEquals("Der Konstostand nach der erstmaligen Einzahlung von 100 sollte 100 sein", 100.0, giro.kontostand);	
	
	}
	
	public void testGirokontoEinzahlenAuszahlenOhneDispo() {
		Girokonto giro = new Girokonto("Donald Duck", "Entenhausen", 100);
		
		Girokonto.setUeberziehungszins(giroZins);
		giro.einzahlen(100);
				
		assertEquals("Der Konstostand nach der erstmaligen Einzahlung von 100 sollte 100 sein", 100.0, giro.kontostand);	
		
		giro.auszahlen(90);
		
		assertEquals("Der Konstostand nach der erstmaligen Einzahlung von 100 und Auszahlung von 90 sollte 10 sein", 10.0, giro.kontostand);	
	
	}
	
	public void testGirokontoEinzahlenAuszahlenMitDispoGueltig() {
		Girokonto giro = new Girokonto("Donald Duck", "Entenhausen", 100);
		
		Girokonto.setUeberziehungszins(giroZins);
		giro.einzahlen(100);
				
		assertEquals("Der Konstostand nach der erstmaligen Einzahlung von 100 sollte 100 sein", 100.0, giro.kontostand);	
		
		giro.auszahlen(170);
		
		assertEquals("Der Konstostand nach der erstmaligen Einzahlung von 100 und Auszahlung von 170 sollte -70 sein (innerhalb des Kreditrahmens)", -70.0, giro.kontostand);	
	
	}
	
	public void testGirokontoEinzahlenAuszahlenMitDispoUngueltig() {
		Girokonto giro = new Girokonto("Donald Duck", "Entenhausen", 100);
		
		Girokonto.setUeberziehungszins(giroZins);
		giro.einzahlen(100);
				
		assertEquals("Der Konstostand nach der erstmaligen Einzahlung von 100 sollte 100 sein", 100.0, giro.kontostand);	
		
		outContent.reset();
		giro.auszahlen(250);
		assertEquals("Die Auszahlung von 250 bei einem Kontostand von 100 sollte genau eine definierte Fehlermeldung ausgeben.", "Der Betrag 250.0 ist nicht auszahlbar!\n", outContent.toString());
		assertEquals("Der Konstostand nach der erstmaligen Einzahlung von 100 und versuchter Auszahlung von 250 sollte weiterhin 100 sein (Auszahlung ung�ltig)", 100.0, giro.kontostand);	
	
	}
	
	public void testGirokontoEinzahlenAuszahlenBerechnungDispozinsen() {
		Girokonto giro = new Girokonto("Donald Duck", "Entenhausen", 100);
		
		Girokonto.setUeberziehungszins(giroZins);
		giro.einzahlen(100);
				
		assertEquals("Der Konstostand nach der erstmaligen Einzahlung von 100 sollte 100 sein", 100.0, giro.kontostand);	
		
		giro.auszahlen(170);
		
		assertEquals("Der Konstostand nach der erstmaligen Einzahlung von 100 und Auszahlung von 170 sollte -70 sein (innerhalb des Kreditrahmens)", -70.0, giro.kontostand);	
	
		giro.berechneZins();
		assertEquals("Bei einem Kontostand von -70 sollte die Verzinsung " + Math.round((-70.0-70.0*giroZins/100.0)*100.0)/100.0 + " sein", Math.round((-70.0-70.0*giroZins/100.0)*100.0)/100.0, Math.round(giro.getKontostand()*100.0)/100.0);
		
	}
	
	public void testGirokontoKeineHabenzinsen() {
		Girokonto giro = new Girokonto("Donald Duck", "Entenhausen", 100);
		
		Girokonto.setUeberziehungszins(giroZins);
		giro.einzahlen(100);
				
		assertEquals("Der Konstostand nach der erstmaligen Einzahlung von 100 sollte 100 sein", 100.0, giro.kontostand);	
		
		giro.berechneZins();
		assertEquals("Der Aufruf von berechneZins sollte beim Girokonto trotz positivem Kontostand zu keinem Zins f�hren", 100.0, giro.getKontostand());
	
	}
	

	// --------------------------------------- Bausparkonto -------------------------------------------------------	
	

	public void testBausparkontoEinzahlen() {
		Bausparkonto bauspar = new Bausparkonto("Mickey Mouse", "Entenhausen",1000);
		
		Bausparkonto.setZins(3.0);
	    			     
		bauspar.einzahlen(500);		
		assertEquals("Der Konstostand nach der erstmaligen Einzahlung von 500 sollte 500 sein", 500.0, bauspar.getKontostand());	
				
	}
	
	public void testBausparkontoEinzahlenAuszahlenVorSummeErreicht() {
		Bausparkonto bauspar = new Bausparkonto("Mickey Mouse", "Entenhausen",1000);
		
		Bausparkonto.setZins(3.0);
	    			     
		bauspar.einzahlen(500);		
		assertEquals("Der Konstostand nach der erstmaligen Einzahlung von 500 sollte 500 sein", 500.0, bauspar.getKontostand());	
		
		outContent.reset();
		bauspar.auszahlen(400); // Bausparsumme noch nicht erreicht
		assertEquals("Bei Auszahlversuch vor Erreichen der Bausparsumme soll ein fest definierter String ausgegeben werden", "Vertragssumme nicht erreicht\n", outContent.toString());
				
	}
	
	public void testBausparkontoEinzahlenAuszahlenNachSummeErreicht() {
		Bausparkonto bauspar = new Bausparkonto("Mickey Mouse", "Entenhausen",1000);
		
		Bausparkonto.setZins(3.0);
	    			     
		bauspar.einzahlen(500);		
		assertEquals("Der Konstostand nach der erstmaligen Einzahlung von 500 sollte 500 sein", 500.0, bauspar.getKontostand());	
		
		bauspar.einzahlen(600);
		assertEquals("Der Konstostand nach der erstmaligen Einzahlung von 500 und nochmaliger Einzahlung von 600 sollte 1100 sein", 1100.0, bauspar.getKontostand());
		
		
		bauspar.auszahlen(800); // Bausparsumme erreicht
		assertEquals("Der Konstostand nach der erstmaligen Einzahlung von 500 und nochmaliger Einzahlung von 600 und der zul�ssigen Auszahlung von 800 sollte 300 sein", 300.0, bauspar.getKontostand());
			
		bauspar.auszahlen(100); // Bausparsumme war erreicht
		assertEquals("Der Konstostand nach der erstmaligen Einzahlung von 500 und nochmaliger Einzahlung von 600 und der zul�ssigen Auszahlungen von 800 und danach 100 sollte 200 sein", 200.0, bauspar.getKontostand());
		
	}
	
	public void testBausparkontoEinzahlenAuszahlenNachSummeErreichtUndAuszahlenUngueltig() {
		Bausparkonto bauspar = new Bausparkonto("Mickey Mouse", "Entenhausen",1000);
		
		Bausparkonto.setZins(3.0);
	    			     
		bauspar.einzahlen(500);		
		assertEquals("Der Konstostand nach der erstmaligen Einzahlung von 500 sollte 500 sein", 500.0, bauspar.getKontostand());	
		
		bauspar.einzahlen(600);
		assertEquals("Der Konstostand nach der erstmaligen Einzahlung von 500 und nochmaliger Einzahlung von 600 sollte 1100 sein", 1100.0, bauspar.getKontostand());
		
		
		bauspar.auszahlen(800); // Bausparsumme erreicht
		assertEquals("Der Konstostand nach der erstmaligen Einzahlung von 500 und nochmaliger Einzahlung von 600 und der zul�ssigen Auszahlung von 800 sollte 300 sein", 300.0, bauspar.getKontostand());
			
		bauspar.auszahlen(100); // Bausparsumme war erreicht
		assertEquals("Der Konstostand nach der erstmaligen Einzahlung von 500 und nochmaliger Einzahlung von 600 und der zul�ssigen Auszahlungen von 800 und danach 100 sollte 200 sein", 200.0, bauspar.getKontostand());
		
		
		outContent.reset();
		bauspar.auszahlen(300); // So viel ist nicht auf dem Konto
		assertEquals("Die Auszahlung von 300 bei einem Kontostand von 200 sollte genau eine definierte Fehlermeldung ausgeben.", "Der Betrag 300.0 ist nicht auszahlbar!\n", outContent.toString());
	}
	
	
	
	public void testBausparkontoVerzinsung() {
		Bausparkonto bauspar = new Bausparkonto("Mickey Mouse", "Entenhausen",1000);
		
		Bausparkonto.setZins(3.0);
	    			     
		bauspar.einzahlen(500);		
		assertEquals("Der Konstostand nach der erstmaligen Einzahlung von 500 sollte 500 sein", 500.0, bauspar.getKontostand());	
						
		bauspar.berechneZins();
		assertEquals("Der Konstostand nach der erstmaligen Einzahlung von 500 und dann Zinsberechnung sollte " + Math.round((500.0+500.0*bausparZins/100.0)*100.0)/100.0 + " sein",
				Math.round((500.0+500.0*bausparZins/100.0)*100.0)/100.0,
				Math.round(bauspar.getKontostand()*100.0)/100.0);
	}
	
	
	
	// --------------------------------------- toString -------------------------------------------------------
	
	
	public void testToStringSparbuch() {
		assertEquals("toString von Sparbuch ist nicht wie definiert", 
				"Inhaber: Dagobert Duck\nKontostand: 0.0\nAnschrift: Entenhausen", 
				new Sparbuch("Dagobert Duck", "Entenhausen").toString());		
	}
	
	public void testToStringGiro() {
		
		assertEquals("toString von Girokonto ist nicht wie definiert", 
				"Inhaber: Dagobert Duck\nKontostand: 0.0\nAnschrift: Entenhausen",
				new Girokonto("Dagobert Duck", "Entenhausen", 200).toString());
		
	}
	
	public void testToStringBauspar() {
				
		assertEquals("toString von Bausparkonto ist nicht wie definiert",
				"Inhaber: Dagobert Duck\nKontostand: 0.0\nAnschrift: Entenhausen",
				new Bausparkonto("Dagobert Duck", "Entenhausen", 1000).toString());
	}
}
