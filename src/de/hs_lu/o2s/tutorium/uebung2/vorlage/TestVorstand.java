package de.hs_lu.o2s.tutorium.uebung2.vorlage;

import junit.framework.TestCase;

public class TestVorstand extends TestCase {

	Vorstand vorstandFinanzen, vorstandVertrieb, vorstandProduktion;

	protected void setUp() throws Exception {
		this.vorstandFinanzen = new Vorstand(1000000);
		this.vorstandVertrieb = new Vorstand(999999);
		this.vorstandProduktion = new Vorstand(2000000);
	}

	protected void tearDown() throws Exception {
		this.vorstandFinanzen = null;
		this.vorstandVertrieb = null;
		this.vorstandProduktion = null;
	}

	public void testKonstruktor() {
		assertEquals(1000000.0, this.vorstandFinanzen.getJahresBruttoGehalt());
		assertEquals(999999.0, this.vorstandVertrieb.getJahresBruttoGehalt());
		assertEquals(2000000.0, this.vorstandProduktion.getJahresBruttoGehalt());
	}

	public void testBerechneNettoGehalt() {
		assertEquals(400000, this.vorstandFinanzen.berechneNettoGehalt());
		assertEquals(500000, this.vorstandVertrieb.berechneNettoGehalt());
		assertEquals(900000, this.vorstandProduktion.berechneNettoGehalt());
	}

}
