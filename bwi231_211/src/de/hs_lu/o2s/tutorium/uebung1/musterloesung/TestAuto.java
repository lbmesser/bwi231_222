package de.hs_lu.o2s.tutorium.uebung1.musterloesung;

import junit.framework.TestCase;

public class TestAuto extends TestCase {

	private Auto AutoStandardKonstruktor, AutoOhneZulassung, AutoMitZulassung;
	Person person;

	protected void setUp() throws Exception {
		this.AutoStandardKonstruktor = new Auto();
		this.AutoOhneZulassung = new Auto(79.0, 6.5, 49000, "MA-KJ-123");
		this.person = new Person("Benedikt", "Lüth", "22.04.1999");
		this.AutoMitZulassung = new Auto("LU-MS-220", 60.0, 4.5, 50000, person);
	}

	protected void tearDown() throws Exception {
		this.AutoStandardKonstruktor = null;
		this.AutoOhneZulassung = null;
		this.AutoMitZulassung = null;
		this.person = null;
	}

	public void testKonstruktor() {
		assertNull(this.AutoStandardKonstruktor.getKennzeichen());
		assertEquals("MA-KJ-123", this.AutoOhneZulassung.getKennzeichen());
		assertEquals(this.person, this.AutoMitZulassung.getBesitzer());
	}

	public void testToString() {
		assertEquals("Achtung, Auto ist nicht zugelassen.", this.AutoStandardKonstruktor.toString());
		assertEquals("Achtung, Auto ist nicht zugelassen.", this.AutoOhneZulassung.toString());
		assertEquals("Kilometerstand: 50000.0\nVerbrauch: 4.5\nKennzeichen: LU-MS-220\nBesitzer: Benedikt Lüth",
				this.AutoMitZulassung.toString());
		System.out.println(this.AutoMitZulassung);
	}

}
