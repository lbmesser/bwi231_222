package de.hs_lu.o2s.tutorium.uebung8.musterloesung;

public class LKW extends Fahrzeug implements Nutzfahrzeuge {

	private double geladeneNutzlast;

	public LKW(Motor motor, double hoechsgeschwindigkeit, double zulaessigeGesamtmasseInTonnen, int sitzplaetze) {
		super(motor, hoechsgeschwindigkeit, zulaessigeGesamtmasseInTonnen, sitzplaetze);
		this.geladeneNutzlast = 0;
	}

	public double getGeladeneNutzlast() {
		return this.geladeneNutzlast;
	}

	public void setGeladeneNutzlast(double geladeneNutzlast) {
		this.geladeneNutzlast = geladeneNutzlast;
	}

	@Override
	public String toString() {
		String result = this.getClass().getSimpleName() + " hat eine eine zulaessigen Gesamtmasse in Tonnen von "
				+ this.getZulaessigeGesamtmasseInTonnen() + ". Es sind bereits " + this.getGeladeneNutzlast()
				+ " verladen. Es wurde ein " + this.getMotor()
				+ " Motor verbaut, und die Hoechstgeschwindigkeit betraegt " + this.getHoechsgeschwindigkeit()
				+ ". Die Anzahl der Sitzplaetze betraegt " + this.getSitzplaetze();
		return result;
	}

	@Override
	public double getReturnOnInvest() {
		return 10;
	}

	public void beladen(double gewicht) throws ZuSchwerException {
		if (gewicht < 0)
			return;
		double offeneNutzlast = this.getZulaessigeGesamtmasseInTonnen() - this.getGeladeneNutzlast();
//		if (gewicht > offeneNutzlast)
//			this.setGeladeneNutzlast(offeneNutzlast);
//		else
//			this.setGeladeneNutzlast(gewicht);
		if (gewicht > offeneNutzlast)
			throw new ZuSchwerException();
		this.setGeladeneNutzlast(gewicht + this.getGeladeneNutzlast());
	}

}
