// 10 Punkte
package de.hs_lu.o2s.ueb_solution.ue6.unterhaltung;

public class StudentAgeChecked extends Student { // 1 Punkt

	
	public StudentAgeChecked(String name, int geburtsjahr) throws ZuJungZumStudierenException { // 2 Punkte
		super(name); // 1 Punkt
		
		// 2 Punkte
		if (geburtsjahr > 2008){
			throw new ZuJungZumStudierenException();
		}
		// 1 Punkt
		this.setGeburtsjahr(geburtsjahr);
	}
	
	// 3 Punkte
	public StudentAgeChecked(String name, int geburtsjahr, String matrNr) throws ZuJungZumStudierenException{
		this(name, geburtsjahr); 		
		this.setMatrNr(matrNr);
	}

}