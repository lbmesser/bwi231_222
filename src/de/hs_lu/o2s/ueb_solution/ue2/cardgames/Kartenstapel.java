/*
 * 82 Punkte
 */
package de.hs_lu.o2s.ueb_solution.ue2.cardgames;

public class Kartenstapel {

	/**
	 * Array vom Typ Spielkarte - enth�lt alle Karten, die auf dem Stapel liegen
	 * Index: 0: unterste Karte, ..., kartenA.length-1: oberste Karte
	 */
	// Keine Punkte, da bereits gegeben.
	Spielkarte[] kartenA;

	/**
	 * Konstruktor: erzeugt einen leeren Kartenstapel
	 */
	// Keine Punkte, da bereits gegeben.
	public Kartenstapel() {
		kartenA = new Spielkarte[0];
	}

	/**
	 * Konstruktor: erzeugt einen Kartenstapel mit genau einer (der �bergebenen)
	 * Karte
	 * 
	 * @param spielkarte
	 */
	// Keine Punkte, da bereits gegeben.
	public Kartenstapel(Spielkarte spielkarte) {
		// genau eine Spielkarte (die �bergebene) in den Stapel legen
		kartenA = new Spielkarte[1];
		kartenA[0] = spielkarte;
	}

	/**
	 * Konstruktor: erzeugt einen Kartenstapel mit anzahl_spiele Spielen
	 * 
	 * @param anzahl_spiele
	 *            Anzahl der zu erzeugenden Standard-Spiele
	 */
	/*
	 * public Kartenstapel(int anzahl_spiele) { //this(); // ALTERNATIVE
	 * 
	 * if (anzahl_spiele>0) { // Kartenspiele initialisieren
	 * 
	 * Kartenspiel[] spieleA = new Kartenspiel[anzahl_spiele];
	 * 
	 * for (int i=0; i<anzahl_spiele; i++) { spieleA[i] = new Kartenspiel(); }
	 * 
	 * // insgesamt ist der Kartenstapel anzahl_spiele mal so gro� wie eins der
	 * Spiele kartenA = new Spielkarte[spieleA[0].getKartenAnzahl()*anzahl_spiele];
	 * 
	 * // die Karten auf den Stapel legen int index = 0;
	 * 
	 * for (int i=0; i<anzahl_spiele; i++) { Spielkarte[][] kartenAA =
	 * spieleA[i].getKartenAA(); for (int j = 0; j < kartenAA.length; j++){ for (int
	 * k = 0; k < kartenAA[0].length; k++){ kartenA[index] = kartenAA[j][k];
	 * index++;
	 * 
	 * // ALTERNATIVE //this.push(kartenAA[j][k]); } } }
	 * 
	 * } else { System.out.println("Inkorrekte Anzahl Spiele \"" + anzahl_spiele +
	 * "\""); }
	 * 
	 * 
	 * }
	 */

	/**
	 * Konstruktor zur Generierung eines Kartenstapels aus einem gegebenen
	 * Kartenspiel
	 * 
	 * @param spiel
	 *            erzeugtes Spiel der Klasse "Kartenspiel"
	 */
	// Keine Punkte, da bereits gegeben.
	public Kartenstapel(Kartenspiel spiel) {
		kartenA = new Spielkarte[spiel.getKartenAnzahl()];

		int index = 0; // Laufvariable zur Indexierung von kartenA (eindimensional)

		// Referenzierung: jeder Eintrag des Kartenstapels zeigt auf die im Kartenspiel
		// angelegten Objekte vom Typ Spielkarte (im Kartenspiel referenziert aus dem
		// zweidimensionalen
		// Array kartenAA)
		Spielkarte[][] kartenAA = spiel.getKartenAA();
		for (int i = 0; i < kartenAA.length; i++) {
			for (int j = 0; j < kartenAA[0].length; j++) {
				kartenA[index] = kartenAA[i][j];
				index++;
			}
		}
	}

	// Gesamt: 4 Punkte
	// Kommentar: 2 Punkte
	public int getKartenAnzahl() { // 1 Punkt
		return this.kartenA.length; // 1 Punkt
	}

