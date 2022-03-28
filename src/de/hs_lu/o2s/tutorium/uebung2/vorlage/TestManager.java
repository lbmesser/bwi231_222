package de.hs_lu.o2s.tutorium.uebung2.vorlage;

import junit.framework.TestCase;

public class TestManager extends TestCase {

	Manager managerFinanzen, managerVertrieb, managerProduktion;

	protected void setUp() throws Exception {
		this.managerFinanzen = new Manager(100000);
		this.managerVertrieb = new Manager(60000);
		this.managerProduktion = new Manager(50000);
	}

	protected void tearDown() throws Exception {
		this.managerFinanzen = null;
		this.managerVertrieb = null;
		this.managerProduktion = null;
	}

	public void testKonstruktor() {
		assertEquals(100000.0, this.managerFinanzen.getJahresBruttoGehalt());
		assertEquals(60000.0, this.managerVertrieb.getJahresBruttoGehalt());
		assertEquals(50000.0, this.managerProduktion.getJahresBruttoGehalt());
	}

	public void testBerechneNettoGehalt() {
		assertEquals(50000, this.managerFinanzen.berechneNettoGehalt());
		assertEquals(30000, this.managerVertrieb.berechneNettoGehalt());
		assertEquals(25000, this.managerProduktion.berechneNettoGehalt());
	}

}
