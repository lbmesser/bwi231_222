package de.hs_lu.o2s.v7.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class AppExc {
	public static void main(String[] args) {
		AppExc ae = new AppExc();
		ae.doSomething();
	}
	
	/**
	 * Beispiel-Methode, die die Methode divideByZeroNoCatch aufruf
	 */
	public void doSomething() {
		System.out.println("doSomething() wird gestartet");
		
		//System.out.println("divideByZeroNoCatch() wird aufgerufen");
		//this.divideByZeroNoCatch();
		
		//System.out.println("divideByZeroMitVorbeugen() wird aufgerufen");
		//this.divideByZeroMitVorbeugen();
		
//		System.out.println("divideByZero() wird aufgerufen");
//		this.divideByZero();

//		System.out.println("severalExceptions() wird aufgerufen");
//		this.severalExceptions();
		
		/*
		System.out.println("severalExceptions() wird aufgerufen");
		try {
			this.readFileThrows();
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		/*
		System.out.println("createAndThrow() wird aufgerufen");
		try {
			this.createAndThrow();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("createAndThrow() beendet");
		*/
		
		System.out.println("divideByZeroThrows() beendet");
		
		try {
			this.divideByZeroThrows();
		} catch(DivideByZeroException e){
			System.out.println(e.getMessage());
		}		
		
		System.out.println("doSomething() beendet");
	}
	
	/**
	 * VL7 - Übung 1
	 * Beispiel-Methode für Excpetions.
	 * Es wird durch 0 geteilt, ohne diesen Fehler zu verhindern oder abzufangen. 	
	 */
	public void divideByZeroNoCatch() {
		System.out.println("divideByZeroNoCatch() gestartet");
		int a=1;
		int b=0;
		int c=a/b;
		System.out.println("c ist " + c);
	}
	
	/**
	 * VL7 - Übung 2
	 */
	public void divideByZeroMitVorbeugen(){
        System.out.println("divideByZeroMitVorbeugen() gestartet");
        int a=1, b=0, c;
        
        if (b != 0){
            c = a / b;
            System.out.println("c ist " + c);
        }
        else {
            System.out.println("c ist 0, die Division ist nicht moeglich."); 
        }
	}
	
	/**
	 * VL7 - Übung 3
	 */
	public void divideByZero() {
		System.out.println("divideByZero() gestartet");
		int a=10;
		int b=0;
		
		try {
			int c = a / b;// Fehler tritt auf, Exception wird geworfen 
			// und als Objekt vom Typ Exception zurückgegeben
			System.out.println("c ist " + c);
		} catch (Exception e) { // Übergabe des Fehler-Objekts an den catch-Block
			System.out.println(e.getMessage()); // Auslesen der Fehlermeldung aus dem Fehlerobjekt e
		} finally {
			// Aufräumarbeiten
			// Befehle, die auf jeden Fall ausgeführt werden müssen.
		}
		// danach geht das Programm hier ganz normal weiter
	}
	
	/**
	 * VL7 - Übung 5
	 */
	public void severalExceptions() {
		try {
			int a=1, b=1, c;
			//ArithmeticException moeglich
			c=a/b;
			System.out.println("c ist " + c);
			
			java.io.RandomAccessFile f;
			//FileNotFoundException moeglich
			f = new java.io.RandomAccessFile("c:\\windows\\desktop.ini", "r" );
			String line;
			//IOException moeglich
			while ( (line = f.readLine()) != null ){
				System.out.println( line ); // Zeile für Zeile der Datei auf der Konsole ausgeben
			}
			f.close(); // IOException möglich
		}
		//catch (Exception e) {
		catch (FileNotFoundException fnfe) {
			System.out.println("FileNotFoundException gefangen");
			fnfe.printStackTrace();
		}
		catch (IOException ioe) {
			System.out.println("IOException gefangen");
			ioe.printStackTrace();
		}
		catch (ArithmeticException ae) {
			System.out.println("ArithmeticException gefangen");
			ae.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Unerwartete Exception gefangen");
			e.printStackTrace();
		}
	}
	
	/**
	 * VL7 - Übung 7
	 * @throws FileNotFoundException 
	 * @throws Exception 
	 */
	public void readFileThrows() throws Exception  {
		java.io.RandomAccessFile f;
		//FileNotFoundException moeglich
		f = new java.io.RandomAccessFile("src/de/hs_lu/o2s/v7/exceptions/sevExcFrag.txt", "r" );
		String line;
		//IOException moeglich
		while ( (line = f.readLine()) != null ){
			System.out.println( line ); // Zeile für Zeile der Datei auf der Konsole ausgeben
		}
		f.close(); // IOException möglich
	}
	
	/**
	 * VL7 - Übung 8
	 * @throws Exception 
	 */
	public void createAndThrow() throws Exception {
		try {
			// Exception erzeugen und werfen
			Exception exc = new Exception("allgemeiner Fehler");
			ArithmeticException arExc = new ArithmeticException("falsch gerechnet");
			
			if (Math.random() < 0.5)
				throw exc;
			else
				throw arExc;
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
	}
	
	/**
	 * VL7 - Übung 10
	 */
	public void divideByZeroThrows() {
		System.out.println("divideByZero() gestartet");
		int a=10;
		int b=0;
		
		if(b != 0) {
			int c = a/b;
			System.out.println("c ist "+c);
		} else {
			throw new DivideByZeroException();
		}	
	}
}
