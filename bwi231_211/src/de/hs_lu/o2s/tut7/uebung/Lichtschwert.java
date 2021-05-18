package de.hs_lu.o2s.tut7.uebung;

public class Lichtschwert {

	/**
	 * Farbe des Lichtschwertes, z.B. blau, gruen, rot
	 */
	private String kiberkristallFarbe;

	/**
	 * Grifform des Lichtschwertes, z.B. gerade, gebogen, geschwungen
	 */
	private String griffForm;

	/**
	 * Klinge des Lichtschwertes, z.B. Doppelklinge, Einfachklinge, Crossklinge
	 */
	private String klinge;

	/**
	 * 
	 * @param kiberkristallFarbe z.B. blau, gruen, rot
	 * @param griffForm          z.B. gerade, gebogen, geschwungen
	 * @param klinge             z.B. Doppelklinge, Einfachklinge, Crossklinge
	 */
	public Lichtschwert(String kiberkristallFarbe, String griffForm, String klinge) {
		this.kiberkristallFarbe = kiberkristallFarbe;
		this.griffForm = griffForm;
		this.klinge = klinge;
	}

	public String getKiberkristallFarbe() {
		return this.kiberkristallFarbe;
	}

	public void setKiberkristallFarbe(String kiberkristallFarbe) {
		this.kiberkristallFarbe = kiberkristallFarbe;
	}

	public String getGriffForm() {
		return this.griffForm;
	}

	public void setGriffForm(String griffForm) {
		this.griffForm = griffForm;
	}

	public String getKlinge() {
		return this.klinge;
	}

	public void setKlinge(String klinge) {
		this.klinge = klinge;
	}

	public String toString() {
		String result = this.getClass().getSimpleName() + " mit Kristallfarbe " + this.getKiberkristallFarbe()
				+ ", Griffform " + this.getGriffForm() + " und Klinge " + this.getKlinge();
		return result;
	}

}
