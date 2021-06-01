package de.hs_lu.o2s.tutorium.uebung5.vorlage;

public class Boot implements Comparable {

	private int gewicht, sitze, maxKnoten;
	private double laenge, breite, hoehe;

	public Boot(int gewicht, int sitze, int maxKnoten, double laenge, double breite, double hoehe) {
		this.gewicht = gewicht;
		this.sitze = sitze;
		this.maxKnoten = maxKnoten;
		this.laenge = laenge;
		this.breite = breite;
		this.hoehe = hoehe;
	}

	@Override
	public int compareTo(Object objectToCompare) {
		Boot bootToCompare = null;

		if (!(objectToCompare instanceof Boot)) {
			System.out
					.println("compareTo: uebergebenes Objekt ist kein Boot. Vergleich kann nicht durchgeführt werden.");
			return Integer.MIN_VALUE;
		}
		bootToCompare = (Boot) objectToCompare;

		int maxKnotenDifferenz = this.maxKnoten - bootToCompare.maxKnoten;
		if (maxKnotenDifferenz != 0)
			return maxKnotenDifferenz;

		int sitzeDifferenz = this.sitze - bootToCompare.sitze;
		if (sitzeDifferenz != 0)
			return sitzeDifferenz;

		return 0;
	}

	public int getGewicht() {
		return this.gewicht;
	}

	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}

	public int getSitze() {
		return this.sitze;
	}

	public void setSitze(int sitze) {
		this.sitze = sitze;
	}

	public int getMaxKnoten() {
		return this.maxKnoten;
	}

	public void setMaxKnoten(int maxKnoten) {
		this.maxKnoten = maxKnoten;
	}

	public double getLaenge() {
		return this.laenge;
	}

	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}

	public double getBreite() {
		return this.breite;
	}

	public void setBreite(double breite) {
		this.breite = breite;
	}

	public double getHoehe() {
		return this.hoehe;
	}

	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}
}
