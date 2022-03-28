package de.hs_lu.o2s.v8.collections;

import java.util.HashSet;
import java.util.Iterator;

public class Bucket extends HashSet {
	
	public String toString() {
		String s = new String();
		Iterator iter = this.iterator();
		while(iter.hasNext()) {
			Object o = iter.next();
			s += o.toString() + "\n";
		}
		return s;
	}
	
	/**
	public String toString() {
		String s = "";
		for(Object o : this) {
			s += o.toString() + "\n";
		}
		return s
	}
	**/

}
