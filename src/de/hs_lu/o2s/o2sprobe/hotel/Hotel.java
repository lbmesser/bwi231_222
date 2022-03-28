package de.hs_lu.o2s.o2sprobe.hotel;

import java.util.HashSet;
import java.util.Iterator;

public class Hotel {
	private HashSet<Zimmer> zimmerListe;
	
	public Hotel() {
		this.zimmerListe = new HashSet<Zimmer>(); // Initialisierung
	}
	
	public boolean addZimmer(Zimmer z) {
		return this.zimmerListe.add(z);
	}
	
	public boolean belegeZimmer(int zimmerNr, int anzahlGaeste) {
		Iterator iter = this.zimmerListe.iterator();
		boolean erfolgreichBelegt = false;
		
		while(iter.hasNext()) {
			Zimmer z = (Zimmer) iter.next();
			if(z.getZimmerNummer() == zimmerNr) {
				if(z.getBelegteBetten() == 0) {
					z.setBelegteBetten(anzahlGaeste);
					erfolgreichBelegt = true;
				}
			}
		}
		return erfolgreichBelegt;
	}
	
	public void gibZimmerFrei(int zimmerNr) {
		for(Object o : zimmerListe) {
			Zimmer z = (Zimmer) o;
			if(z.getZimmerNummer() == zimmerNr) {
				z.setBelegteBetten(0);
			}
		}
	}
	
	public void gibAlleZimmerFrei() {
		for(Object o : zimmerListe) {
			Zimmer z = (Zimmer) o;
			z.setBelegteBetten(0);
		}
	}
	
	public void druckeBelegung() {
		int belegteBetten = 0;

		for(Object o : zimmerListe) {
			Zimmer z = (Zimmer) o;
			belegteBetten += z.getBelegteBetten();
		}
		
		System.out.println("Belegung: " + belegteBetten);
	}
}
