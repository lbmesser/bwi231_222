package de.hs_lu.o2s.o2sprobe.computer;

public class AppPCMaus {
	
	public static void erzeugeObjekte() {
		PC pc = erzeugePC();
		Maus maus = erzeugeMaus(pc);
		System.out.println(maus);
	}
	
	public static PC erzeugePC() {
		return new PC(6000);		
	}
	
	public static Maus erzeugeMaus(PC pc) {
		return new Maus(pc);
	}

	// Hier beginnt die Main
	public static void main(String[] args) {
		erzeugeObjekte();
	}

}
