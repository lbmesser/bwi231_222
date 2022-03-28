package de.hs_lu.o2s.v8.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import de.hs_lu.o2s.v2.cardgames.Spielkarte;
import de.hs_lu.o2s.v5.personen.Student;
import de.hs_lu.o2s.v6.unterhaltung.Disco;

public class AppCollAL {

	public static void main(String[] args) {
	
		System.out.println("VL8 - Uebung 1: ArrayList anlegen");
		ArrayList coll = new ArrayList();
		Spielkarte card1 = new Spielkarte("kreuz", "as");
		Student stud1 = new Student("Guenter", "654321");
		Disco disco1 = new Disco("Dancing Palace", 1981, 500);
		System.out.println("\n");
		coll.add(card1);
		coll.add(stud1);
		coll.add(disco1);
		System.out.println(coll);
		System.out.println("\n");
		
		System.out.println("VL8 - Uebung 2.1: dasselbe Objekt in die ArrayList einfügen");
		coll.add(card1);
		System.out.println(coll);
		System.out.println("\n");
		
		System.out.println("VL8 - Uebung 2.2: eine weitere Karte in die ArrayList einfügen, mit selben Farbe und selbem Wert");
		Spielkarte card2 = new Spielkarte("kreuz", "as");
		coll.add(card2);
		System.out.println(coll);
		System.out.println("\n");

		System.out.println("VL8 - Uebung 3: Ein Objekt aus der ArrayList entfernen");
		coll.remove(card1);	
		System.out.println(coll);
		System.out.println("\n");
		
		/**
		// Leert die Collection komplett
		coll.clear();
		System.out.println(coll);
		System.out.println("\n");
		 */
		
		System.out.println("VL8 - Uebung 5: Iterator verwenden");
		Iterator iter = coll.iterator();
		while(iter.hasNext()) {
			Object o = iter.next();
			System.out.println(o);
		}
		System.out.println("\n");
		
		System.out.println("VL8 - Uebung 6: Iterator und erweiterte for-Schleife verwenden");
		
		for(Object o : coll) {
			System.out.println(o);			
		}
		
		System.out.println("\n");
		
			

	}

}
