package de.hs_lu.o2s.ueb_solution.ue6.huehner;

import junit.framework.TestCase;

public class TestHuehner extends TestCase {
	
	public void testKeinEiExceptionGeworfen(){
		
		Henne berta = new Henne("Berta");
		
		try {
			berta.checkValidEi();
			assertTrue("Berta sollte kein Ei haben und eine HenneVorhandenException werfen", false);
		} catch (KeinValidesEiException e) {
			assertTrue("Korrekt, Berta hat kein Ei und wirft die entsprechende Exception", true);
		} catch (Exception e) {
			assertTrue("Berta hat kein Ei, aber es wird nicht die HenneVorhandenException geworfen", true);
		}
		
	}
	
	public void testToStringOhneEi() {

		Henne berta = new Henne("Berta");
		System.out.println(berta.toString());
		
		assertTrue(berta.toString().equals("Diese Henne hat kein valides Ei"));

	}
	
	public void testToStringMitEiOhneWerte() {
		Ei ei = new Ei();
		
		Henne berta = new Henne("Berta", ei);
		System.out.println(berta.toString());
		
		assertTrue(berta.toString().equals("Diese Henne hat kein valides Ei"));

	}
	
	public void testToStringMitEiOhneFarbe() {
		Ei ei = new Ei();
		ei.setGroesse(5.8);
		
		Henne berta = new Henne("Berta", ei);
		System.out.println(berta.toString());
		
		assertTrue(berta.toString().equals("Diese Henne hat kein valides Ei"));

	}
	
	public void testToStringMitEiOhneGroesse() {
		Ei ei = new Ei();
		ei.setFarbe("braun");
		
		Henne berta = new Henne("Berta", ei);
		System.out.println(berta.toString());
		
		assertTrue(berta.toString().equals("Diese Henne hat kein valides Ei"));

	}
	
	public void testToStringMitValidemEi() {

		Henne berta = new Henne("Berta", new Ei("blau", 7));
		System.out.println(berta.toString());
		
		assertTrue(berta.toString().equals("Henne mit Name Berta und Ei mit Farbe blau und Groesse 7.0"));

	}
	
}
