package de.hs_lu.o2s.tutorium.uebung5.musterloesung;

import junit.framework.TestCase;

public class TestBoot extends TestCase {

	private Motorboot motorFreizeitboot;
	private Segelboot segelboot2000;

	protected void setUp() throws Exception {
		this.motorFreizeitboot = new Motorboot(5000, 4, 10, 10, 3, 1.5, 50, 100);
		this.segelboot2000 = new Segelboot(8000, 6, 10, 10, 10, 3, 200, 4);
	}

	protected void tearDown() throws Exception {
		this.motorFreizeitboot = null;
		this.segelboot2000 = null;
	}

	public void testCheckPersonen() {
		try {
			this.motorFreizeitboot.checkPersonen(5);
			assertTrue(
					"Es wollen mehr Personen das Boot betreten, als es Sitze hat, deshalb wird eine ZuVielePersonenException geworfen",
					false);
		} catch (ZuVielePersonenException e) {
			assertTrue("Korrekt, es sind zu viele Personen und es wurde eine ZuVielePersonenException geworfen", true);
		}
		try {
			this.segelboot2000.checkPersonen(11);
			assertTrue(
					"Es wollen mehr Personen das Boot betreten, als es Sitze hat, deshalb wird eine ZuVielePersonenException geworfen",
					false);
		} catch (ZuVielePersonenException e) {
			assertTrue("Korrekt, es sind zu viele Personen und es wurde eine ZuVielePersonenException geworfen", true);
		}
	}

}
