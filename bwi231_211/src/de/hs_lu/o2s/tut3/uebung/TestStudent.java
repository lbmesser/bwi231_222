package de.hs_lu.o2s.tut3.uebung;

import junit.framework.TestCase;

public class TestStudent extends TestCase {

	private Student studentWeit, studentMitte, studentAnfang, studentOhneECTS;
	private Dozent dozent;

	protected void setUp() throws Exception {
		this.studentWeit = new Student("Max Mustermann", "20.04.1999", 632101, 6, 160, "Dienstleistung");
		this.studentMitte = new Student("Sebastian Braun", "10.01.2000", 632102, 4, 90, "Dienstleistung");
		this.studentAnfang = new Student("Anna Holz", "05.10.2003", 632103, 2, 30, "Dienstleistung");
		this.studentOhneECTS = new Student("Johanna Montag", "26.12.2002", 632104);
		this.dozent = new Dozent("Prof. Dr. Lothar Mayer", "17.08.1970");
	}

	protected void tearDown() throws Exception {
		this.studentWeit = null;
		this.studentMitte = null;
		this.studentAnfang = null;
		this.studentOhneECTS = null;
		this.dozent = null;
	}

	public void testCompareTo() {
		assertEquals(130, this.studentWeit.compareTo(this.studentAnfang));
		assertEquals(-130, this.studentAnfang.compareTo(this.studentWeit));

		assertEquals(60, this.studentMitte.compareTo(this.studentAnfang));
		assertEquals(-60, this.studentAnfang.compareTo(this.studentMitte));

		assertEquals(160, this.studentWeit.compareTo(this.studentOhneECTS));
		assertEquals(-160, this.studentOhneECTS.compareTo(this.studentWeit));
		
		assertEquals(Integer.MIN_VALUE, this.studentWeit.compareTo(this.dozent));
	}

}
