// 20 Punkte
package de.hs_lu.o2s.ueb_solution.ueb8.huehner;

import java.util.HashMap;

//Aufgabe 2
public class AppTestHashMap {

	public static void main(String[] args) {
		
		// 1 Punkt
		HashMap myHM = new HashMap();
		
		// 3 Punkte, je 1 Punkt
		myHM.put("Anna", new Henne("Anna"));
		myHM.put("Emma", new Henne("Emma"));
		myHM.put("Irma", new Henne("Irma"));
		
		// 2 Punkte
		Henne erna = new Henne("Erna");
		myHM.put("Erna", erna);
		
		// 1 Punkt
		System.out.println(myHM);
		
		// 4 Punkte
		if(((Henne)myHM.get("Irma")).checkEi()) System.out.println("Irma hat ein Ei");
		else System.out.println("Irma hat kein Ei");
		
		// 2 Punkte
		HashMap<String, Henne> myHMGen = new HashMap<String, Henne>();
		
		//myHMGen.put("Anna", new Ei());  // Fehler - Value falscher Typ
		//myHMGen.put(1, new Henne("Anna"));  // Fehler - Value falscher Typ
		
		// 4 Punkte
		myHMGen.put("Anna", new Henne("Anna"));
		myHMGen.put("Emma", new Henne("Emma"));
		myHMGen.put("Irma", new Henne("Irma"));
		myHMGen.put("Erna", erna);
		
		// 3 Punkte
		for (String key : myHMGen.keySet()) {
			System.out.println("Schluessel: " + key + " - zugeordneter Wert: " + myHMGen.get(key));
		}
	}

}
