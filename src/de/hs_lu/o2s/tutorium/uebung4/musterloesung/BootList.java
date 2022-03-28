package de.hs_lu.o2s.tutorium.uebung4.musterloesung;

import java.util.Iterator;

public class BootList implements Iterable<Boot> {
	
// <Boot> da waehrend der for-each Schleife ueber Objekte vom Typ Boot iteriert werden soll

	/**
	 * In dieser ArrayList werden die Boote gespeichert.
	 */
	private Boot[] boatArray;

	/**
	 * Legt eine leere Liste von Booten an
	 */
	public BootList() {
		this.boatArray = new Boot[0];
	}

	/**
	 * Legt eine Liste von Booten an und fuegt das uebergebene Boot an diese Liste
	 * an.
	 * 
	 * @param boat Boot, das an die Liste angefuegt werden soll
	 */
	public BootList(Boot boat) {
		this.boatArray = new Boot[1];
		this.boatArray[0] = boat;
	}

	/**
	 * Legt eine Liste von Booten an und fuegt die im Array uebergebenen Boote an
	 * diese Liste an.
	 * 
	 * @param boatArray Array von Booten, die in die Liste eingefuegt werden
	 */
	public BootList(Boot[] boatArray) {
		this.boatArray = boatArray;
	}

	/**
	 * Fuegt ein Boot hinten an die Liste von Booten an
	 * 
	 * @param boatToAdd Boot, das an die Liste angefuegt werden soll.
	 */
	public void add(Boot boatToAdd) {
		Boot[] newBootArray = new Boot[this.boatArray.length + 1];
		System.arraycopy(this.boatArray, 0, newBootArray, 0, this.boatArray.length);
		newBootArray[this.boatArray.length] = boatToAdd;
		this.boatArray = newBootArray;
	}

	/**
	 * Liefert das Boot in der Liste am uebergebenen Index zurueck
	 * 
	 * @param index Position (startet bei 0)
	 * @return Boot an Index index
	 */
	public Boot get(int index) {
		return this.boatArray[index];
	}

	/**
	 * Liefert die Anzahl an Booten in der Liste zurueck
	 * 
	 * @return Anzahl Booten in der Liste
	 */
	public int size() {
		return this.boatArray.length;
	}

	/**
	 * Legt einen Iterator fuer die BootenListe an Abhaengig vom Flag wird der
	 * geordnete (zuerst Segelboote, dann Motorboote) oder nicht geordnete
	 */
	@Override
	public Iterator<Boot> iterator() {
		return new BootListDoubleIterator(this);
	}

}
