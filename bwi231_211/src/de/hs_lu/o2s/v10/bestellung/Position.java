package de.hs_lu.o2s.v10.bestellung;

public class Position {

	Artikel artikel;
	int menge;
	double posPreis = -1;
	
	public Position(Artikel artikel, int menge, double posPreis) {
		super();
		this.artikel = artikel;
		this.menge = menge;
		this.posPreis = posPreis;
	}
	
	public Position(Artikel artikel, int menge) {
		super();
		this.artikel = artikel;
		this.menge = menge;		
	}
	
	public Artikel getArtikel() {
		return artikel;
	}
	public void setArtikel(Artikel artikel) {
		this.artikel = artikel;
	}
	public int getMenge() {
		return menge;
	}
	public void setMenge(int menge) {
		this.menge = menge;
	}
	public double getPosPreis() {		
		if (this.posPreis == -1) {
			return this.artikel.getListenPreis();
		}
		return posPreis;
	}
	public void setPosPreis(double posPreis) {
		this.posPreis = posPreis;
	}
	
	public String toString() {
		return this.getMenge() + "x " + this.artikel.getName() + " (Preis " + this.getPosPreis() + " Euro)";
	}
	
	
}
