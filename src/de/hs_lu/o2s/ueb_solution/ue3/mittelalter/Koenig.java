// 10 Punkte
package de.hs_lu.o2s.ueb_solution.ue3.mittelalter;

public class Koenig extends Einwohner { // 1 Punkt

	// 2 Punkte
	public Koenig(int einkommen) {
		this.einkommen = einkommen;
	}
	
	// 2 Punkte
	public Koenig() {
		this.einkommen = 0;
	}
	
	// 5 Punkte
	public int getSteuer() {
		//Koenig zahlt 10% Steuer
		return (int) Math.round(this.getZuVersteuerndesEinkommen() * 0.1);
	}
	
	// 2 Punkte
	public void druckDich() {
		System.out.println("Achtung, der König kommt mit zu versteunderndem Einkommen " + this.getZuVersteuerndesEinkommen());
	}
}
