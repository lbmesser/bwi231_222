/*
 * 7 Punkte
 */
package de.hs_lu.o2s.ueb_solution.ue1.huehner;

import junit.framework.TestCase;

public class TestHuehner extends TestCase { // JUnit-Test-Case korrekt erzeugt (0.5 Punkte)

	public void testBertaBraunEi() {
		Ei myEi = new Ei("braun", 5.0); // 1 Punkt
		Henne berta = new Henne("Berta", myEi); // 1 Punkt
		System.out.println(berta); // 1 Punkt
	}

	public void testGetGroesse() {
		Ei myEi = new Ei("weiss", 10.0); // 1 Punkt
		/*
		 * Achtung: die groesse wird als double gespeichert. Wenn man hier 10 nutzt und
		 * beim assert auch 10, dann schlägt der Test fehl wegen unterschiedlicher
		 * Typen!
		 * 
		 */
		Henne erna = new Henne("Erna", myEi); // 1 Punkt

		assertEquals(10.0, erna.getEi().getGroesse()); // 1.5 Punkte
	}
}
