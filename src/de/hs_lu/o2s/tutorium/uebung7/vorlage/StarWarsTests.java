package de.hs_lu.o2s.tutorium.uebung7.vorlage;

import junit.framework.Test;
import junit.framework.TestSuite;

public class StarWarsTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(StarWarsTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(TestLichtschwert.class);
		suite.addTestSuite(TestLichtschwerterZuteilung.class);
		suite.addTestSuite(TestMachtnutzer.class);
		//$JUnit-END$
		return suite;
	}

}
