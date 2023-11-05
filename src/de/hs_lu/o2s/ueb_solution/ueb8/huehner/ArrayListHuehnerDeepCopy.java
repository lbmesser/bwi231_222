// 10 Punkte
package de.hs_lu.o2s.ueb_solution.ueb8.huehner;

import java.util.ArrayList;

//Aufgabe 3
public class ArrayListHuehnerDeepCopy extends ArrayList<Henne> {

	// Dieser Teil war bereits gegeben.
	public String toString() {
		String str = "";
		
		for(Henne h: this) {
			str += h.toString() + "\n";
		}
		
		return str;
	}

	// 10 Punkte
	@Override
	public Object clone() {
		ArrayListHuehnerDeepCopy newAL = new ArrayListHuehnerDeepCopy();
		
		for (Henne h : this) {
			
			Ei oldEi = h.getEi();
			Ei newEi = new Ei(oldEi.getFarbe(), oldEi.getGroesse());
			Henne newHenne = new Henne(h.getName(), newEi);
			newAL.add(newHenne);
		}
		
		return newAL;
	}
	
	
}
