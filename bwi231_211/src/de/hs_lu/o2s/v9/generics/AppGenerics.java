package de.hs_lu.o2s.v9.generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import de.hs_lu.o2s.ueb.ue4.personen.Person;
import de.hs_lu.o2s.v2.cardgames.Spielkarte;
import de.hs_lu.o2s.v5.personen.Student;

public class AppGenerics {

	public static void main(String[] args) {
		// VL 9 - UE 5
		HashSet<Spielkarte> cardSet = new HashSet<Spielkarte>();
		cardSet.add(new Spielkarte("karo", "koenig"));
		cardSet.add(new Spielkarte("herz", "dame"));
		cardSet.add(new Spielkarte("pik", "sieben"));
		
		// cardSet.add(new Student("Gerd Müller", "654321"));
		
		// VL 9 - UE 6
		ArrayList<Spielkarte> cardList = new ArrayList<Spielkarte>();
		for(Spielkarte myCard : cardSet) {
			cardList.add(myCard);
		}
		
		// VL 9 - UE 7 mit Iterator
		Iterator<Spielkarte> iter = cardSet.iterator();
		while(iter.hasNext()) {
			cardList.add(iter.next());
		}
		
		// VL 9 - UE 8
		Bucket<Spielkarte> cardBucket = new Bucket<Spielkarte>();
		for(Spielkarte myCard : cardSet) {
			cardBucket.add(myCard);
		}
		
		
		
	}

}
