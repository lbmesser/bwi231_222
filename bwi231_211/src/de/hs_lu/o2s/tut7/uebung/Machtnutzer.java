package de.hs_lu.o2s.tut7.uebung;

public class Machtnutzer {

	/**
	 * Name des Machtnutzers, z.B. Darth Vader, Luke Skywalker
	 */
	private String name;
	/**
	 * Zugehoerigkeit des Machtnutzers, z.B. Republik, Imperium, Nachtschwestern
	 */
	private String zugehoerigkeit;
	/**
	 * Rang des Machtnutzers, z.B. Juengling, Padawan, Jedi, Jedi-Meister,
	 * Sith-Schueler, Sith-Lord
	 */
	private String rang;

	/**
	 * 
	 * @param name           z.B. Darth Vader, Luke Skywalker
	 * @param zugehoerigkeit z.B. Republik, Imperium, Nachtschwestern
	 * @param rang           z.B. Juengling, Padawan, Jedi, Jedi-Meister,
	 *                       Sith-Schueler, Sith-Lord
	 */
	public Machtnutzer(String name, String zugehoerigkeit, String rang) {
		this.name = name;
		this.zugehoerigkeit = zugehoerigkeit;
		this.rang = rang;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZugehoerigkeit() {
		return this.zugehoerigkeit;
	}

	public void setZugehoerigkeit(String zugehoerigkeit) {
		this.zugehoerigkeit = zugehoerigkeit;
	}

	public String getRang() {
		return this.rang;
	}

	public void setRang(String rang) {
		this.rang = rang;
	}

	public String toString() {
		String result = this.getRang() + " " + this.getName() + " ist ein " + this.getClass().getSimpleName()
				+ " und gehoert zu " + this.getZugehoerigkeit();
		return result;
	}

}
