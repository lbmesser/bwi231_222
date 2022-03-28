package de.hs_lu.o2s.v4.personen;

public class AppTestStudent {

	public static void main(String[] args) {
		
		System.out.println("Aufgabe 2:");
		// Aufgabe 2 - Schritt 1
		Person  pers1 = new Person("Herbert Hochschulrat", 1950);
		Student stud1 = new Student("Karola Fleiﬂig", "654321");
		
		// Aufgabe 2 - Schritt 2
		stud1.setGeburtsjahr(1986);
		System.out.println(pers1.toString());
		System.out.println(stud1.toString());
		
		// Aufgabe 2 - Schritt 3
		System.out.println(pers1.getName());
//		System.out.println(pers1.getMatrNr());
		System.out.println(stud1.getName());
		System.out.println(stud1.getMatrNr());
		
		// Aufgabe 7
		System.out.println("Aufgabe 7:");
		pers1.druckDich();
		stud1.druckDich();
				
		// Aufgabe 8
		Person pers2 = stud1; // geht
//		Student stud2 = pers1; // geht nicht		
		
		// AUfgabe 9
		System.out.println("Aufgabe 9:");
		System.out.println(stud1.toString());
		System.out.println(pers2.toString());
		
		// Aufgabe 10
		System.out.println("Aufgabe 10:");
//		System.out.println(pers2.getMatrNr()); // geht nicht
		
		// Aufgabe 11
		System.out.println("Aufgabe 11:");
		Student stud3 = (Student) pers2; // geht, weil pers2 "eigentlich" Student ist
		System.out.println(stud3.getMatrNr()); // geht
		
		// Aufgabe 12
		System.out.println("Aufgabe 12:");
		//Student stud4 = (Student) pers1; // Compiler geht, aber Laufzeitfehler
		//System.out.println(stud4);
		
		// Aufgabe 13
		System.out.println("Aufgabe 13:");
		if (pers1 instanceof Student){ // Laufzeitfehler vermeiden
			Student stud5 = (Student) pers1;
			System.out.println(stud5);
		}
		
		// Aufgabe 14
		System.out.println("Aufgabe 14:");
		Dozent doz1 = new Dozent("Uwe Klug", "C2");
		Person[] persA = new Person[3];
		persA[0] = pers1;
		persA[1] = stud1;
		persA[2] = doz1;
		for (int index = 0; index < persA.length; index++){
			System.out.println(persA[index]);
		}
		
		for (Person myPers : persA){
			if (myPers instanceof Dozent){
				System.out.println("Achtung, der Dozent kommt");
			}
			System.out.println(myPers);
		}

	}

}
