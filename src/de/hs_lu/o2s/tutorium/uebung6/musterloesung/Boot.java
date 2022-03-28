package de.hs_lu.o2s.tutorium.uebung6.musterloesung;

public class Boot {

	private String name;
	private double preis;

	public Boot(String name, double preis) {
		this.name = name;
		this.preis = preis;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreis() {
		return this.preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public String toString() {
		return this.getName() + ", Listenpreis: " + this.getPreis();
	}

}
