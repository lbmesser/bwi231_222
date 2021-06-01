package de.hs_lu.o2s.tutorium.uebung9.musterloesung;

public class Lastkraftwagen extends Fahrzeug {

	private double geladeneNutzlast;
	private Anhaenger anhaenger;
	private Lastkraftwagenfahrer fahrer;

	public Lastkraftwagen(Motor motor, double hoechsgeschwindigkeit, double zulaessigeGesamtmasseInTonnen,
			int sitzplaetze) {
		super(motor, hoechsgeschwindigkeit, zulaessigeGesamtmasseInTonnen, sitzplaetze);
		this.geladeneNutzlast = 0;
	}

	public double getGeladeneNutzlast() {
		return this.geladeneNutzlast;
	}

	public void setGeladeneNutzlast(double geladeneNutzlast) {
		this.geladeneNutzlast = geladeneNutzlast;
	}

	public Anhaenger getAnhaenger() {
		return this.anhaenger;
	}

	public void setAnhaenger(Anhaenger anhaenger) {
		this.anhaenger = anhaenger;
	}

	public Lastkraftwagenfahrer getFahrer() {
		return this.fahrer;
	}

	public void setFahrer(Lastkraftwagenfahrer fahrer) {
		if (fahrerGeeignet(fahrer))
			this.fahrer = fahrer;
	}

	private boolean fahrerGeeignet(Lastkraftwagenfahrer fahrer) {
		boolean lkwKlasseC = this.getZulaessigeGesamtmasseInTonnen() < 7.5 && this.anhaenger == null;
		boolean lkwKlasseC1 = this.getZulaessigeGesamtmasseInTonnen() >= 7.5 && this.anhaenger == null;
		boolean lkwKlasseC1E = this.getZulaessigeGesamtmasseInTonnen() >= 7.5 && this.anhaenger != null;

		boolean fahrerZugelassenC = fahrer.getFuehrerscheinKlasse().length() >= 1
				&& fahrer.getFuehrerscheinKlasse().substring(0, 1).equals("C");
		boolean fahrerZugelassenC1 = fahrer.getFuehrerscheinKlasse().length() >= 2
				&& fahrer.getFuehrerscheinKlasse().substring(0, 2).equals("C1");
		boolean fahrerZugelassenC1E = fahrer.getFuehrerscheinKlasse().length() >= 3
				&& fahrer.getFuehrerscheinKlasse().equals("C1E");

		if ((lkwKlasseC && fahrerZugelassenC) || (lkwKlasseC1 && fahrerZugelassenC1)
				|| (lkwKlasseC1E && fahrerZugelassenC1E))
			return true;
		return false;
	}

}
