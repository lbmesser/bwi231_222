package de.hs_lu.o2s.v10.bestellung;

public class Artikel {

	private int artNr;
	private String name;
	private double listenPreis;
	
	
	public Artikel(int artNr, String name, double listenPreis) {
		super();
		this.artNr = artNr;
		this.name = name;
		this.listenPreis = listenPreis;
	}


	public int getArtNr() {
		return artNr;
	}


	public void setArtNr(int artNr) {
		this.artNr = artNr;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getListenPreis() {
		return listenPreis;
	}


	public void setListenPreis(double listenPreis) {
		this.listenPreis = listenPreis;
	}
	
	public String toString() {
		return "Artikelnummer: " + this.getArtNr() + ", Name: " + this.getName() + ", Listenpreis: " + this.getListenPreis();
	}
	
	
}
