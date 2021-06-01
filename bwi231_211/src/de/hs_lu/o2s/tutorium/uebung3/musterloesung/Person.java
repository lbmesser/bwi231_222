package de.hs_lu.o2s.tutorium.uebung3.musterloesung;

public abstract class Person {

	private String name;

	private String geburtsdatum;

	public Person(String name, String geburtsdatum) {
		this.name = name;
		this.geburtsdatum = geburtsdatum;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGeburtsdatum() {
		return this.geburtsdatum;
	}

	public void setGeburtsdatum(String geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

}
