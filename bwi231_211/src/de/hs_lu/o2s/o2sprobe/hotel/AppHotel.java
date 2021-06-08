package de.hs_lu.o2s.o2sprobe.hotel;

public class AppHotel {

	public static void main(String[] args) {
		Hotel h  = new Hotel();
		h.addZimmer(new Zimmer(1,1));
		h.addZimmer(new Zimmer(2,2));
		h.addZimmer(new Zimmer(3,3));
	}

}
