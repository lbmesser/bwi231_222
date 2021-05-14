package de.hs_lu.o2s.v9.collections;

import java.util.Iterator;
import java.util.Vector;

import de.hs_lu.o2s.v2.cardgames.Spielkarte;
import de.hs_lu.o2s.v5.personen.Student;
import de.hs_lu.o2s.v6.unterhaltung.Disco;

public class AppCollVector {
	
	public static void main(String[] args) {
		Vector coll = new Vector();
		Spielkarte card1 = new Spielkarte("kreuz", "as");
		coll.add(card1);
		
		Vector newColl = (Vector) coll.clone();
		
		System.out.println("Original-Collection: " + coll);
		System.out.println("Collection vor Änderung: " + newColl);
		((Spielkarte) coll.get(0)).setFarbe("karo");
		System.out.println("Collection nach Änderung: " + newColl);
		System.out.println("Original-Collection: " + coll);
		
	}

}
