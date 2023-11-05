// 45 Punkte
package de.hs_lu.o2s.ueb_solution.ue5.iterators;

import java.util.Iterator;

//ACHTUNG: Nur in dieser Klasse m�ssen Sie etwas �ndern
public class PersonListDoubleIterator implements Iterator {

	// 3x 5 = 15 Punkte
	private int cursor;
	private boolean firstOutput; // dieses Flag wird genutzt, um die Ausgaben zu verdoppeln
	private PersonList persList;
		
	// 5 Punkte
	public PersonListDoubleIterator(PersonList persList) {
		this.persList = persList;
		this.cursor = 0;
		this.firstOutput = true;
	}

	/**
	 * Pr�ft, ob noch ein weiteres Element in der Liste ausgegeben werden soll
	 * Dies h�ngt davon ab, wie viele Elemente (Personen) schon ausgegeben wurden
	 */
	// 5 Punkte
	@Override
	public boolean hasNext() {
		return cursor < persList.size();
	}

	/** 
	 * Liefert das n�chste Element aus der Liste der Personen
	 */
	// 20 Punkte
	@Override
	public Person next() {
		if (this.firstOutput) {  // erster Durchlauf
			this.firstOutput = false;
			return persList.get(cursor);  // den Z�hler nicht erh�hen
		}
		else {  // zweiter Durchlauf
			this.firstOutput = true;  // wieder f�r die n�chste Ausgabe setzen
			return persList.get(cursor++); // n�chste Person zur�ckgeben und den Z�hler erh�hen
		}
	}

	
	
}

