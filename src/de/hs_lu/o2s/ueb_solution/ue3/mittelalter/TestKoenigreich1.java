package de.hs_lu.o2s.ueb_solution.ue3.mittelalter;

import junit.framework.TestCase;

public class TestKoenigreich1 extends TestCase {

	private Einwohner testEinwohner;

	public void setUp() {
		this.testEinwohner = new Einwohner(50);
	}

	public void testEinwohnerGetZuVersteuerndesEinkommen() {
		assertEquals("Das zu versteuernde Einkommen des Einwohners mit Einkommen 50 sollte 40 sein", 40,
				this.testEinwohner.getZuVersteuerndesEinkommen());
	}

	public void testEinwohnerGetSteuer() {
		assertEquals("Die Steuer des Einwohners mit Einkommen 50 sollte 8 sein", 8, this.testEinwohner.getSteuer());
	}
}
