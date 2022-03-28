package de.hs_lu.o2s.o2sprobe.exceptions;

public class AppEssen {

	public static void main(String[] args) {
		Obst o = new Obst();
		
		try {
			o.essen();
		} catch (NichtReifException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		o.setReif(true);
	
		try {
			o.essen();
		} catch (NichtReifException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
