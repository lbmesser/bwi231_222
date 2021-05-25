package de.hs_lu.o2s.tut8.uebung;

import junit.framework.TestCase;

public class TestLKW extends TestCase {

	LKW lkw;

	protected void setUp() throws Exception {
		this.lkw = new LKW(new Motor(16, 500, "Diesel"), 120, 25, 3);
	}

	protected void tearDown() throws Exception {
		this.lkw = null;
	}

	public void testBeladen() {

		try {
			this.lkw.beladen(-10);
			assertEquals(
					"Es soll eine Nutzlast mit negativen Gewicht verladen werden, deshalb veraendert sich die geladeneNutzlast nicht",
					0.0, this.lkw.getGeladeneNutzlast());
		} catch (ZuSchwerException e) {
			assertTrue("Es wird keine ZuSchwerException geworfen", false);
		}

		try {
			this.lkw.beladen(26);
			assertTrue("Es werden 26 t in den LKW verladen, deshalb wird eine ZuSchwerException geworfen", false);
		} catch (ZuSchwerException e) {
			assertTrue(
					"Es wird eine ZuSchwerException geworfen, da die zu beladene Nutzlast groesser der maximal zulaessigen Gesamtmasse ist",
					true);
			assertEquals("Die geladene Nutzlast wurde nicht angepasst", 0.0, this.lkw.getGeladeneNutzlast());
		}

		try {
			this.lkw.beladen(25);
			assertEquals("Es werden 25 t in den LKW verladen", 25.0, this.lkw.getGeladeneNutzlast());
		} catch (ZuSchwerException e) {
			assertTrue(
					"Es wird keine ZuSchwerException geworfen, da die zu beladene Nutzlast kleinergleich der maximal zulaessigen Gesamtmasse ist",
					false);
		}

		try {
			this.lkw.beladen(1);
			assertTrue(
					"Es wird 1 t in den LKW verladen. Da aber bereits 25 t verladen wurde, ueberschreitet dies die maximal zulaessige Gesamtmasse und es wird eine ZuSchwerException geworfen",
					false);
		} catch (ZuSchwerException e) {
			assertTrue(
					"Es wird eine ZuSchwerException geworfen, da die insgesamt beladene Nutzlast groesser der maximal zulaessigen Gesamtmasse ist",
					true);
			assertEquals("Die geladene Nutzlast wurde nicht angepasst", 25.0, this.lkw.getGeladeneNutzlast());
		}
	}

}
