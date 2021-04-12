package de.hs_lu.o2s.tut2.uebung;

import junit.framework.TestCase;

public class TestHilfskraft extends TestCase {

	Hilfskraft elektrikonikGehilfe, schlosserGehilfe, schreinerGehilfe;

	protected void setUp() throws Exception {
		this.elektrikonikGehilfe = new Hilfskraft(10000);
		this.schlosserGehilfe = new Hilfskraft(20000);
		this.schreinerGehilfe = new Hilfskraft(9999);
	}

	protected void tearDown() throws Exception {
		this.elektrikonikGehilfe = null;
		this.schlosserGehilfe = null;
		this.schreinerGehilfe = null;
	}

	public void testKonstruktor() {
		assertEquals(10000.0, this.elektrikonikGehilfe.getJahresBruttoGehalt());
		assertEquals(20000.0, this.schlosserGehilfe.getJahresBruttoGehalt());
		assertEquals(9999.0, this.schreinerGehilfe.getJahresBruttoGehalt());
	}

	public void testBerechneNettoGehalt() {
		assertEquals(6500, this.elektrikonikGehilfe.berechneNettoGehalt());
		assertEquals(13000, this.schlosserGehilfe.berechneNettoGehalt());
		assertEquals(0, this.schreinerGehilfe.berechneNettoGehalt());
	}

}
