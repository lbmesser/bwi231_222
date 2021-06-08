package de.hs_lu.o2s.o2sprobe.bestellung;

public class AppTerminBestellung {

	public static void main(String[] args) {
		TerminBestellung b = new TerminBestellung("Import-Export", 20, 5);
		b.versenden();
		b.setFertig(true);
		b.versenden();
	}

}
