package de.hs_lu.o2s.tutorium.uebung1.musterloesung;

public class CarArray {

	private Auto carArray[];

	public CarArray() {
		this.carArray = new Auto[0];
	}

	public void addCarToArray(Auto autoToAdd) {

		// Erzeugen eines Arrays (newCarArray), dass der Laenge des alten Arrays
		// (carArray) plus eins entspricht
		Auto newCarArray[] = new Auto[this.carArray.length + 1];

		// Neues Auto Objekt am Anfang des neues Arrays einfügen
		newCarArray[0] = autoToAdd;

		// Kopieren des Inhalts des ursprünglichen Arrays in das Neue
		// Lösung 1: Befüllen des Arrays mit einer for-Schleife
		/*
		 * for(int i = 0; i < this.carArray.length; i++) { newCarArray[i+1] =
		 * this.carArray[i]; }
		 */
		// Lösung 2: Befüllen des Arrays mit System.arraycopy(...)
		System.arraycopy(this.carArray, 0, newCarArray, 1, this.carArray.length);

		// Zeiger des carArrys auf das newCarArray "ausrichten"
		this.carArray = newCarArray;
	}

	public void deleteFirstCarFromArray() {
		if (this.carArray.length == 0)
			return;
		Auto newCarArray[] = new Auto[this.carArray.length - 1];
		System.arraycopy(this.carArray, 1, newCarArray, 0, this.carArray.length - 1);
		this.carArray = newCarArray;
	}

	public int getCountOfCars() {
		return this.carArray.length;
	}

	public Auto getLastCar() {
		if (this.carArray.length == 0)
			return null;
		return this.carArray[this.carArray.length - 1];
	}

	public String toString() {
		String result = "Alle Autos der " + this.getClass().getSimpleName() + ":\n";
		for (int i = 0; i < this.carArray.length; i++)
			result += this.carArray[i] + "\n";
		return result;
	}
}
