package de.hs_lu.o2s.v9.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import de.hs_lu.o2s.v2.cardgames.Spielkarte;

public class AppHashMap {

	public static void main(String[] args) {
		// VL 9 - UE 3
		HashMap hm = new HashMap();
		hm.put("Deutschland", "Berlin");
		hm.put("Karte1", new Spielkarte("kreuz", "as"));
		hm.put("Karte2", new Spielkarte("karo", "10"));
		
		
		String value = (String) hm.get("Deutschland");
		System.out.println("Hauptstadt von Deutschland: " + value);
		
		// VL 9 - UE 4
		System.out.println();
		for(Object key : hm.keySet()) {
			System.out.println(key + "-->" + hm.get(key))	;	
		}
		
		// Alternativ
		System.out.println();
		Set keySet = hm.keySet();
		Iterator iter = keySet.iterator();
		while(iter.hasNext()) {
			Object key = iter.next();
			Object valueForKey = hm.get(key);
			System.out.println(key + "-->" + valueForKey)	;
		}
		
		// Generische HashMap
		HashMap<Spielkarte, String> hm2 = new HashMap<Spielkarte, String>();
		hm2.put(new Spielkarte("kreuz", "as"), "Karte1");
		// hm2.put("Deutschland", "Berlin"); // nicht erlaubt
		
	}

}
