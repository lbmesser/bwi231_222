package de.hs_lu.o2s.v2.cardgames;

import junit.framework.TestCase;

public class TestSpielkarte extends TestCase {
	
	Spielkarte myCard;
	
	public void setUp() {
		myCard = new Spielkarte("kreuz", "as");
		// myCard.setFarbe("kreuz");
		// myCard.setWert("as");
	}
		
	/**
	 * Test, ob ein neues Spielkarten-Objekt angelegt werden kann
	 * und dessen Farbe bzw- Wert korrekt in den Objektvariablen gespeichert wird.
	 */
	public void testNewWriteRead() {
		assertEquals("kreuz", myCard.getFarbe());
		assertEquals("as", myCard.getWert());
	}
	
	public void testToString() {
		// "Spielkarte mit Farbe kreuz und Wert as"
		assertEquals("Spielkarte mit Farbe kreuz und Wert as", myCard.toString());
	}
	
	public void testGetMethoden() {
		assertEquals(myCard.getFarbe(), "kreuz");
		assertEquals(myCard.getWert(), "as");
		assertEquals(myCard.getPunktwert(), 11);
	}
	
	public void testSetMethoden() {
		myCard.setFarbe("karo");
		myCard.setWert("as");
		assertEquals(myCard.getFarbe(), "karo");
		assertEquals(myCard.getWert(), "as");
	}
	
	public void testEquals() {
		Spielkarte myCard1 = new Spielkarte("kreuz","as");
		Spielkarte myCard2 = new Spielkarte("karo","10");
		assertTrue(myCard.equals(myCard1));
		assertFalse(myCard == myCard1);
		assertFalse(myCard.equals(myCard2));
	}
}
