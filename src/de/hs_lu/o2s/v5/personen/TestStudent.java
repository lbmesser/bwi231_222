package de.hs_lu.o2s.v5.personen;

import junit.framework.TestCase;

public class TestStudent extends TestCase {

	/**
	 * Testet den Konstruktor der Klasse Student, insbesondere
	 * darauf, dass die Attribute der Superklasse Person
	 * korrekt gesetzt werden.
	 */
	public void testStudent() {
		Student stud1 = new Student("Klara Gallottich", 1987, "654322");
		assertTrue(stud1.getName().equals("Klara Gallottich"));
		assertEquals(stud1.getGeburtsjahr(), 1987);
		assertTrue(stud1.getMatrNr().equals("654322"));
	}

}
