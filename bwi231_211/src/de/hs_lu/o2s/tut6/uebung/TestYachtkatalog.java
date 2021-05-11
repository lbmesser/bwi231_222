package de.hs_lu.o2s.tut6.uebung;

import de.hs_lu.o2s.tut1.uebung.Person;
import junit.framework.TestCase;

public class TestYachtkatalog extends TestCase {

	private Yachtkatalog yachtKatalog;
	private Segelboot atlantis, phantom;
	private Rettungsboot opalRuderboot, kolibriSchlauchboot;

	protected void setUp() throws Exception {
		this.yachtKatalog = new Yachtkatalog();
		this.atlantis = new Segelboot("Atlantis", 80000.00, 50);
		this.phantom = new Segelboot("Phantom", 100000.0, 100);
		this.opalRuderboot = new Rettungsboot("Opal Ruderboot", 1200.00, 6);
		this.kolibriSchlauchboot = new Rettungsboot("Kolibri Schlauchboot", 800.00, 4);
	}

	protected void tearDown() throws Exception {
		this.yachtKatalog = null;
		this.atlantis = null;
		this.phantom = null;
		this.opalRuderboot = null;
		this.kolibriSchlauchboot = null;
	}

	public void testToAdd() {
		assertTrue(this.yachtKatalog.add(atlantis));
		assertTrue(this.yachtKatalog.contains(atlantis));
		assertTrue(this.yachtKatalog.add(opalRuderboot));
		assertTrue(this.yachtKatalog.contains(opalRuderboot));

		// Jedes Boot hat eine eindeutige Kombination aus Name und Kaufpreis. Es darf
		// somit in dem Yachtkatalog nicht zweimal ein Boot hinzugefügt werden, das
		// bspw. „Atlantis“ heißt und 80.000 € kostet (auch dann nicht, wenn dieses Boot
		// in zwei unterschiedlichen Objekten gespeichert ist)
		assertFalse(this.yachtKatalog.add(atlantis));
		assertFalse(this.yachtKatalog.add(new Segelboot("Atlantis", 80000.00, 100)));

		assertFalse(this.yachtKatalog.add(opalRuderboot));
		assertFalse(this.yachtKatalog.add(new Rettungsboot("Opal Ruderboot", 1200.00, 8)));

		assertFalse(this.yachtKatalog.add(new Rettungsboot("Atlantis", 80000.00, 8)));

		// Wir möchten außerdem erreichen, dass in diese Collection nur Boot-Objekte
		// aufgenommen werden können.
		assertFalse(this.yachtKatalog.add(new Person("Benedikt", "Lüth", "22.04.1999")));
	}

	public void testToString() {
		assertTrue(this.yachtKatalog.add(atlantis));
		assertTrue(this.yachtKatalog.add(phantom));
		assertTrue(this.yachtKatalog.add(opalRuderboot));
		assertTrue(this.yachtKatalog.add(kolibriSchlauchboot));

		this.atlantis.setRettungsboot(opalRuderboot);
		String expectetString = "Unsere premium Yacht: Phantom, Listenpreis: 100000.0\n"
				+ "Segelboot: Atlantis, Listenpreis: 80000.0, inkl. Rettungsboot: Opal Ruderboot, Listenpreis: 1200.0\n"
				+ "Segelboot: Phantom, Listenpreis: 100000.0\n" + "Rettungsboot: Opal Ruderboot, Listenpreis: 1200.0\n"
				+ "Rettungsboot: Kolibri Schlauchboot, Listenpreis: 800.0\n";
		assertEquals(expectetString, this.yachtKatalog.toString());

		System.out.println(this.yachtKatalog);

	}

}
