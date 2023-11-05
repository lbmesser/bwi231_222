package de.hs_lu.o2s.ueb_solution.ue3.mittelalter;

import junit.framework.TestCase;

public class TestKoenigreich2 extends TestCase {

	private Einwohner testEinwohner;
	private Bauer testBauer;
	private Adel testAdel;
	private Koenig testKoenig;
	private Leibeigener testLeibeigener;
	private Leibeigener testLeibeigener2;

	public void setUp() {
		this.testEinwohner = new Einwohner(20);
		this.testAdel = new Adel(20);
		this.testBauer = new Bauer(20);
		this.testKoenig = new Koenig(20);
		this.testLeibeigener = new Leibeigener(20);
		this.testLeibeigener2 = new Leibeigener(10);
	}

	public void testEinwohnerGetZuVersteuerndesEinkommen() {
		assertEquals("Das zu versteuernde Einkommen eines Einwohners mit Einkommen 20 sollte 16 sein", 16,
				this.testEinwohner.getZuVersteuerndesEinkommen());
	}

	public void testAdelGetZuVersteuerndesEinkommen() {
		assertEquals("Das zu versteuernde Einkommen eines Adeligen mit Einkommen 20 sollte 16 sein", 16,
				this.testAdel.getZuVersteuerndesEinkommen());
	}

	public void testBauerGetZuVersteuerndesEinkommen() {
		assertEquals("Das zu versteuernde Einkommen eines Bauern mit Einkommen 20 sollte 16 sein", 16,
				this.testBauer.getZuVersteuerndesEinkommen());
	}

	public void testKoenigGetZuVersteuerndesEinkommen() {
		assertEquals("Das zu versteuernde Einkommen eines Koenigs mit Einkommen 20 sollte 16 sein", 16,
				this.testKoenig.getZuVersteuerndesEinkommen());
	}

	public void testLeibeigener1GetZuVersteuerndesEinkommen() {
		assertEquals("Das zu versteuernde Einkommen eines Leibeigenen mit Einkommen 20 sollte 4 sein", 4,
				this.testLeibeigener.getZuVersteuerndesEinkommen());
	}

	public void testLeibeigener2GetZuVersteuerndesEinkommen() {
		assertEquals("Das zu versteuernde Einkommen eines Leibeigenen mit Einkommen 10 sollte 0 sein", 0,
				this.testLeibeigener2.getZuVersteuerndesEinkommen());
	}

	public void testEinwohnerGetSteuer() {
		assertEquals("Die Steuer eines Einwohners mit Einkommen 20 sollte 5 sein", 5, this.testEinwohner.getSteuer());
	}

	public void testAdelGetSteuer() {
		assertEquals("Die Steuer eines Adeligen mit Einkommen 20 sollte 20 sein", 20, this.testAdel.getSteuer());
	}

	public void testBauerGetSteuer() {
		assertEquals("Die Steuer eines Bauern mit Einkommen 20 sollte 5 sein", 5, this.testBauer.getSteuer());
	}

	public void testKoenigGetSteuer() {
		assertEquals("Die Steuer eines Koenigs mit Einkommen 20 sollte 2 sein", 2, this.testKoenig.getSteuer());
	}

	public void testLeibeigener1GetSteuer() {
		assertEquals("Die Steuer eines Leibeigenen mit Einkommen 20 sollte 5 sein", 5,
				this.testLeibeigener.getSteuer());
	}

	public void testLeibeigener2GetSteuer() {
		assertEquals("Die Steuer eines Leibeigenen mit Einkommen 10 sollte 5 sein", 5,
				this.testLeibeigener2.getSteuer());
	}

}
