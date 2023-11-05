/*
 * 9 Punkte
 */
package de.hs_lu.o2s.ueb_solution.ue1.huehner;

public class Henne {
	// 2x 0.5 = 1 Punkt
	String name;
	Ei ei;

	// 2 Punkte
	public Henne(String name, Ei ei) {
		super();
		this.name = name;
		this.ei = ei;
	}

	// 1 Punkt
	public String getName() {
		return name;
	}

	// 1 Punkt
	public void setName(String name) {
		this.name = name;
	}

	// 1 Punkt
	public Ei getEi() {
		return ei;
	}

	// 1 Punkt
	public void setEi(Ei ei) {
		this.ei = ei;
	}

	// 2 Punkte
	public String toString() {
		return "Henne mit Name " + this.getName() + " und " + this.getEi();
	}

}
