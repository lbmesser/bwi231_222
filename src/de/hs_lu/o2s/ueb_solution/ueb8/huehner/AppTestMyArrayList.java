// 15 Punkte
package de.hs_lu.o2s.ueb_solution.ueb8.huehner;

//Aufgabe 1b und 1c und 1d
public class AppTestMyArrayList {

	public static void main(String[] args) {
		
		// 2 Punkte
		MyArrayList<Henne> myAL = new MyArrayList<Henne>();
		
		// 5 Punkte
		myAL.add(new Henne("Anna"));
		myAL.add(new Henne("Emma"));
		myAL.add(new Henne("Irma"));
		Henne erna = new Henne("Erna");
		myAL.add(2, erna);
		
		// Liste ausgeben
		System.out.println(myAL);
		
		// 2 Punkte
		myAL.remove(1);
		myAL.remove(erna);
		
		// 5 Punkte
		// Aufgabe 1c
		try {
			myAL.remove(5);
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Kann an Stelle 5 nichts entfernen.");
		}
		
		// 1 Punkt
		// Aufgabe 1d
		myAL.clear();

	}

}
