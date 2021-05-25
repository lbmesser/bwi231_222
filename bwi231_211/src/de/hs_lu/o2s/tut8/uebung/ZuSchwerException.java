package de.hs_lu.o2s.tut8.uebung;

public class ZuSchwerException extends Exception {

	public ZuSchwerException() {
		super("Der Lastkraftwagen ist schon maximal beladen");
	}

	public ZuSchwerException(String message) {
		super(message);
	}

}
