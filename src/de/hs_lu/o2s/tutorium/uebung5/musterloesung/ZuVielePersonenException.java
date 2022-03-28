package de.hs_lu.o2s.tutorium.uebung5.musterloesung;

public class ZuVielePersonenException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Konstruktor mit Standardfehlermeldung
	 */
	public ZuVielePersonenException() {
		super("Es ist nicht genuegend Platz auf dem Boot");
	}

	/**
	 * Konstruktor, dessen Fehlermeldung man bei der Erzeugung festlegen kann
	 * 
	 * @param message
	 */
	public ZuVielePersonenException(String message) {
		super(message);
	}

}
