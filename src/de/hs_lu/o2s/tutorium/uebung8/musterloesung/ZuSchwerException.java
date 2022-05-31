package de.hs_lu.o2s.tutorium.uebung8.musterloesung;

public class ZuSchwerException extends Exception {

	private static final long serialVersionUID = 1L;

	public ZuSchwerException() {
		super("Der Lastkraftwagen ist schon maximal beladen");
	}

	public ZuSchwerException(String message) {
		super(message);
	}

}
