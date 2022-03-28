package de.hs_lu.o2s.v3.cardgames;

public class Kartenspiel {
	
	
	
	/**
	 * alle moeglichen Kartenfarben
	 */
	String[] farbenA = {"kreuz", "pik", "herz", "karo"};
	
	/**
	 * alle moeglichen Kartenwerte
	 */
	String[] werteA  = {"2", "3", "4", "5", "6", "7", "8",
						"9", "10", "bube", "dame", "koenig", "as"};
	
	/**
	 * Eine Spielkarte ist durch die Farbe und den Wert charakterisiert.
	 * Deshalb werden alle Karten in einem zweidimensionalen Array vom Typ Spielkarte abgelegt 
	 * (Kreuzprodukt aus Farbe und Wert)
	 */
	Spielkarte[][] kartenAA;
	
	/**
	 * Konstruktor: erzeugt ein normales Kartenspiel
	 */
	public Kartenspiel(){
		// zweidimensionales Array initialisieren
		kartenAA = new Spielkarte[farbenA.length][werteA.length];
		
		// die entsprechenden Spielkarten nach und nach anlegen und im 
		// zweidimensionalen Array speichern
		for(int f = 0; f < farbenA.length; f++){
			for(int w = 0; w < werteA.length; w++){
				kartenAA[f][w] = new Spielkarte(farbenA[f], werteA[w]);
			}
		}
	}
	
	/**
	 * Get-Methode fuer das Attribut kartenAA
	 * @return zweidimensionales Array aller Karten
	 */
	public Spielkarte[][] getKartenAA() {
		return kartenAA;
	}
	
	/**
	 * 
	 * @return Anzahl Karten im Kartenspiel
	 */
	public int getKartenAnzahl(){
		return farbenA.length * werteA.length;
	}
	
	/**
	 * Gibt den kumulierten Punktwert aller Karten im Kartenspiel zurueck 
	 * @return kumulierter Punktwert aller Karten
	 */
	public int getPunktwert(){
		int gesamtPunktwert = 0;  // in dieser Variablen hier werden alle Punkte aufsummiert
		
		for(int f = 0; f < farbenA.length; f++){
			for(int w = 0; w < werteA.length; w++){
				gesamtPunktwert += kartenAA[f][w].getPunktwert();
			}
		}
		return gesamtPunktwert;
	}
	
	/**
	 * String-Ausgabe des Kartenspiels
	 * @return Textdarstellung aller Karten des Kartenspiels
	 */
	public String toString(){
		String myString = "Dies ist ein Kartenspiel mit " +
							this.getKartenAnzahl() + 
							" Karten und einem Gesamtpunktwert von " +
							this.getPunktwert() +
							" Punkten\n";
		for(int f = 0; f < farbenA.length; f++){
			for(int w = 0; w < werteA.length; w++){
				myString += kartenAA[f][w].toString() + "\n";
			}
		}
		return myString;
	}
}