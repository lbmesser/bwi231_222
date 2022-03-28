package de.hs_lu.o2s.o2sprobe.exceptions;

public class NichtReifException extends Exception {
	
	public NichtReifException() {
		super("Noch nicht fertig");
	}
	
	public NichtReifException(String msg) {
		super(msg);
	}

}
