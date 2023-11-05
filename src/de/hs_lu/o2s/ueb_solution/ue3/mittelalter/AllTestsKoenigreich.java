package de.hs_lu.o2s.ueb_solution.ue3.mittelalter;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTestsKoenigreich {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTestsKoenigreich.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(TestKoenigreich1.class);
		suite.addTestSuite(TestKoenigreich2.class);
		suite.addTestSuite(TestKoenigreich3.class);
		//$JUnit-END$
		return suite;
	}

}
