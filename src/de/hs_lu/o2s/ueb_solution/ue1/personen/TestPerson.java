/*
 * 12 Punkte
 */
package de.hs_lu.o2s.ueb_solution.ue1.personen;

import junit.framework.TestCase;

public class TestPerson extends TestCase { // JUnit-Test-Case korrekt erzeugt (0.5 Punkte)

	public void testAdressenPerson() {
		// 0.5 Punkte
		Adresse adr1 = new Adresse("Gruener Weg", "12", "67434", "Neustadt/Weinstr.", "Rheinland-Pfalz", "Deutschland");
		// 0.5 Punkte
		Adresse adr2 = new Adresse("Ernst-Boehe-Str.", "4", "67059", "Ludwigshafen am Rhein", "Rheinland-Pfalz",
				"Deutschland");
		System.out.println(adr1);// 0.5 Punkte
		System.out.println();
		System.out.println(adr2);// 0.5 Punkte
		System.out.println();

		Person pers1 = new Person("Arthur", "Clarke"); // 0.5 Punkte
		pers1.setAdresse(adr1); // 0.5 Punkte
		Person pers2 = new Person("Peter", "Mudra", adr2); // 1 Punkt
		Person pers3 = new Person("Thomas", "Schüssler",
				new Adresse("Paul-Wittsack-Straße", "10", "68163", "Mannheim", "Baden-Württemberg", "Deutschland"));
		// 1 Punkte
		pers1.setBerufstaetig(false); // 0.5 Punkte
		pers2.setBerufstaetig(true); // 0.5 Punkte
		pers2.setBeruf("Lehrer"); // 0.5 Punkte
		pers3.setBerufstaetig(true); // 0.5 Punkte
		pers3.setBeruf("Lehrer"); // 0.5 Punkte

		System.out.println(pers1); // 0.5 Punkte
		System.out.println();
		System.out.println(pers2); // 0.5 Punkte
		System.out.println();
		System.out.println(pers3); // 0.5 Punkte
	}

	public void testGeburtsjahr() {
		Person pers = new Person("Hans", "Meier"); // 0.5 Punkt
		pers.setGeburtsjahr(1980); // 0.5 Punkt

		assertEquals(1980, pers.getGeburtsjahr()); // 1.5 Punkt

	}
}