	/**
	 * Legt die �bergebene Karte auf den Kartenstapel
	 * 
	 * @param newCard
	 *            die Karte, die oben auf den Stapel gelegt werden soll
	 */
	// Keine Punkte, da bereits gegeben.
	public void push(Spielkarte newCard) {
		Spielkarte[] kartenNeu = new Spielkarte[kartenA.length + 1]; // ein um 1 gr��eres Array f�r den Stapel anlegen
		System.arraycopy(kartenA, 0, kartenNeu, 0, kartenA.length); // bisherige Karten in das neue Array kopieren (die
																	// Referenzen)
		kartenNeu[kartenA.length] = newCard; // die neue Karte oben auf den Stapel legen
		kartenA = kartenNeu; // den neuen Stapel der Objektvariablen zuweisen
	}

	// Gesamt: 11 Punkte
	// Kommentar: 2 Punkt
	public Spielkarte pop() { // 1 Punkt
		// 2 Punkte
		Spielkarte karte = kartenA[kartenA.length - 1]; // die oberste Spielkarte abheben

		// einen verkleinerten Kartenstapel anlegen
		Spielkarte[] kartenNeu = new Spielkarte[kartenA.length - 1]; // 2 Punkt
		System.arraycopy(kartenA, 0, kartenNeu, 0, kartenA.length - 1); // 2 Punkt
		this.kartenA = kartenNeu; // 1 Punkt

		return karte; // 1 Punkte
	}

	// Gesamt: 10 Punkte
	// Kommentar: 2 Punkt
	public Spielkarte last() { // 1 Punkt
		// 1 Punkt
		Spielkarte karte = kartenA[0]; // die unterste Spielkarte abheben

		// einen verkleinerten Kartenstapel anlegen
		Spielkarte[] kartenNeu = new Spielkarte[kartenA.length - 1]; // 2 Punkt
		System.arraycopy(kartenA, 1, kartenNeu, 0, kartenA.length - 1); // 2 Punkt
		this.kartenA = kartenNeu; // 1 Punkt

		return karte; // 1 Punkt
	}

	// Gesamt: 5 Punkte
	// Kommentar: 2 Punkt
	public Spielkarte top() { // 1 Punkt
		// 2 Punkte
		return kartenA[kartenA.length - 1]; // die oberste Spielkarte zur�ckgeben ohne sie abzuheben
	}

	// Gesamt: 16 Punkte
	// Kommentar: 2 Punkt
	public Spielkarte popRandomCard() { // 1 Punkt
		int randomIndex = (int) (Math.random() * kartenA.length); // 3 Punkte

		Spielkarte retSpielkarte = kartenA[randomIndex]; // 1 Punkt

		// einen verkleinerten Kartenstapel anlegen
		Spielkarte[] kartenNeu = new Spielkarte[kartenA.length - 1]; // 2 Punkt

		// Kopieren - Teil 1: bis randomIndex
		System.arraycopy(kartenA, 0, kartenNeu, 0, randomIndex); // 2 Punkte

		// Kopieren - Teil 2: ab randomIndex+1 bis Ende
		System.arraycopy(kartenA, randomIndex + 1, kartenNeu, randomIndex, kartenA.length - randomIndex - 1); // 3
																												// Punkte

		this.kartenA = kartenNeu; // 1 Punkt

		return retSpielkarte; // eine zuf�llige Spielkarte zur�ckgeben ohne sie abzuheben // 1 Punkt
	}

	// Gesamt: 5 Punkte
	// Kommentar: 2 Punkt
	public boolean empty() { // 1 Punkt
		return this.kartenA.length == 0; // 1 Punkt
	}

