package de.hs_lu.o2s.v9.collections;

public class CloneApp {

	public static void main(String[] args) {
		Spielkarte myCard = new Spielkarte("kreuz","as");
		Spielkarte newCard = myCard.clone();
		
		System.out.println("Original :" + myCard);
		System.out.println("Klon :" + newCard);
		
		myCard.setFarbe("karo");
		
		System.out.println("Original :" + myCard);
		System.out.println("Klon :" + newCard);

	}

}
