package de.hs_lu.o2s.v9.generics;

import java.util.HashSet;

public class Bucket<T> extends HashSet<T> {
	
	public String toString() { // alle Objekte als einen langen String zurückgeben
		String s = new String();
		for(T obj : this) {
			s += "Objekt: " + obj.toString() + "\n";
		}
		return s;
	}
}