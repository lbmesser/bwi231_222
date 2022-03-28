package de.hs_lu.o2s.v3.cardgames;

import junit.framework.TestCase;

public class TestKartenspiel extends TestCase {

	Kartenspiel myKartenspiel;
	public void setUp() {
		myKartenspiel = new Kartenspiel();
	}

	public void testGetKartenAnzahl() {
		assertEquals(myKartenspiel.getKartenAnzahl(), 52);
	}

	public void testGetPunktwert() {
		assertEquals(myKartenspiel.getPunktwert(), 296);
	}
	
	public void testGetKartenAA() {
		// testet, ob die Methode getKartenAA() 
		// eine Instanz vom Typ Spielkarte[][] zurückgibt
		assertTrue(myKartenspiel.getKartenAA() instanceof Spielkarte[][]);
	}

	public void testToString() {
		System.out.println(myKartenspiel.toString());
	}
}
