package de.hs_lu.o2s.tutorium.uebung4.musterloesung;

import java.util.Iterator;

public class BootListDoubleIterator implements Iterator<Boot> {

	private BootList bootListe; // Das Objekt, über das iteriert werden soll
	private int numberOfItemsToReturn, numberOfItemsReturned; // Maximale Position, Aktuelle Position
	private boolean alreadyReturnedOnce; // Wegen doppelter Ausgabe

	public BootListDoubleIterator(BootList bootList) {
		this.bootListe = bootList;
		this.numberOfItemsToReturn = this.bootListe.size();
		this.numberOfItemsReturned = 0; // Initialisierung
		this.alreadyReturnedOnce = false;
	}

	/**
	 * hasNext() ueberprueft, ob noch weitere Elemente zurueckgegeben werden koennen
	 */
	@Override
	public boolean hasNext() {
		if (this.bootListe.size() == 0)
			return false;
		if (this.numberOfItemsReturned < this.numberOfItemsToReturn)
			return true;
		return false;
	}

	/**
	 * next() liefert das naechste Element
	 */
	@Override
	public Boot next() {
		if (this.hasNext()) {
			if (this.alreadyReturnedOnce == false) {
				this.alreadyReturnedOnce = true;
				return this.bootListe.get(this.numberOfItemsReturned);
			} else { // alreadyReturnedOnce ist true
				this.alreadyReturnedOnce = false;
				return this.bootListe.get(this.numberOfItemsReturned++);
				// da das Array bei 0 beginnt
				// this.numberOfItemsReturned++, da erst der alte Index aufgerufen wird und erst
				// im Anschluss eins hochgesetzt wird
			}
		}
		return null;
	}

}
