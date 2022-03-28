package de.hs_lu.o2s.tutorium.uebung4.musterloesung;

public class Person {

	private String vorname, nachname, geburtstag;

	public Person(String vorname, String nachname, String geburtstag) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtstag = geburtstag;
	}

	public String getVorname() {
		return this.vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return this.nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getGeburtstag() {
		return this.geburtstag;
	}

	public void setGeburtstag(String geburtstag) {
		this.geburtstag = geburtstag;
	}

	public String toString() {
		String result = this.vorname + " " + this.nachname;
		return result;
	}

}
