package de.hs_lu.o2s.tutorium.uebung4.musterloesung;

import junit.framework.TestCase;

public class TestBoot extends TestCase {

	private Motorboot motorFreizeitboot, motorRennboot3000;
	private Segelboot segelboot2000;
	private Person benedikt;

	protected void setUp() throws Exception {
		this.motorFreizeitboot = new Motorboot(5000, 4, 10, 10, 3, 1.5, 50, 100);
		this.motorRennboot3000 = new Motorboot(2500, 2, 30, 15, 3, 2, 100, 75);
		this.segelboot2000 = new Segelboot(8000, 6, 10, 10, 10, 3, 200);
		this.benedikt = new Person("Christian", "Walter", "10.09.1995");
	}

	protected void tearDown() throws Exception {
		this.motorFreizeitboot = null;
		this.motorRennboot3000 = null;
		this.segelboot2000 = null;
		this.benedikt = null;
	}

	public void testCompareTo() {
		assertEquals(Integer.MIN_VALUE, motorFreizeitboot.compareTo(this.benedikt));

		assertEquals(-20, this.motorFreizeitboot.compareTo(this.motorRennboot3000));
		assertEquals(20, this.motorRennboot3000.compareTo(this.motorFreizeitboot));

		assertEquals(20, this.motorRennboot3000.compareTo(this.segelboot2000));
		assertEquals(-20, this.segelboot2000.compareTo(this.motorRennboot3000));

		assertEquals(2, this.segelboot2000.compareTo(this.motorFreizeitboot));
		assertEquals(-2, this.motorFreizeitboot.compareTo(this.segelboot2000));
	}

}
