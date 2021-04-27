package de.hs_lu.o2s.tut4.uebung;

import java.util.Iterator;

import junit.framework.TestCase;

public class TestBootListDoubleIterator extends TestCase {

	private BootList bootListeLeer, bootListeEinBoot, bootListeZweiBoote, bootListeDreiBoote;
	private Motorboot motorFreizeitboot, motorRennboot3000;
	private Segelboot segelboot2000;

	public void setUp() {
		motorFreizeitboot = new Motorboot(5000, 4, 10, 10, 3, 1.5, 50, 100);
		motorRennboot3000 = new Motorboot(2500, 2, 30, 15, 3, 2, 100, 75);
		segelboot2000 = new Segelboot(8000, 10, 8, 20, 5, 3, 200);
		bootListeLeer = new BootList();
		bootListeEinBoot = new BootList(motorFreizeitboot);
		bootListeZweiBoote = new BootList(new Boot[] { motorFreizeitboot, motorRennboot3000 });
		bootListeDreiBoote = new BootList(new Boot[] { motorFreizeitboot, motorRennboot3000, segelboot2000 });
	}

	public void testHasNext() {
		assertFalse("Stellt sicher, dass die Methode hasNext() bei leeren Listen false zurück gibt",
				bootListeLeer.iterator().hasNext());
		assertTrue("Stellt sicher, dass die Methode hasNext() bei gefüllten Listen true zurück gibt",
				bootListeEinBoot.iterator().hasNext());
		assertTrue("Stellt sicher, dass die Methode hasNext() bei gefüllten Listen true zurück gibt",
				bootListeZweiBoote.iterator().hasNext());
	}

	public void testNextBootListeEinBoot() {
		assertEquals("Stellt sicher, dass die Methode next() null für leere Liste zurückgibt", null,
				bootListeLeer.iterator().next());

		Iterator bootListDoubleIterator = bootListeEinBoot.iterator();
		assertEquals("Stellt sicher, dass die Methode next() die nächste Person zurückgibt", motorFreizeitboot,
				bootListDoubleIterator.next());
		assertEquals("Stellt sicher, dass die Methode next() die nächste Person zweimal zurückgibt", motorFreizeitboot,
				bootListDoubleIterator.next());
		assertFalse("Jetzt muss der Iterator aufgebraucht sein, da Benedikt zweimal ausgegeben wurden",
				bootListDoubleIterator.hasNext());
	}

	public void testNextBootListeZweiBoote() {
		Iterator bootListDoubleIterator = bootListeZweiBoote.iterator(); // Für jeden Schleife bzw. Iteration brauch
																			// man einen eigenen Iterator
		System.out.println(bootListDoubleIterator);
		assertEquals("Stellt sicher, dass die Methode next() die nächste Person zurückgibt", motorFreizeitboot,
				bootListDoubleIterator.next());
		System.out.println(bootListDoubleIterator);
		assertEquals("Stellt sicher, dass die Methode next() die Person nocheinmal zurückgibt", motorFreizeitboot,
				bootListDoubleIterator.next());
		System.out.println(bootListDoubleIterator);
		assertEquals("Stellt sicher, dass die Methode next() die nächste Person zurückgibt", motorRennboot3000,
				bootListDoubleIterator.next());
		System.out.println(bootListDoubleIterator);
		assertEquals("Stellt sicher, dass die Methode next() die Person nocheinmal zurückgibt", motorRennboot3000,
				bootListDoubleIterator.next());
		assertFalse("Jetzt muss der Iterator aufgebraucht sein, da beide Personen ausgegeben wurden",
				bootListDoubleIterator.hasNext());
		System.out.println(bootListDoubleIterator);
		assertFalse("Der Iterator muss jetzt aufgebraucht sein.", bootListDoubleIterator.hasNext());
	}

	public void testNextBootListeDreiBoote() {
		// Für jede Schleife bzw. Iteration brauch man eine neue Iterator Instanz
		Iterator bootListDoubleIterator = bootListeDreiBoote.iterator();
		System.out.println(bootListDoubleIterator);
		assertEquals("Stellt sicher, dass die Methode next() die nächste Person zurückgibt", motorFreizeitboot,
				bootListDoubleIterator.next());
		System.out.println(bootListDoubleIterator);
		assertEquals("Stellt sicher, dass die Methode next() die Person nocheinmal zurückgibt", motorFreizeitboot,
				bootListDoubleIterator.next());
		System.out.println(bootListDoubleIterator);
		assertEquals("Stellt sicher, dass die Methode next() die nächste Person zurückgibt", motorRennboot3000,
				bootListDoubleIterator.next());
		System.out.println(bootListDoubleIterator);
		assertEquals("Stellt sicher, dass die Methode next() die Person nocheinmal zurückgibt", motorRennboot3000,
				bootListDoubleIterator.next());
		System.out.println(bootListDoubleIterator);
		assertEquals("Stellt sicher, dass die Methode next() die nächste Person zurückgibt", segelboot2000,
				bootListDoubleIterator.next());
		System.out.println(bootListDoubleIterator);
		assertEquals("Stellt sicher, dass die Methode next() die Person nocheinmal zurückgibt", segelboot2000,
				bootListDoubleIterator.next());
		assertFalse("Jetzt muss der Iterator aufgebraucht sein, da beide Personen ausgegeben wurden",
				bootListDoubleIterator.hasNext());
		System.out.println(bootListDoubleIterator);
		assertFalse("Der Iterator muss jetzt aufgebraucht sein.", bootListDoubleIterator.hasNext());
	}

	public void testIteratorPattern() {
		BootList bootListe = new BootList(new Boot[] { motorFreizeitboot, motorRennboot3000 });
		Boot aktuellesBoot;

		// Iterator Aufruf Pattern
		Iterator<Boot> meinIterator;
		meinIterator = bootListe.iterator(); // frischen Iterator erzeugt

		while (meinIterator.hasNext()) { // Nur der frisch erzeugte Iterator darf verwendet werden!
			aktuellesBoot = meinIterator.next();
			// Boot bearbeiten, hier Konsolenausagbe
			System.out.println(aktuellesBoot);
		}

		// wenn man nocheinmal ueber die Bootliste iterieren moechte, muss man sich
		// einen neuen frischen Iterator holen und über diesen iterieren
		meinIterator = bootListe.iterator(); // frischen Iterator erzeugt

		while (meinIterator.hasNext()) { // Nur der frisch erzeugte Iterator darf verwendet werden!
			aktuellesBoot = meinIterator.next();
			// Person bearbeiten, hier Konsolenausagbe
			System.out.println(aktuellesBoot);
		}
	}
}
