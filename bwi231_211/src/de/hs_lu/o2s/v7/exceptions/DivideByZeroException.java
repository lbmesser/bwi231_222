package de.hs_lu.o2s.v7.exceptions;

public class DivideByZeroException extends ArithmeticException {

	public DivideByZeroException() {
		super("Hier wurde versucht durch Null zu teilen.");
	}
	
	public DivideByZeroException(String msg) {
		super(msg);
	}
}