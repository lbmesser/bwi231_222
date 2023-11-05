package de.hs_lu.o2s.ueb_solution.ue6.unterhaltung;

import junit.framework.TestCase;

public class TestZuJungExceptions extends TestCase {

	public void testZuJungExceptionGeworfenDisco() {

		Disco myDisco = new Disco(550); // eine Disco mit max. 550 Personen anlegen

		Person pers1 = new Person("Guenter", 1997);

		try {
			myDisco.pruefeGast(pers1);
			assertTrue("Korrekt, pers1 hat Zutritt zu myDisco", true);
		} catch (ZuJungException e) {
			assertTrue("Falsch, pers1 hat Zutritt zu myDisco, es wird aber eine ZuJungException geworfen", false);
		} catch (Exception e) {
			assertTrue("Falsch, pers1 hat Zutritt zu myDisco, es wird aber eine allgemeine Exception geworfen", false);
		}

		Person pers2 = new Person("Eric", 2002);

		try {
			myDisco.pruefeGast(pers2);
			assertTrue("Falsch, pers2 darf keinen Zutritt zu myDisco haben", false);
		} catch (ZuJungException e) {
			assertTrue("Korrekt, pers2 hat keine Zutritt zu myDisco und es wird die ZuJungException geworfen", true);
			assertEquals("Die Fehlermeldung stimmt nicht", "Diese Person ist zu jung.", e.getMessage());
		} catch (Exception e) {
			assertTrue(
					"Falsch, es wird zwar eine Exception geworfen, aber es sollte die ZuJungException kommen, wenn pers2 in myDisco moechte",
					false);
		}

	}

	public void testZuJungExceptionGeworfenStudent() {

		try {
			Student stud1 = new StudentAgeChecked("Martin", 2008);
			assertTrue("Falsch, stud1 darf nicht angelegt werden", false);
		} catch (ZuJungZumStudierenException zje) {
			assertTrue(
					"Korrekt, stud1 darf nicht angelegt werden und es wird stattdessen die ZuJungZumStudierenException geworfen",
					true);
			assertEquals("Die Fehlermeldung stimmt nicht", "Diese Person ist zu jung zum Studieren.", zje.getMessage());
		} catch (ZuJungException e) {
			assertTrue(
					"Falsch, es wird zwar die ZuJungException geworfen, aber es sollte die ZuJungZumStudierenException kommen",
					false);
		} catch (Exception e) {
			assertTrue(
					"Falsch, es wird zwar eine Exception geworfen, aber es sollte die ZuJungZumStudierenException kommen",
					false);
		}

	}

	public void testZuJungExceptionGeworfenStudentMitMatrnr() {

		try {
			Student stud1 = new StudentAgeChecked("Martin", 2008, "111111");
			assertTrue("Falsch, stud1 darf nicht angelegt werden", false);
		} catch (ZuJungZumStudierenException zje) {
			assertTrue(
					"Korrekt, stud1 darf nicht angelegt werden und es wird stattdessen die ZuJungZumStudierenException geworfen",
					true);
			assertEquals("Die Fehlermeldung stimmt nicht", "Diese Person ist zu jung zum Studieren.", zje.getMessage());
		} catch (ZuJungException zje) {
			assertTrue(
					"Falsch, es wird zwar die ZuJungException geworfen, aber es sollte die ZuJungZumStudierenException kommen",
					false);
		} catch (Exception e) {
			assertTrue("Falsch, es wird zwar eine Exception geworfen, aber es sollte die ZuJungException kommen",
					false);
		}

	}

}
