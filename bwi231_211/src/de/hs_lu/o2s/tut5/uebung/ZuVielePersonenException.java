package de.hs_lu.o2s.tut5.uebung;

public class ZuVielePersonenException extends Exception {

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
