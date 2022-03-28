package de.hs_lu.o2s.tutorium.uebung9.musterloesung;

import java.util.ArrayList;

public class Logistikunternehmen {

	private ArrayList<Lastkraftwagen> lastkraftwagen;
	private ArrayList<Anhaenger> anhaenger;
	private ArrayList<Lastkraftwagenfahrer> fahrer;

	public Logistikunternehmen() {
		this.lastkraftwagen = new ArrayList<Lastkraftwagen>();
		this.anhaenger = new ArrayList<Anhaenger>();
		this.fahrer = new ArrayList<Lastkraftwagenfahrer>();
	}

	public boolean add(Object objectToAdd) {
		if (objectToAdd instanceof Lastkraftwagen) {
			this.lastkraftwagen.add((Lastkraftwagen) objectToAdd);
			return true;
		}
		if (objectToAdd instanceof Anhaenger) {
			this.anhaenger.add((Anhaenger) objectToAdd);
			return true;
		}
		if (objectToAdd instanceof Lastkraftwagenfahrer) {
			this.fahrer.add((Lastkraftwagenfahrer) objectToAdd);
			return true;
		}
		return false;
	}

	public ArrayList<Object> safeData() {
		ArrayList<Object> unternehmensCopy = new ArrayList<Object>();
		for (Lastkraftwagen currentLastkraftwagen : this.lastkraftwagen) {
			Lastkraftwagen newLastkraftwagen = new Lastkraftwagen(
					new Motor(currentLastkraftwagen.getMotor().getHubraum(),
							currentLastkraftwagen.getMotor().getLeistung(),
							currentLastkraftwagen.getMotor().getKraftstoff()),
					currentLastkraftwagen.getHoechsgeschwindigkeit(),
					currentLastkraftwagen.getZulaessigeGesamtmasseInTonnen(), currentLastkraftwagen.getSitzplaetze());
			unternehmensCopy.add(newLastkraftwagen);
		}
		for (Anhaenger currentAnhaenger : this.anhaenger) {
			Anhaenger newAnhaenger = new Anhaenger(currentAnhaenger.getAnzahlAchsen(),
					currentAnhaenger.getAnhaengerArt());
			unternehmensCopy.add(newAnhaenger);
		}
		for (Lastkraftwagenfahrer currentFahrer : this.fahrer) {
			Lastkraftwagenfahrer newFahrer = new Lastkraftwagenfahrer(currentFahrer.getMitarbeiternummer(),
					currentFahrer.getName(), currentFahrer.getFuehrerscheinKlasse());
			unternehmensCopy.add(newFahrer);
		}
		return unternehmensCopy;
	}

	public ArrayList<Lastkraftwagen> getLastkraftwagen() {
		return this.lastkraftwagen;
	}

	public ArrayList<Anhaenger> getAnhaenger() {
		return this.anhaenger;
	}

	public ArrayList<Lastkraftwagenfahrer> getFahrer() {
		return this.fahrer;
	}

}
