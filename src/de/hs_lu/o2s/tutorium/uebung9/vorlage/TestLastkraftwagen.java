package de.hs_lu.o2s.tutorium.uebung9.vorlage;

import junit.framework.TestCase;

public class TestLastkraftwagen extends TestCase {

	Lastkraftwagenfahrer fahrerKlasseB, fahrerKlasseC, fahrerKlasseC1, fahrerKlasseC1E;
	Lastkraftwagen lkwKlasseC, lkwKlasseC1, lkwKlasseC1E;

	protected void setUp() throws Exception {
		this.fahrerKlasseB = new Lastkraftwagenfahrer("122", "Benedikt Lueth", "B");
		this.fahrerKlasseC = new Lastkraftwagenfahrer("123", "Thorsten Mayer", "C");
		this.fahrerKlasseC1 = new Lastkraftwagenfahrer("124", "Guenther Braun", "C1");
		this.fahrerKlasseC1E = new Lastkraftwagenfahrer("125", "Peter Dietrich", "C1E");
		this.lkwKlasseC = new Lastkraftwagen(new Motor(17, 500, "Diesel"), 100, 7.4, 3);
		this.lkwKlasseC1 = new Lastkraftwagen(new Motor(18, 540, "Diesel"), 100, 7.5, 3);
		this.lkwKlasseC1E = new Lastkraftwagen(new Motor(20, 560, "Diesel"), 100, 8, 3);
		this.lkwKlasseC1E.setAnhaenger(new Anhaenger("Mehrachsiger-Haenger", "Aufliegeranhaenger"));
	}

	protected void tearDown() throws Exception {
		this.fahrerKlasseC = null;
		this.fahrerKlasseC1 = null;
		this.fahrerKlasseC1E = null;
		this.lkwKlasseC = null;
		this.lkwKlasseC1 = null;
		this.lkwKlasseC1E = null;
	}

	public void testSetFahrer() {
		this.lkwKlasseC.setFahrer(this.fahrerKlasseB);
		assertEquals(null, this.lkwKlasseC.getFahrer());
		this.lkwKlasseC.setFahrer(this.fahrerKlasseC);
		assertEquals(this.fahrerKlasseC, this.lkwKlasseC.getFahrer());
		this.lkwKlasseC.setFahrer(this.fahrerKlasseC1);
		assertEquals(this.fahrerKlasseC1, this.lkwKlasseC.getFahrer());
		this.lkwKlasseC.setFahrer(this.fahrerKlasseC1E);
		assertEquals(this.fahrerKlasseC1E, this.lkwKlasseC.getFahrer());

		this.lkwKlasseC1.setFahrer(this.fahrerKlasseB);
		assertEquals(null, this.lkwKlasseC1.getFahrer());
		this.lkwKlasseC1.setFahrer(fahrerKlasseC);
		assertEquals(null, this.lkwKlasseC1.getFahrer());
		this.lkwKlasseC1.setFahrer(this.fahrerKlasseC1);
		assertEquals(this.fahrerKlasseC1, this.lkwKlasseC1.getFahrer());
		this.lkwKlasseC1.setFahrer(this.fahrerKlasseC1E);
		assertEquals(this.fahrerKlasseC1E, this.lkwKlasseC1.getFahrer());

		this.lkwKlasseC1E.setFahrer(this.fahrerKlasseB);
		assertEquals(null, this.lkwKlasseC1E.getFahrer());
		this.lkwKlasseC1E.setFahrer(this.fahrerKlasseC);
		assertEquals(null, this.lkwKlasseC1E.getFahrer());
		this.lkwKlasseC1E.setFahrer(this.fahrerKlasseC1);
		assertEquals(null, this.lkwKlasseC1E.getFahrer());
		this.lkwKlasseC1E.setFahrer(this.fahrerKlasseC1E);
		assertEquals(this.fahrerKlasseC1E, this.lkwKlasseC1E.getFahrer());
	}

}
