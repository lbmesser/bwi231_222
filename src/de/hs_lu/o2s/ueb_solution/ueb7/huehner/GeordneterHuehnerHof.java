// 60 Punkte
package de.hs_lu.o2s.ueb_solution.ueb7.huehner;

import java.util.Date;
import java.util.HashSet;

public class GeordneterHuehnerHof extends HashSet {
	
	// 2 Punkte
	private HashSet nichtZugeordneteEier = new HashSet();
	
	/**
	 * Prueft alle Hennen des Huehnerhofs darauf, ob sie schon das
	 * uebergebene Ei zugeordnet haben
	 * @param ei
	 * @return true, wenn eine Henne das Ei schon zugeordnet hat, sonst false
	 */
	// Gesamt: 8 Punkte
	// Code: 4 Punkte, Kommentar: 4 Punkte
	private boolean eiSchonZugeordnet(Ei ei) {
		
		for (Object h : this) {
			if (((Henne)h).getEi() == ei) return true;
			
		}
		return false;
	}
	
	/**
	 * Versucht einer "freien" Henne das uebergebene Ei zuzuordnen
	 * @param ei
	 * @return true, wenn eine Zuordnung geklappt hat, sonst false
	 */
	// Gesamt: 10 Punkte
	// Code: 5 Punkte, Kommentar: 5 Punkte
	private boolean ordneNaechsterHenneZu(Ei ei) {		
		for (Object h : this) {
			if (!((Henne)h).checkEi()) {
				((Henne)h).setEi(ei);
				return true;
			}			
		}
		return false;
	}
	
	
	/**
	 * Vorgegebener Konstruktor
	 * Bekommt einen HuehnerHof uebergeben und ordnet diesen. Teil 2b)
	 * @param hof
	 */
	// Gesamt: 15 Punkte
	// Code: 10 Punkte, Kommentar: 5 Punkte
	public GeordneterHuehnerHof(HuehnerHof hof) {
		
		// zuerst die Henne-Objekte in die Collection aufnehmen (nur Henne Objekte - Pr�fung wird durch add() abgebildet)
		for (Object o: hof) {
			this.add(o);  // Aufgabenteil 2 a)
		}
		
		
		// danach versuchen, die Eier den Hennen zuzuordnen, die kein Ei haben
		// Achtung: wenn Aufgabe 1 d) korrekt gel�st wurde, dann ist ja auf jeden
		// Fall das Ei der Henne in der HuehnerHof Collection
		for (Object o: hof) {
			if (o instanceof Ei) {
				Ei ei = (Ei) o;

				// nur, wenn es noch nicht zugeordnet war, dann versuchen zuzuordnen
				if (!this.eiSchonZugeordnet(ei)) {
					if(! this.ordneNaechsterHenneZu(ei)) {
						// fuer 2 c)!
						nichtZugeordneteEier.add(ei);
					}
				}
			}
		}		
		
	}
	
	/**
	 * Aufgabenteil 2 a)
	 */
	// Gesamt: 5 Punkte
	// Code: 3 Punkte, Kommentar: 2 Punkte
	public boolean add(Object o) {
		if (o instanceof Henne) return super.add(o);
		else return false;
	}
	
	/**
	 * Aufgabenteil 2 c)
	 * 
	 * @return
	 */
	// Gesamt: 10 Punkte
	// Code: 8 Punkte, Kommentar: 2 Punkte
	private Henne aeltesteHenne() {
		Henne oldest = null;
		for (Object h : this) {
			Henne henne = (Henne) h;
			if (oldest == null) oldest = henne;
			else {
				if (henne.getGeburtsdatum().before(oldest.getGeburtsdatum())) {
					oldest = henne;
				}
			}
			
		}
		return oldest;
	}
	
	/**
	 * Aufgabenteil 2 c)
	 */
	// Gesamt: 10 Punkte
	// Code: 5 Punkte, Kommentar: 5 Punkte
	public String toString() {
		String str = "";
				
		str += "Aelteste Henne: " + aeltesteHenne().toString() + "\n";
		
		for (Object h : this) str += h.toString() + "\n";
		if (this.nichtZugeordneteEier.size()>0) str += "Nicht zugeordnete Eier:\n";
		for (Object ei : this.nichtZugeordneteEier) str += ei.toString() + "\n";
		return str;
	}
	
	
}
