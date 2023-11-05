// 10 Punkte

package de.hs_lu.o2s.ueb_solution.ue3.mittelalter;

public class Adel extends Einwohner { // 1 Punkt

	// 2 Punkte
	public Adel(int einkommen) {
		this.einkommen = einkommen;
	}

	// 2 Punkte
	public Adel() {
		this.einkommen = 0;
	}

	// 5 Punkte
	public int getSteuer() {
		int steuer = super.getSteuer();
		if (steuer < 20)
			steuer = 20;
		return steuer;
	}
}
	