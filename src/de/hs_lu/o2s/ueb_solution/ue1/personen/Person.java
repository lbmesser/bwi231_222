/*
 * 22 Punkte
 */
package de.hs_lu.o2s.ueb_solution.ue1.personen;

public class Person {
	// 6x 0,5 Punkte = 3 Punkte
	String vorname, nachname;
	boolean berufstaetig;
	String beruf;
	int geburtsjahr;
	Adresse adresse;

	// 2x 0.5 Punkte = 1 Punkt
	public Person(String vorname, String nachname) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
	}

	// 3x 0.5 Punkte = 1.5 Punkte
	public Person(String vorname, String nachname, Adresse adresse) {
		this(vorname, nachname);
		this.setAdresse(adresse);
	}

	// 4.5 Punkte
	public String toString() {
		// 1 Punkt
		String personString = this.getVorname() + " " + this.getNachname() + "\n";

		// 0.5 Punkte
		personString += "Beruf: ";

		// 1.5 Punkte
		if (this.isBerufstaetig())
			personString += this.getBeruf() + "\n";
		else
			personString += "Person ist nicht berufstaetig\n"; // Umlaute wären keine Fehler

		// 1 Punkt
		if (this.getGeburtsjahr() > 1900)
			personString += "Geboren im Jahr " + this.getGeburtsjahr() + "\n";

		// 0.5 Punkte
		personString += "Adresse:\n" + this.getAdresse().toString();

		return personString;
	}

	// 1 Punkt pro Getter/Setter = 12 Punkte

	public int getGeburtsjahr() {
		return geburtsjahr;
	}

	public void setGeburtsjahr(int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public boolean isBerufstaetig() {
		return berufstaetig;
	}

	public void setBerufstaetig(boolean berufstaetig) {
		this.berufstaetig = berufstaetig;
	}

	public String getBeruf() {
		return beruf;
	}

	public void setBeruf(String beruf) {
		this.beruf = beruf;
	}

}
