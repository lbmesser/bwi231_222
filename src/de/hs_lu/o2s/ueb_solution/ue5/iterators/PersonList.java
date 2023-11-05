package de.hs_lu.o2s.ueb_solution.ue5.iterators;

import java.util.Iterator;

//ACHTUNG: in dieser Klasse m�ssen Sie nichts �ndern
public class PersonList implements Iterable {
			
	/**
	 * In dieser ArrayList werden die Personen gespeichert.
	 */
	private Person[] myPersonA;
	
	/**
	 * Legt eine leere Liste von Personen an
	 */
	public PersonList() {
		myPersonA = new Person[0];
	}
	
	/**
	 * Legt eine Liste von Personen an und f�gt
	 * die �bergebene Person an diese Liste an.
	 * @param pers Person, die an die Liste angef�gt werden soll
	 */
	public PersonList(Person pers) {
		myPersonA = new Person[1];
		myPersonA[0] = pers;
	}
	
	/**
	 * Legt eine Liste von Personen an und f�gt
	 * die im Array �bergebenen Person an diese Liste an.
	 * @param persA Array von Personen, die in die Liste eingef�gt werden
	 */
	public PersonList(Person[] persA) {
		myPersonA = persA;		
	}
	
	/**
	 * F�gt eine Person hinten an die Liste von Personen an
	 * @param pers Person, die an die Liste angef�gt werden soll.
	 */
	public void add(Person pers) {
		Person[] newPersonA = new Person[myPersonA.length + 1];
		System.arraycopy(myPersonA, 0, newPersonA, 0, myPersonA.length);
		newPersonA[myPersonA.length] = pers;
		myPersonA = newPersonA;
	}
	
	/**
	 * Liefert die Person in der Liste an Stelle "pos" zur�ck
	 * @param pos Position (startet bei 0)
	 * @return Person an Position pos
	 */
	public Person get(int pos) {
		return myPersonA[pos];
	}
	
	/**
	 * Liefert die Anzahl an Personen in der Liste zur�ck
	 * @return Anzahl Personen in der Liste
	 */
	public int size() {
		return myPersonA.length;
	}

	/**
	 * Legt einen Iterator f�r die Personenliste an
	 * Abh�ngig vom Flag wird der geordnete (zuerst Studenten, dann Dozenten)
	 * oder nicht geordnete
	 */
	@Override
	public Iterator iterator() {
		return new PersonListDoubleIterator(this);
	}

	

	
}

