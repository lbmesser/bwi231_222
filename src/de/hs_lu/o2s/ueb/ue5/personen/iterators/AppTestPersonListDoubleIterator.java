package de.hs_lu.o2s.ueb.ue5.personen.iterators;

//ACHTUNG: in dieser Klasse m�ssen Sie nichts �ndern
public class AppTestPersonListDoubleIterator {

	public static void main(String[] args) {
		
		Person[] persA = {new Dozent("Peter Meyer", 1968, "W2"), 
				new Student("Julia Mueller", 1990, "123455")};
						
		PersonList pl = new PersonList(persA);
		
		System.out.println("Liste vor add:");
		for (Object pers: pl) {
			System.out.println(pers);
		}
		
		
		pl.add(new Student("Stefan Richartz", 1997, "554433"));
		
		System.out.println("\nListe nach add:");
		for (Object pers: pl) {
			System.out.println(pers);
		}
	}
}