package de.hs_lu.o2s.tut9.uebung;

import junit.framework.Test;
import junit.framework.TestSuite;

public class Logistik {

	public static Test suite() {
		TestSuite suite = new TestSuite(Logistik.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(TestLastkraftwagen.class);
		suite.addTestSuite(TestLogistikunternehmen.class);
		//$JUnit-END$
		return suite;
	}

}
