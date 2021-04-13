package de.hs_lu.o2s.tut2.uebung;

public class UnternehmensApplikation {

	private static Mitarbeiter[] mitarbeiterArray;

	public static void main(String[] args) {
		unternehmenAnlegen();
		System.out.println("Gesamtsumme der gezahlten Gehaelter im Unternehmen: " + summeGezahlteGehaelter());
	}

	public static void unternehmenAnlegen() {
		mitarbeiterArray = new Mitarbeiter[6];
		mitarbeiterArray[0] = new Vorstand(1500000);
		mitarbeiterArray[1] = new Vorstand(500000);
		mitarbeiterArray[2] = new Manager(100000);
		mitarbeiterArray[3] = new Handwerker(30000);
		mitarbeiterArray[4] = new Hilfskraft(20000);
		mitarbeiterArray[5] = new Hilfskraft(8000);
	}

	public static int summeGezahlteGehaelter() {
		double summeGezahlteGehaelter = 0;
		for (Mitarbeiter mitarbeiter : mitarbeiterArray)
			summeGezahlteGehaelter += mitarbeiter.getJahresBruttoGehalt();

//		Alternativ:
//		for(int i = 0; i<mitarbeiterArray.length; i++) 
//			summeGezahlteGehaelter += mitarbeiterArray[i].getJahresBruttoGehalt();

		return (int) Math.round(summeGezahlteGehaelter);
	}

}
