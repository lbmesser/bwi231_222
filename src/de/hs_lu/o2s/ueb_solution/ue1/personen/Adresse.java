/*
 * 23 Punkte
 */
package de.hs_lu.o2s.ueb_solution.ue1.personen;

public class Adresse {
	private String str, hnr, plz, stadt, bundesland, land; // 3 Punkte
	
	// 3 Punkte
	public Adresse(String str, String hnr, String plz, String stadt, String bundesland, String land) {
		this.setStr(str);
		this.setHnr(hnr);
		this.setPlz(plz);
		this.setStadt(stadt);
		this.setBundesland(bundesland);
		this.setLand(land);
	}

	// 3 Punkte
	public String toString() {
		return this.getStr() + " " + this.getHnr() + "\n" + this.getPlz() + " " + this.getStadt() + "\n"
				+ this.getBundesland() + "\n" + this.getLand();
	}

	// 2 Punkte
	public boolean liegtInRLP() {
		return this.bundesland.toUpperCase() == "RHEINLAND-PFALZ";
	}

	// 1 Punkt pro getter/setter = 12 Punkte

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String getHnr() {
		return hnr;
	}

	public void setHnr(String hausnr) {
		this.hnr = hausnr;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getStadt() {
		return stadt;
	}

	public void setStadt(String stadt) {
		this.stadt = stadt;
	}

	public String getBundesland() {
		return bundesland;
	}

	public void setBundesland(String bundesland) {
		this.bundesland = bundesland;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String nation) {
		this.land = nation;
	}

}
