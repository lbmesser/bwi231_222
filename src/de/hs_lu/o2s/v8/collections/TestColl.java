package de.hs_lu.o2s.v8.collections;

import java.util.HashSet;

import de.hs_lu.o2s.v2.cardgames.Spielkarte;
import junit.framework.TestCase;

public class TestColl extends TestCase {
	HashSet coll;
	Spielkarte card1;
	
	public void setUp() {
		coll = new HashSet();
		card1 = new Spielkarte("kreuz","as");
	}
	
	public void testContains() {
		coll.add(card1);
		coll.add(new Spielkarte("kreuz", "as"));
		
		assertTrue("card1 sollte im HashSet sein", coll.contains(card1));
		coll.remove(card1);
		//assertTrue("card1 sollte nicht mehr im HashSet sein", !coll.contains(card1));
		assertFalse("card1 sollte nicht mehr im HashSet sein", coll.contains(card1));
	}
	
	public void testSize() {
		coll.add(card1);
		coll.add(new Spielkarte("kreuz", "as"));
		
		assertEquals("Es sollten 2 Elemente im HashSet sein", coll.size(), 2);
		coll.remove(card1);
		assertEquals("Es sollte 1 Element im HashSet sein", coll.size(), 1);
		
	}
	
}
