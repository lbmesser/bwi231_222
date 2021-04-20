package de.hs_lu.o2s.ueb.ue5.personen.iterators;


// ACHTUNG: Nur in dieser Klasse müssen Sie etwas ändern
// Ziel: hasNext und next sollen sinnvolle Rückgabewerte haben, damit man mit der erweiterten For-Schleife über PesonLists iterieren (also über jedes Element zweimal "gehen") kann

import java.util.Iterator;

// ACHTUNG: Nur in dieser Klasse müssen Sie etwas ändern
// Ziel: hasNext und next sollen sinnvolle Rückgabewerte haben, damit man mit der erweiterten For-Schleife über PesonLists iterieren (also über jedes Element zweimal "gehen") kann

public class PersonListDoubleIterator implements Iterator {
	
	PersonList PersList;
	private int NumItemsToReturn;
	private int NumItemsReturned = 0;
	private boolean alreadyReturnedOnce = false;
			
	public PersonListDoubleIterator(PersonList persList) {
		this.PersList = persList;
		NumItemsToReturn = persList.size();
	}

	public boolean hasNext() {
		return false; // Achtung: dies ist eine Standardrückgabe und noch falsch! Hier muss die Logik implementiert werden.
	}

	public Object next() {
		if (!alreadyReturnedOnce) {
			alreadyReturnedOnce = true;
			return this.PersList.get(NumItemsReturned);
			
		} else {
			alreadyReturnedOnce = false;
			Person merker = this.PersList.get(NumItemsReturned);
			NumItemsReturned++;
			return merker;
		}
	}

	
	
	
}