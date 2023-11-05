// 6 Punkte

package de.hs_lu.o2s.ueb_solution.ue4.personen;

import junit.framework.TestCase;

public class TestStudent extends TestCase {

	/**
	 * Testet den Konstruktor der Klasse Student, insbesondere
	 * darauf, dass die Attribute der Superklasse Person
	 * korrekt gesetzt werden.
	 */
	public void testStudent() {
		Student stud1 = new Student("Klara Gallottich", 1987, "654322");
		assertTrue("Der Name ist nicht passend", stud1.getName().equals("Klara Gallottich"));
		assertEquals("Das Geburtsjahr ist nicht passend", 1987, stud1.getGeburtsjahr());
		assertTrue("Die Matrikelnummer ist nicht passen", stud1.getMatrNr().equals("654322"));
	}
	
	// Aufgabe 2g
	// Gesamt: 6 Punkte
	// Kommentar: 2 Punkte
	public void testGesamtgebuehr(){
		Student myStud = new Student("Julia Meier", "123456", 4); // 2 Punkte
		assertEquals("Die Gesamtgebuher sollte 720 sein", 720.0, myStud.getGesamtgebuehr()); // 2 Punkte
	}
}
