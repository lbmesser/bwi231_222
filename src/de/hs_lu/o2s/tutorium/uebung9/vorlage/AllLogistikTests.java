package de.hs_lu.o2s.tutorium.uebung9.vorlage;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllLogistikTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllLogistikTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(TestLastkraftwagen.class);
		suite.addTestSuite(TestLogistikunternehmen.class);
		//$JUnit-END$
		return suite;
	}

}
