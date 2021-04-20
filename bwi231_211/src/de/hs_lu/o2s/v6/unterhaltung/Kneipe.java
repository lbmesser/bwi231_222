package de.hs_lu.o2s.v6.unterhaltung;

public class Kneipe extends Gewerbebetrieb implements Unterhaltend {

	/**
	 * Bierpreis in der Kneipe
	 * Standardwert 2,40 Euro
	 */
	private float bierpreis = (float) 2.40;
	
	/**
	 * Angebotene Getränke in der Kneipe
	 * Standardauswahl Bier, Wein, Sekt
	 */
	private String[] getraenke = {"Bier", "Wein", "Sekt"};
	
	/**
	 * Konstruktor zum Anlegen einer Kneipe 
	 * 
	 * @param bierpreis Preis des Bieres in Euro
	 * @param getraenke Getränkeliste der Kneipe
	 */
	public Kneipe(float bierpreis, String[] getraenke) {
		this.bierpreis = bierpreis;
		this.getraenke = getraenke;
	}
	
	
	/**
	 * Konstruktor für Kneipen
	 * @param name Name des Gewerbebetriebs (der Kneipe)
	 * @param gruendungsjahr Gründungsjahr des Gewerbebetriebs (der Kneipe)
	 * @param bierpreis Preis des Bieres in der Kneipe
	 * @param getraenke Array (String) der angebotenen Getränke in der Kneipe
	 */
	public Kneipe(String name, int gruendungsjahr, float bierpreis, String[] getraenke) {
		super(name, gruendungsjahr);
		this.bierpreis = bierpreis;
		this.getraenke = getraenke;
	}
	
	@Override
	public int getUnterhaltungswert() {
		// je mehr Getränke es gibt desto besser UND
		// je weniger das Bier kostet desto besser
		double wert = getraenke.length / getBierpreis();
		
		// Skalierung (zur Vergleichbarkeit mit Diskotheken) und Casting auf int
		return 10 * (int) Math.floor(wert); 
	}
	
	public String toString(){
		String kneipeString = super.toString();
		kneipeString += "\n" + "Anzahl Getränke: " + this.getGetraenke().length + "\nBierpreis: " + this.getBierpreis() + "\n" + 
				"Unterhaltungswert: " + this.getUnterhaltungswert();	
		
		return kneipeString;
	}
	
	public float getBierpreis() {
		return bierpreis;
	}


	public void setBierpreis(float bierpreis) {
		this.bierpreis = bierpreis;
	}


	public String[] getGetraenke() {
		return getraenke;
	}


	public void setGetraenke(String[] getraenke) {
		this.getraenke = getraenke;
	}

}

