package de.hs_lu.o2s.o2sprobe.hotel;

public class Zimmer {
	private int zimmerNummer;
	private int anzahlBetten;
	private int belegteBetten;
	
	/**
	 * @return the zimmerNummer
	 */
	public int getZimmerNummer() {
		return zimmerNummer;
	}
	/**
	 * @param zimmerNummer the zimmerNummer to set
	 */
	public void setZimmerNummer(int zimmerNummer) {
		this.zimmerNummer = zimmerNummer;
	}
	/**
	 * @return the anzahlBetten
	 */
	public int getAnzahlBetten() {
		return anzahlBetten;
	}
	/**
	 * @param anzahlBetten the anzahlBetten to set
	 */
	public void setAnzahlBetten(int anzahlBetten) {
		this.anzahlBetten = anzahlBetten;
	}
	/**
	 * @return the belegteBetten
	 */
	public int getBelegteBetten() {
		return belegteBetten;
	}
	/**
	 * @param belegteBetten the belegteBetten to set
	 */
	public void setBelegteBetten(int belegteBetten) {
		this.belegteBetten = belegteBetten;
	}
	
	public Zimmer(int zimmerNummer, int anzahlBetten) {
		super();
		this.zimmerNummer = zimmerNummer;
		this.anzahlBetten = anzahlBetten;
		this.belegteBetten = 0;
	}
	
}
