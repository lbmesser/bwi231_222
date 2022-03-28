package de.hs_lu.o2s.ueb.ue8.huehner;

// in dieser Klasse muessen Sie nichts aendern
public class AppTestDeepCopyHuehner {

	public static void main(String[] args) {
		
		ArrayListHuehnerDeepCopy myAL = new ArrayListHuehnerDeepCopy();
		
		Ei ei1 = new Ei("braun", 54.0);
		Ei ei2 = new Ei("weiss", 52.0);
		Ei ei3 = new Ei("weiss", 53.0);
		
		Henne h1 = new Henne("Anna", ei1); 
		Henne h2 = new Henne("Emma", ei2);
		Henne h3 = new Henne("Irma", ei3);
		
		myAL.add(h1);
		myAL.add(h2);
		myAL.add(h3);
		
		System.out.println("myAL:");
		System.out.println(myAL);

		ArrayListHuehnerDeepCopy myALCopy = (ArrayListHuehnerDeepCopy) myAL.clone();
		
		
		System.out.println("\nmyALCopy:");
		System.out.println(myALCopy);
		
		System.out.println("Aenderung von Ei1... neue Groesse 20.0");
		ei1.setGroesse(20.0);
		
		System.out.println("myAL:");
		System.out.println(myAL);
		
		System.out.println("\nmyALCopy:");
		System.out.println(myALCopy);
		
		
	}

}
