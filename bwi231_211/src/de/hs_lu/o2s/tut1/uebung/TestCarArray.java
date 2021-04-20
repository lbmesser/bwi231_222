package de.hs_lu.o2s.tut1.uebung;

import junit.framework.TestCase;

public class TestCarArray extends TestCase {

	private Auto car1, car2, car3;
	private CarArray carArray;

	protected void setUp() throws Exception {
		this.car1 = new Auto("LU-MS-220", 60.0, 4.5, 50000, new Person("Max", "Mustermann", "18.05.2000"));
		this.car2 = new Auto("MA-MS-220", 90.0, 6.5, 80000, new Person("Fritz", "Mayer", "28.05.2000"));
		this.car3 = new Auto("HD-MS-220", 50.0, 8.5, 56000, new Person("Julia", "Braun", "02.02.1998"));

		this.carArray = new CarArray();
	}

	protected void tearDown() throws Exception {
		this.car1 = null;
		this.car2 = null;
		this.car3 = null;
		this.carArray = null;
	}

	public void testAddCarToArray() {
		assertEquals(0, this.carArray.getCountOfCars());
		this.carArray.addCarToArray(car1);
		assertEquals(1, this.carArray.getCountOfCars());
	}

	public void testDeleteFirstCarFromArray() {
		// Versucht zu löschen, obwohl Array leer ist
		assertEquals(0, this.carArray.getCountOfCars());
		this.carArray.deleteFirstCarFromArray();
		assertEquals(0, this.carArray.getCountOfCars());

		// Versucht zu löschen, wenn ein Array ein Auto enthält
		this.carArray.addCarToArray(car1);
		assertEquals(1, this.carArray.getCountOfCars());
		this.carArray.deleteFirstCarFromArray();
		assertEquals(0, this.carArray.getCountOfCars());

		// Überprüft, ob bei mehreren Autos, tatsächlich das erste Element gelöscht wird
		this.carArray.addCarToArray(car1);
		this.carArray.addCarToArray(car2);
		assertEquals(2, this.carArray.getCountOfCars());
		System.out.println("Vorm Löschen: " + this.carArray);

		this.carArray.deleteFirstCarFromArray();
		assertEquals(1, this.carArray.getCountOfCars());

		System.out.println("Nach dem Löschen: " + this.carArray);
	}

	public void testGetLastCar() {
		assertEquals(null, this.carArray.getLastCar());
		this.carArray.addCarToArray(car1);
		this.carArray.addCarToArray(car2);
		assertEquals(this.car1, this.carArray.getLastCar());
	}

}
