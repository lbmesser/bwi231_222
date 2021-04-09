package de.hs_lu.o2s.tut1.uebung;

public class carArray {

	private Auto[] carArray;

	public carArray() {
		carArray = new Auto[0];
	}

	public void addCarToArray(Auto carToAdd) {
		Auto[] newCarArray = new Auto[this.carArray.length + 1];
		newCarArray[0] = carToAdd;
		System.arraycopy(this.carArray, 0, newCarArray, 1, this.carArray.length);
		this.carArray = newCarArray;
	}

	public void deleteFirstCarFromArray() {
		Auto[] newCarArray = new Auto[this.carArray.length - 1];
		System.arraycopy(this.carArray, 1, newCarArray, 0, newCarArray.length);
		this.carArray = newCarArray;
	}

	public int getCountOfCars() {
		return this.carArray.length;
	}

	public Auto getLastCar() {
		return this.carArray[this.carArray.length - 1];
	}

	public String toString() {
		String result = "Alle Autos des CarArrays:\n";

		for (int i = 0; i < this.carArray.length; i++) {
			result += this.carArray[i] + "\n";
		}
		return result;
	}

}
