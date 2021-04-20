package de.hs_lu.o2s.tut2.uebung;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(TestHandwerker.class);
		suite.addTestSuite(TestHilfskraft.class);
		suite.addTestSuite(TestManager.class);
		suite.addTestSuite(TestVorstand.class);
		//$JUnit-END$
		return suite;
	}

}
