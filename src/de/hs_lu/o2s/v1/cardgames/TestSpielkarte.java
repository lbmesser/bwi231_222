package de.hs_lu.o2s.v1.cardgames;

import junit.framework.TestCase;

public class TestSpielkarte extends TestCase {
	/**
	 * Test, ob ein neues Spielkarten-Objekt angelegt werden kann
	 * und dessen Farbe bzw- Wert korrekt in den Objektvariablen gespeichert wird.
	 */
	public void testNewWriteRead() {
		Spielkarte myCard = new Spielkarte();
		myCard.farbe = "kreuz";
		myCard.wert = "as";
		
		assertEquals("kreuz", myCard.farbe);
		assertEquals("as", myCard.wert);
	}
}
