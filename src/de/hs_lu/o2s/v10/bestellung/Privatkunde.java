package de.hs_lu.o2s.v10.bestellung;

public class Privatkunde implements Kunde {

	private String name;
	private String adresse;
			
	public void setName(String name) {
		this.name = name;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Privatkunde(String name, String adresse) {
		super();
		this.name = name;
		this.adresse = adresse;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getLieferAdresse() {
		return this.adresse;
	}

	@Override
	public String getRechnungsAdresse() {
		return this.adresse;
	}
	
	public String toString() {
		return "Privatkunde (" + this.getName() + ", " + this.getRechnungsAdresse() + ")";
	}

}
