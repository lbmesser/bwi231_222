package de.hs_lu.o2s.tutorium.uebung2.vorlage;

import junit.framework.TestCase;

public class TestHandwerker extends TestCase {

	Handwerker elektriker, schlosser, schreiner;

	protected void setUp() throws Exception {
		this.elektriker = new Handwerker(30000);
		this.schlosser = new Handwerker(20000);
		this.schreiner = new Handwerker(28000);
	}

	protected void tearDown() throws Exception {
		this.elektriker = null;
		this.schlosser = null;
		this.schreiner = null;
	}

	public void testKonstruktor() {
		assertEquals(30000.0, this.elektriker.getJahresBruttoGehalt());
		assertEquals(20000.0, this.schlosser.getJahresBruttoGehalt());
		assertEquals(28000.0, this.schreiner.getJahresBruttoGehalt());
	}

	public void testBerechneNettoGehalt() {
		assertEquals(19500, this.elektriker.berechneNettoGehalt());
		assertEquals(13000, this.schlosser.berechneNettoGehalt());
		assertEquals(18200, this.schreiner.berechneNettoGehalt());
	}

}
