package de.hs_lu.o2s.v10.bestellung;

import java.util.ArrayList;

public abstract class BusinessDocument {

	private int nr;
	private Kunde kunde;
	private ArrayList<Position> pos;
	private boolean ready;
		
	public BusinessDocument() {
		super();
		this.pos = new ArrayList<Position>();  // initialisiere leere Positionsliste
		this.ready = false; // Initialwert 
	}
		
	public BusinessDocument(int nr, Kunde kunde) {
		this(kunde);  // horizontaler Konstruktoraufruf
		this.nr = nr;		
	}

	public BusinessDocument(Kunde kunde) {
		this();  // horizontaler Konstruktoraufruf
		this.kunde = kunde;		
	}
	
	public void addPosition(Position pos) throws Exception {
		if (this.isReady()) {
			throw new Exception(this.getClass().getSimpleName() + " ist bereits fertig. Kann keine weiteren Positionen hinzufuegen.");
		}
		else {
			this.pos.add(pos);
		}
	}
	
	
	public ArrayList<Position> getPos() {
		return pos;
	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}
	
	public String toString() {
		String str = "";
		str += this.getClass().getSimpleName() + " " + this.getPrefix() + this.getNr() +
				" fuer " + this.getKunde() + " mit Positionen:\n";
		
		if (this.pos.size() == 0) {
			str += "Keine Positionen eingefuegt.";
		}
		for(Position p : this.pos) {
			str += "- " + p.toString() + "\n";
		}
		
		if (this.isReady()) {
			str += "(Status: fertig)\n";
		}
		else {
			str += "(Status: nicht fertig)\n";
		}
		
		str += "Gesamtpreis: " + this.getPreis();
		
		return str;
	}

	public boolean isReady() {
		return ready;
	}

	public void setReady(boolean ready) {
		this.ready = ready;
	}
	
	// genutzt zur Umsetzung des Workflows
	public abstract BusinessDocument triggerNextStep() throws Exception;
	
	public abstract String getPrefix();
	
	public double getPreis() {
		double gesamtPreis = 0.0;
		
		for (Position pos : this.getPos()) {
			gesamtPreis += pos.getMenge() * pos.getPosPreis();
		}
		
		return gesamtPreis;
	}
}
