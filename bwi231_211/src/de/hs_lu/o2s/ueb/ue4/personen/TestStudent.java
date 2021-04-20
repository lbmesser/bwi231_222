package de.hs_lu.o2s.ueb.ue4.personen;

import junit.framework.TestCase;

public class TestStudent extends TestCase {

	/**
	 * Testet den Konstruktor der Klasse Student, insbesondere
	 * darauf, dass die Attribute der Superklasse Person
	 * korrekt gesetzt werden.
	 */
	public void testStudent() {
		Student stud1 = new Student("Klara Gallottich", 1987, "654322");
		assertTrue("Der Name ist nicht passen", stud1.getName().equals("Klara Gallottich"));
		assertEquals("Das Geburtsjahr ist nicht passend", 1987, stud1.getGeburtsjahr());
		assertTrue("Die Matrikelnummer ist nicht passen", stud1.getMatrNr().equals("654322"));
	}

}
