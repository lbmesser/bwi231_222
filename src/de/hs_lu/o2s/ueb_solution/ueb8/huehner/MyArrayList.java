// 38 Punkte
package de.hs_lu.o2s.ueb_solution.ueb8.huehner;

import java.util.ArrayList;

// Aufgabe 1a
public class MyArrayList<T> extends ArrayList<T> { // 2 Punkte

	/**
	 * private Hilfsmethode zur Konsolausgabe der Einfuegeoperation
	 * @param index
	 * @param o
	 */
	// 10 Punkte
	private void outputAdd(int index, T o) {
		System.out.println("Fuege " + o.toString() +
				" in die Liste an Position " + index + " ein.");
		
		System.out.println("Neue Listenlaenge: " + (this.size()));
		System.out.println("Elemente der Liste:");
		for (T element : this) System.out.println("- " + element.toString());
		System.out.println();
	}
	
	// 4 Punkte
	public boolean add(T o) {
		// fuege am Ende der Liste ein
		boolean retVal = super.add(o);
		this.outputAdd(this.size(), o);
		return retVal;
	}
	
	// 3 Punkte
	public void add(int index, T o) {
		super.add(index, o);
		this.outputAdd(index, o);
	}
	
	// 3 Punkte
	private void outputRemove(T o, int index) {
		System.out.println("Entferne " + o.toString() + 
				" aus Liste an bisheriger Position " + index + ".\n");		
	}
	
	// 7 Punkte
	@Override
	public boolean remove(Object o) {
		int currentIndex = this.indexOf(o);  // merken, wo bisher das Objekt in der Liste war
		boolean removeReturnVal = super.remove(o);
		
		// nur wenn das Entfernen geklappt hat, dann die Konsolausgabe veranlassen
		if (removeReturnVal) {
			this.outputRemove((T) o, currentIndex);
		}
		
		return removeReturnVal;
	}
	
	// 6 Punkte
	@Override
	public T remove(int index) {
		T retVal;
		
		retVal = super.remove(index);
		this.outputRemove(retVal, index);
		return retVal;
		
	}
	
	// 3 Punkte
	public void clear() {
		System.out.println("Leere Liste mit Laenge " + this.size());
		super.clear();
	}
	
	
}
