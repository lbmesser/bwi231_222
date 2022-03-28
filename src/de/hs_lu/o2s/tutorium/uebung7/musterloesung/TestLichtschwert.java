package de.hs_lu.o2s.tutorium.uebung7.musterloesung;

import junit.framework.TestCase;

public class TestLichtschwert extends TestCase {

	private Lichtschwert countDookusSchwert, kyloRensSchwert, maulsSchwert, lukeSkywalkersSchwert, yodasSchwert;

	protected void setUp() throws Exception {
		this.countDookusSchwert = new Lichtschwert("rot", "gebogen", "einfache Klinge");
		this.kyloRensSchwert = new Lichtschwert("rot", "gerade", "Cross-Klinge");
		this.maulsSchwert = new Lichtschwert("rot", "gerade", "Doppelklinge");
		this.lukeSkywalkersSchwert = new Lichtschwert("blau", "gerade", "einfache Klinge");
		this.yodasSchwert = new Lichtschwert("gruen", "gerade", "einfache Klinge");
	}

	protected void tearDown() throws Exception {
		this.countDookusSchwert = null;
		this.kyloRensSchwert = null;
		this.maulsSchwert = null;
		this.lukeSkywalkersSchwert = null;
		this.yodasSchwert = null;
	}

	public void testToString() {
		assertEquals("Lichtschwert mit Kristallfarbe rot, Griffform gebogen und Klinge einfache Klinge",
				this.countDookusSchwert.toString());
		assertEquals("Lichtschwert mit Kristallfarbe rot, Griffform gerade und Klinge Cross-Klinge",
				this.kyloRensSchwert.toString());
		assertEquals("Lichtschwert mit Kristallfarbe rot, Griffform gerade und Klinge Doppelklinge",
				this.maulsSchwert.toString());
		assertEquals("Lichtschwert mit Kristallfarbe blau, Griffform gerade und Klinge einfache Klinge",
				this.lukeSkywalkersSchwert.toString());
		assertEquals("Lichtschwert mit Kristallfarbe gruen, Griffform gerade und Klinge einfache Klinge",
				this.yodasSchwert.toString());
	}

}
