// 5 Punkte 
package de.hs_lu.o2s.ueb_solution.ue6.unterhaltung;

public class ZuJungException extends Exception { // 1 Punkt

	// 2 Punkte
	public ZuJungException() {
		super("Diese Person ist zu jung.");
	}

	// c
	// 2 Punkte
	public ZuJungException(String message) {
		super(message);
	}
}