	/**
	 * legt das �bergebene Kartenspiel auf den Stapel
	 */
	// Gesamt: 9 Punkte
	// Kommentar: 2 Punkt
	public void addKartenspiel(Kartenspiel spiel) { // 1 Punkt

		// ALTERNATIVE
		// einen neuen Kartenstapel mit gr��erer Anzahl Karten anlegen
		//
		// Spielkarte[] kartenNeu = new Spielkarte[kartenA.length +
		// spiel.getKartenAnzahl()];
		//
		// // den bisherigen Stapel kopieren
		// System.arraycopy(kartenA, 0, kartenNeu, 0, kartenA.length);
		//
		// // die Karten aus dem Spiel auf den Stapel legen (kopieren)
		// Spielkarte[][] kartenAA = spiel.getKartenAA();
		//
		// Spielkarte[] kartenAusSpiel = new Spielkarte[spiel.getKartenAnzahl()];
		//
		// int index = 0;
		// for(int i=0; i<kartenAA.length;i++) {
		// for(int j=0; j<kartenAA[i].length;j++) {
		// kartenAusSpiel[index] = kartenAA[i][j];
		// index++;
		// }
		// }
		//
		// System.arraycopy(kartenAusSpiel, 0, kartenNeu, kartenA.length,
		// spiel.getKartenAnzahl());
		//
		// this.kartenA = kartenNeu;

		// 6 Punkte
		for (int i = 0; i < spiel.getKartenAA().length; i++) {
			for (int j = 0; j < spiel.getKartenAA()[0].length; j++) {
				this.push(spiel.getKartenAA()[i][j]);
			}
		}
	}

	/**
	 * legt den �bergebenen Kartenstapel auf den Stapel
	 */
	// Gesamt: 6 Punkte
	// Kommentar: 2 Punkt
	public void addKartenstapel(Kartenstapel stapel) { // 1 Punkt

		int kartenanzahl = stapel.getKartenAnzahl(); // 1 Punkt
		for (int i = 0; i < kartenanzahl; i++) { // 1 Punkt
			this.push(stapel.pop()); // 1 Punkt
		}
	}

	// Gesamt: 7 Punkte
	// Kommentar: 2 Punkt
	public int getPunktwert() { // 1 Punkt
		int myPunktwert = 0; // 1 Punkt
		for (int i = 0; i < this.kartenA.length; i++) { // 1 Punkt
			myPunktwert += kartenA[i].getPunktwert(); // 1 Punkt
		}
		return myPunktwert; // 1 Punkt
	}

	/**
	 * Mischt den Kartenstapel
	 */
	/*
	 * public void mischen() {
	 * 
	 * for (int lastIndexToChange = this.kartenA.length - 1; lastIndexToChange > 0;
	 * lastIndexToChange--) { double rand = Math.random(); // random zwischen 0 und
	 * 1 int newIndex = (int) Math.floor(rand * lastIndexToChange); // die
	 * rand-%-ige Karte nehmen und Rundung
	 * 
	 * // Tauschen: i-te Karten gegen neuen, zuf�llig ermittelten Index Spielkarte
	 * karte = this.kartenA[newIndex]; this.kartenA[newIndex] =
	 * this.kartenA[lastIndexToChange]; this.kartenA[lastIndexToChange] = karte; }
	 * 
	 * // Original: neues Array f�r den Stapel anlegen // Spielkarte[] kartenNeu =
	 * new Spielkarte[this.getKartenAnzahl()]; // // int altPos; // int restAnzahl =
	 * this.getKartenAnzahl(); // // for (int i = 0; i < kartenA.length; i++) { //
	 * altPos = (int) Math.floor(Math.random() * restAnzahl); // kartenNeu[i] =
	 * kartenA[altPos]; // Die zuf�llig gezogen Karte aus dem //
	 * original-Kartenstapel an Position i einf�gen // kartenA[altPos] =
	 * kartenA[restAnzahl - 1]; // restAnzahl--; // } // kartenA = kartenNeu; }
	 */

	/**
	 * Gibt die Metadaten zu einem Kartenstapel und alle darin befindlichen Karten
	 * aus
	 */

	// Gesamt: 9 Punkte
	// Kommentar: 2 Punkt
	public String toString() { // 1 Punkt
		// 1 Punkte
		String stapelString = "Kartenstapel mit " + this.getKartenAnzahl() + " Karten, einem Punktwert von "
				+ this.getPunktwert() + " und den folgenden Karten:\n";
		// 4 Punkte
		for (int i = 0; i < this.kartenA.length; i++) {
			stapelString += kartenA[i].getFarbe() + " " + kartenA[i].getWert();
			if (i < kartenA.length - 1) {
				stapelString += ",\n";
			}
		}

		return stapelString; // 1 Punkt
	}
}
