package de.hs_lu.o2s.v8.collections;

import java.util.HashSet;
import java.util.Iterator;

import de.hs_lu.o2s.v2.cardgames.Spielkarte;
import de.hs_lu.o2s.v5.personen.Student;
import de.hs_lu.o2s.v6.unterhaltung.Disco;

public class AppCollBucket {
	
	public static void main(String[] args) {
		System.out.println("VL8 - Uebung 1: HashSet anlegen");
		Bucket bucket = new Bucket();
		Spielkarte card1 = new Spielkarte("kreuz", "as");
		Student stud1 = new Student("Guenter", "654321");
		Disco disco1 = new Disco("Dancing Palace", 1981, 500);
		System.out.println("\n");
		bucket.add(card1);
		bucket.add(stud1);
		bucket.add(disco1);
		System.out.println(bucket);
		System.out.println("\n");
		
		System.out.println("VL8 - Uebung 2.1: dasselbe Objekt in das Hashset einfügen");
		bucket.add(card1);
		System.out.println(bucket);
		System.out.println("\n");
		
		System.out.println("VL8 - Uebung 2.2: eine weitere Karte in das Hashset einfügen, mit selben Farbe und selbem Wert");
		Spielkarte card2 = new Spielkarte("kreuz", "as");
		bucket.add(card2);
		System.out.println(bucket);
		System.out.println("\n");

		System.out.println("VL8 - Uebung 3: Ein Objekt aus dem Hashset entfernen");
		bucket.remove(card1);	
		System.out.println(bucket);
		System.out.println("\n");
		
		/**
		// Leert die Collection komplett
		coll.clear();
		System.out.println(coll);
		System.out.println("\n");
		 */
		
		System.out.println("VL8 - Uebung 5: Iterator verwenden");
		Iterator iter = bucket.iterator();
		while(iter.hasNext()) {
			Object o = iter.next();
			System.out.println(o);
		}
		System.out.println("\n");
		
		System.out.println("VL8 - Uebung 6: Iterator und erweiterte for-Schleife verwenden");
		
		for(Object o : bucket) {
			System.out.println(o);			
		}
		
		System.out.println("\n");
		
		
	}


}
