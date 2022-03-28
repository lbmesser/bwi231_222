package de.hs_lu.o2s.tutorium.uebung7.musterloesung;

import junit.framework.TestCase;

public class TestLichtschwerterZuteilung extends TestCase {

	private LichtschwerterZuteilung lichtschwerterZuteilung;
	private Machtnutzer countDooku, kyloRen, maul, lukeSkywalker, yoda;
	private Lichtschwert countDookusSchwert, kyloRensSchwert, maulsSchwert, lukeSkywalkersSchwert, yodasSchwert;

	protected void setUp() throws Exception {
		this.lichtschwerterZuteilung = new LichtschwerterZuteilung();

		this.countDooku = new Machtnutzer("Count Dooku", "Seperatisten", "Sith Lord");
		this.kyloRen = new Machtnutzer("Kylo Ren", "Erste Ordnung", "Sith-Schueler");
		this.maul = new Machtnutzer("Darth Maul", "Seperatisten", "Sith-Schueler");
		this.lukeSkywalker = new Machtnutzer("Luke Skywalker", "Republik", "Jedi-Meister");
		this.yoda = new Machtnutzer("Yoda", "Republik", "Jedi Meister");

		this.countDookusSchwert = new Lichtschwert("rot", "gebogen", "einfache Klinge");
		this.kyloRensSchwert = new Lichtschwert("rot", "gerade", "Cross-Klinge");
		this.maulsSchwert = new Lichtschwert("rot", "gerade", "Doppelklinge");
		this.lukeSkywalkersSchwert = new Lichtschwert("blau", "gerade", "einfache Klinge");
		this.yodasSchwert = new Lichtschwert("gruen", "gerade", "einfache Klinge");

		this.lichtschwerterZuteilung.put(countDooku, countDookusSchwert);
		this.lichtschwerterZuteilung.put(kyloRen, kyloRensSchwert);
		this.lichtschwerterZuteilung.put(maul, maulsSchwert);
		this.lichtschwerterZuteilung.put(lukeSkywalker, lukeSkywalkersSchwert);
		this.lichtschwerterZuteilung.put(yoda, yodasSchwert);
	}

	protected void tearDown() throws Exception {
		this.lichtschwerterZuteilung = null;

		this.countDooku = null;
		this.kyloRen = null;
		this.maul = null;
		this.lukeSkywalker = null;
		this.yoda = null;

		this.countDookusSchwert = null;
		this.kyloRensSchwert = null;
		this.maulsSchwert = null;
		this.lukeSkywalkersSchwert = null;
		this.yodasSchwert = null;
	}

	public void testToString() {
		String expectedString = "Sith Lord Count Dooku hat ein rotes Lichtschwert\n"
				+ "Sith-Schueler Kylo Ren hat ein rotes Lichtschwert\n"
				+ "Jedi-Meister Luke Skywalker hat ein blaues Lichtschwert\n"
				+ "Jedi Meister Yoda hat ein gruenes Lichtschwert\n"
				+ "Sith-Schueler Darth Maul hat ein rotes Lichtschwert\n";
		assertEquals(expectedString, this.lichtschwerterZuteilung.toString());
	}

	public void testShallowCopy() {
		LichtschwerterZuteilung newLichtschwerterZuteilung = this.lichtschwerterZuteilung.shallowCopy();
		String newKiberkristallFarbe = "gruen";
		newLichtschwerterZuteilung.get(this.lukeSkywalker).setKiberkristallFarbe(newKiberkristallFarbe);

		System.out.println("Shallow Copy:");
		System.out.println("Original:\n" + this.lichtschwerterZuteilung);
		System.out.println("Shallow Copy:\n" + newLichtschwerterZuteilung);

		assertEquals(newKiberkristallFarbe, newLichtschwerterZuteilung.get(this.lukeSkywalker).getKiberkristallFarbe());
		assertEquals("Kiberkristallfarbe wurde faelschlicherweise nicht in originaler HashMap geaendert",
				newKiberkristallFarbe, this.lichtschwerterZuteilung.get(this.lukeSkywalker).getKiberkristallFarbe());
	}

	public void testDeepCopy() {
		LichtschwerterZuteilung newLichtschwerterZuteilung = this.lichtschwerterZuteilung.deepCopy();
		String newKiberkristallFarbe = "gruen";
		Machtnutzer newLukeSkywalker = null;

		for (Machtnutzer currentMachtnutzer : newLichtschwerterZuteilung.keySet())
			if (currentMachtnutzer.getName().equals(this.lukeSkywalker.getName()))
				newLukeSkywalker = currentMachtnutzer;

		newLichtschwerterZuteilung.get(newLukeSkywalker).setKiberkristallFarbe(newKiberkristallFarbe);

		System.out.println("Deep Copy:");
		System.out.println("Original:\n" + this.lichtschwerterZuteilung);
		System.out.println("Deep Copy:\n" + newLichtschwerterZuteilung);

		assertEquals(newKiberkristallFarbe, newLichtschwerterZuteilung.get(newLukeSkywalker).getKiberkristallFarbe());
		assertEquals("Kiberkristallfarbe wurde faelschlicherweise auch in originaler HashMap geaendert", "blau",
				this.lichtschwerterZuteilung.get(this.lukeSkywalker).getKiberkristallFarbe());
	}

}
