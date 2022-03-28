package de.hs_lu.o2s.tutorium.uebung3.musterloesung;

public class Student extends Person implements Hochschulangehoeriger, Comparable<Object> {

	private static double semesterGebuehr = 175.0;
	private int studienSemester, matrikelnummer;
	private int ectsPunkte;
	private String fachbereich;

	public Student(String name, String geburtsdatum) {
		super(name, geburtsdatum);
	}

	public Student(String name, String geburtsdatum, int matrikelNummer) {
		super(name, geburtsdatum);
		this.setMatrikelnummer(matrikelNummer);
	}

	public Student(String name, String geburtsdatum, int matrikelNummer, int studienSemester, int ectsPunkte,
			String fachbereich) {
		this(name, geburtsdatum, matrikelNummer);
		this.setStudienSemester(studienSemester);
		this.setEctsPunkte(ectsPunkte);
		this.setFachbereich(fachbereich);
	}

	@Override
	public int compareTo(Object objectToCompare) {
		if (objectToCompare instanceof Student) {
			int value = this.getEctsPunkte();
			int comparedToValue = ((Student) objectToCompare).getEctsPunkte();
			int result = value - comparedToValue;
			return result;
		}
		return Integer.MIN_VALUE;
	}

	public double getStudienkosten() {
		return Student.getStudienGebuehr() * this.getStudienSemester();
	}

	public static double getStudienGebuehr() {
		return Student.semesterGebuehr;
	}

	public static void setStudienGebuehr(double studienGebuehr) {
		Student.semesterGebuehr = studienGebuehr;
	}

	public int getStudienSemester() {
		return this.studienSemester;
	}

	public void setStudienSemester(int studienSemester) {
		this.studienSemester = studienSemester;
	}

	public int getMatrikelnummer() {
		return this.matrikelnummer;
	}

	public void setMatrikelnummer(int matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
	}

	public int getEctsPunkte() {
		return this.ectsPunkte;
	}

	public void setEctsPunkte(int ectsPunkte) {
		this.ectsPunkte = ectsPunkte;
	}

	private void setFachbereich(String fachbereich) {
		this.fachbereich = fachbereich;
	}

	public String getFachbereich() {
		return this.fachbereich;
	}

}
