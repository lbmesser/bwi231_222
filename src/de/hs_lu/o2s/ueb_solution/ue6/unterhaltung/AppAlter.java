// 30 Punkte
package de.hs_lu.o2s.ueb_solution.ue6.unterhaltung;

public class AppAlter {

	public static void main(String[] args) {
		Disco myDisco = new Disco(550); // 1 Punkt

		// 10 Punkte (je Zeile 1 Punkt)
		System.out.println(
				"Versuche einen Studenten mit Geburtsjahr 2008 anzulegen und pruefe, ob er in die Disco kommt.");
		try {
			Student stud1 = new StudentAgeChecked("Martin", 2008, "111111");
			System.out.println("Martin darf studieren.");
			myDisco.pruefeGast(stud1);
			System.out.println("Martin darf in die Disco.");
		} catch (ZuJungZumStudierenException zje) {
			System.out.println(zje.getMessage());
		} catch (ZuJungException zje) {
			System.out.println(zje.getMessage());
		}

		// 10 Punkte (je Zeile 1 Punkt)
		System.out.println(
				"\nVersuche eine Studentin mit Geburtsjahr 2002 anzulegen und pruefe, ob sie in die Disco kommt.");
		try {
			Student stud1 = new StudentAgeChecked("Julia", 2002, "444444");
			System.out.println("Julia darf studieren.");
			myDisco.pruefeGast(stud1);
			System.out.println("Julia darf in die Disco.");
		} catch (ZuJungZumStudierenException zje) {
			System.out.println(zje.getMessage());
		} catch (ZuJungException zje) {
			System.out.println(zje.getMessage());
		}

		// 10 Punkte (je Zeile 1 Punkt)
		System.out.println(
				"\nVersuche einen Studenten mit Geburtsjahr 1999 anzulegen und pruefe, ob er in die Disco kommt.");
		try {
			Student stud1 = new StudentAgeChecked("Hendrik", 1999, "654321");
			System.out.println("Hendrik darf studieren.");
			myDisco.pruefeGast(stud1);
			System.out.println("Hendrik darf in die Disco.");
		} catch (ZuJungZumStudierenException zje) {
			System.out.println(zje.getMessage());
		} catch (ZuJungException zje) {
			System.out.println(zje.getMessage());
		}

	}

}
