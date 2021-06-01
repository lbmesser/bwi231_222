package de.hs_lu.o2s.tutorium.uebung7.vorlage;

import junit.framework.TestCase;

public class TestMachtnutzer extends TestCase {

	private Machtnutzer countDooku, kyloRen, maul, lukeSkywalker, yoda;

	protected void setUp() throws Exception {
		this.countDooku = new Machtnutzer("Count Dooku", "Seperatisten", "Sith Lord");
		this.kyloRen = new Machtnutzer("Kylo Ren", "Erste Ordnung", "Sith-Schueler");
		this.maul = new Machtnutzer("Darth Maul", "Seperatisten", "Sith-Schueler");
		this.lukeSkywalker = new Machtnutzer("Luke Skywalker", "Republik", "Jedi-Meister");
		this.yoda = new Machtnutzer("Yoda", "Republik", "Jedi Meister");
	}

	protected void tearDown() throws Exception {
		this.countDooku = null;
		this.kyloRen = null;
		this.maul = null;
		this.lukeSkywalker = null;
		this.yoda = null;
	}

	public void testToString() {
		assertEquals("Sith Lord Count Dooku ist ein Machtnutzer und gehoert zu Seperatisten",
				this.countDooku.toString());
		assertEquals("Sith-Schueler Kylo Ren ist ein Machtnutzer und gehoert zu Erste Ordnung",
				this.kyloRen.toString());
		assertEquals("Sith-Schueler Darth Maul ist ein Machtnutzer und gehoert zu Seperatisten", this.maul.toString());
		assertEquals("Jedi-Meister Luke Skywalker ist ein Machtnutzer und gehoert zu Republik",
				this.lukeSkywalker.toString());
		assertEquals("Jedi Meister Yoda ist ein Machtnutzer und gehoert zu Republik", this.yoda.toString());
	}

}
