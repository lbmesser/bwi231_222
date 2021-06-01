package de.hs_lu.o2s.tutorium.uebung9.musterloesung;

import java.util.ArrayList;

import junit.framework.TestCase;

public class TestLogistikunternehmen extends TestCase {

	Logistikunternehmen logistikunternehmen;
	Lastkraftwagenfahrer fahrerKlasseC, fahrerKlasseC1, fahrerKlasseC1E;
	Lastkraftwagen lkwKlasseC, lkwKlasseC1, lkwKlasseC1E;
	Anhaenger aufliegerAnhaenger, sattelAnhaenger;

	protected void setUp() throws Exception {
		this.logistikunternehmen = new Logistikunternehmen();

		this.fahrerKlasseC = new Lastkraftwagenfahrer("123", "Thorsten Mayer", "C");
		this.fahrerKlasseC1 = new Lastkraftwagenfahrer("124", "Guenther Braun", "C1");
		this.fahrerKlasseC1E = new Lastkraftwagenfahrer("125", "Peter Dietrich", "C1E");

		this.lkwKlasseC = new Lastkraftwagen(new Motor(17, 500, "Diesel"), 100, 7.4, 3);
		this.lkwKlasseC1 = new Lastkraftwagen(new Motor(18, 540, "Diesel"), 100, 7.5, 3);
		this.lkwKlasseC1E = new Lastkraftwagen(new Motor(20, 560, "Diesel"), 100, 8, 3);

		this.aufliegerAnhaenger = new Anhaenger("Mehrachsiger-Haenger", "Aufliegeranhaenger");
		this.sattelAnhaenger = new Anhaenger("Einachsiger-Haenger", "Sattelanhaenger");

		this.lkwKlasseC1E.setAnhaenger(aufliegerAnhaenger);
	}

	protected void tearDown() throws Exception {
		this.logistikunternehmen = null;

		this.fahrerKlasseC = null;
		this.fahrerKlasseC1 = null;
		this.fahrerKlasseC1E = null;

		this.lkwKlasseC = null;
		this.lkwKlasseC1 = null;
		this.lkwKlasseC1E = null;

		this.aufliegerAnhaenger = null;
		this.sattelAnhaenger = null;
	}

	public void testAdd() {
		this.logistikunternehmen.add(this.fahrerKlasseC);
		assertTrue(this.logistikunternehmen.getFahrer().contains(this.fahrerKlasseC));
		this.logistikunternehmen.add(this.fahrerKlasseC1);
		assertTrue(this.logistikunternehmen.getFahrer().contains(this.fahrerKlasseC1));
		this.logistikunternehmen.add(this.fahrerKlasseC1E);
		assertTrue(this.logistikunternehmen.getFahrer().contains(this.fahrerKlasseC1E));

		this.logistikunternehmen.add(this.lkwKlasseC);
		assertTrue(this.logistikunternehmen.getLastkraftwagen().contains(this.lkwKlasseC));
		this.logistikunternehmen.add(this.lkwKlasseC1);
		assertTrue(this.logistikunternehmen.getLastkraftwagen().contains(this.lkwKlasseC1));
		this.logistikunternehmen.add(this.lkwKlasseC1E);
		assertTrue(this.logistikunternehmen.getLastkraftwagen().contains(this.lkwKlasseC1E));

		this.logistikunternehmen.add(this.aufliegerAnhaenger);
		assertTrue(this.logistikunternehmen.getAnhaenger().contains(this.aufliegerAnhaenger));
		this.logistikunternehmen.add(this.sattelAnhaenger);
		assertTrue(this.logistikunternehmen.getAnhaenger().contains(this.sattelAnhaenger));
	}

	public void testSafeData() {
		this.logistikunternehmen.add(this.fahrerKlasseC);
		this.logistikunternehmen.add(this.aufliegerAnhaenger);
		this.logistikunternehmen.add(this.lkwKlasseC);

		ArrayList<Object> deepCopyLogistikunternehmen = this.logistikunternehmen.safeData();

		this.fahrerKlasseC.setFuehrerscheinKlasse("C1");
		this.aufliegerAnhaenger.setAnzahlAchsen("Einachsiger-Haenger");
		this.lkwKlasseC.setMotor(new Motor(16, 490, "Diesel"));

		for (Object currentObject : deepCopyLogistikunternehmen) {
			if (currentObject instanceof Lastkraftwagenfahrer) {
				Lastkraftwagenfahrer currentFahrer = (Lastkraftwagenfahrer) currentObject;
				assertEquals("C", currentFahrer.getFuehrerscheinKlasse());
			}
			if (currentObject instanceof Anhaenger) {
				Anhaenger currentAnhaenger = (Anhaenger) currentObject;
				assertEquals("Mehrachsiger-Haenger", currentAnhaenger.getAnzahlAchsen());
			}
			if (currentObject instanceof Lastkraftwagen) {
				Lastkraftwagen currentLastkraftwagen = (Lastkraftwagen) currentObject;
				assertEquals(17, currentLastkraftwagen.getMotor().getHubraum());
			}
		}

	}

}
