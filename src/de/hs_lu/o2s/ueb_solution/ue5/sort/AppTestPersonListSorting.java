package de.hs_lu.o2s.ueb_solution.ue5.sort;

import java.util.Arrays;

//ACHTUNG: in dieser Klasse m�ssen Sie nichts �ndern
public class AppTestPersonListSorting {

	public static void main(String[] args) {
				
		Person[] persA = new Person[7];
		
		persA[0] = new Dozent("Peter Meyer", 1968, "W2");
		persA[1] = new Student("Julia Mueller", 1990, "123455");
		persA[2] = new Student("Markus Laer", 1993, "777888");
		persA[3] = new Dozent("Peter Meyer", 1954, "C4");
		persA[4] = new Student("Markus Schulz", 1993, "654321");
		persA[5] = new Dozent("Anton Jung", 1968, "W2");
		persA[6] = new Student("Markus Laer", 1993, "777999");
		
	
		System.out.println("Vergleich von Peter Meyer und Julia Mueller: " +
				persA[0].compareTo(persA[1]));
		
		System.out.println("Vergleich von Markus Laer und Julia Mueller: " + 
				persA[2].compareTo(persA[1]));
		
		System.out.println("Vergleich von Peter Meyer (1968) und Peter Meyer (1954): " + 
				persA[0].compareTo(persA[3]));
		
		System.out.println("Vergleich von Peter Meyer und Matthias Jung: " + 
				persA[0].compareTo(persA[5]));
		
		System.out.println("Vergleich von Markus Laer (777888) und Markus Laer (777999): " + 
				persA[2].compareTo(persA[6]));
		
				
		System.out.println("Liste unsortiert:");
		for (Person pers: persA) {
			System.out.println(pers);
		}
						
		
		Arrays.sort(persA, (o1, o2) -> o1.compareTo(o2));
		
		System.out.println("Liste sortiert:");
		for (Person pers: persA) {
			System.out.println(pers);
		}
	}

}
