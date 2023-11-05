// 40 Punkte
package de.hs_lu.o2s.ueb_solution.ueb7.huehner;

import java.util.ArrayList;

public class HuehnerHof extends ArrayList { // 5 Punkte (Aufgabe 1a)
	
	// Aufgabe 1b
	// Gesamt: 20 Punkte
	// Code: 15 Punkte, Kommentar: 5 Punkte
	public String toString() { // 1 Punkt
		String str = "";
		
		// 2x 1 Punkt = 2 Punkte
		int henneCount = 1;
		int eiCount = 1;
		
		for (Object o: this) { // 2 Punkte
			String prefix = o.getClass().getSimpleName(); // 1 Punkt
			if (o instanceof Henne) prefix += " " + henneCount++ + ": "; // 3 Punkte
			if (o instanceof Ei) prefix += " " + eiCount++ + ": "; // 3 Punkte
			str += prefix + o.toString() + "\n"; // 3 Punkte
		}
		
		return str;
	}
	
	// Gesamt: 15 Punkte
	// Code: 10 Punkte, Kommentar: 5 Punkte
	public boolean add(Object o) {
		
		// Aufgabe 1c
		if (o instanceof Henne) {
			Henne h = (Henne) o;
			
			// pruefen, ob die Henne mit dem Namen/Geburtsdatum schon drin ist!
			for (Object henne: this) {
				// das instanceof ist fuer d) notwendig
				if (henne instanceof Henne && ((Henne)henne).compareTo(h) == 0) {
					return false;
				}
			}
		
			// Aufgabe 1d)
			if (h.checkEi()) {
				// pruefe, ob das Ei schon vorhanden ist
				if (!this.contains(h.getEi())) this.add(h.getEi());
			}
		}
				
		return super.add(o);
	}
}
