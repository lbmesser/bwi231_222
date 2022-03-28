package de.hs_lu.o2s.tutorium.uebung9.musterloesung;

public abstract class Mitarbeiter {

	private String mitarbeiternummer, name;

	public Mitarbeiter(String mitarbeiternummer, String name) {
		this.mitarbeiternummer = mitarbeiternummer;
		this.name = name;
	}

	public String getMitarbeiternummer() {
		return this.mitarbeiternummer;
	}

	public void setMitarbeiternummer(String mitarbeiternummer) {
		this.mitarbeiternummer = mitarbeiternummer;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
