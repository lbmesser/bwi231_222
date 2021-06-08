package de.hs_lu.o2s.tutorium.uebung7.musterloesung;

import java.util.HashMap;

public class LichtschwerterZuteilung extends HashMap<Machtnutzer, Lichtschwert> implements Cloneable {

	private static final long serialVersionUID = 1L;

	// A deep copy copies the values
	public LichtschwerterZuteilung deepCopy() {
		LichtschwerterZuteilung newLichtschwerterZuteilung = new LichtschwerterZuteilung();
		for (Machtnutzer currentMachtnutzer : this.keySet()) {

			Machtnutzer newMachtnutzer = new Machtnutzer(currentMachtnutzer.getName(),
					currentMachtnutzer.getZugehoerigkeit(), currentMachtnutzer.getRang());

			Lichtschwert currentLichtschwert = this.get(currentMachtnutzer);
			Lichtschwert newLichtschwert = new Lichtschwert(currentLichtschwert.getKiberkristallFarbe(),
					currentLichtschwert.getGriffForm(), currentLichtschwert.getKlinge());

			newLichtschwerterZuteilung.put(newMachtnutzer, newLichtschwert);
		}
		return newLichtschwerterZuteilung;
	}

	// shallow copy just copies the values of the references in the class
	public LichtschwerterZuteilung shallowCopy() {
		LichtschwerterZuteilung newLichtschwerterZuteilung = new LichtschwerterZuteilung();
		newLichtschwerterZuteilung = this;
		return newLichtschwerterZuteilung;
	}

	public String toString() {
		String result = "";
		for (Machtnutzer currentMachtnutzer : this.keySet()) {
			Lichtschwert currentLichtschwert = this.get(currentMachtnutzer);
			result += currentMachtnutzer.getRang() + " " + currentMachtnutzer.getName() + " hat ein "
					+ currentLichtschwert.getKiberkristallFarbe() + "es "
					+ currentLichtschwert.getClass().getSimpleName() + "\n";
		}

		// Alternativ:
//		Set keySet = this.keySet();
//		Iterator<Machtnutzer> iter = keySet.iterator();
//		while (iter.hasNext()) {
//			Machtnutzer currentMachtnutzer = iter.next();
//			Lichtschwert currentLichtschwert = this.get(currentMachtnutzer);
//			result += currentMachtnutzer.getRang() + " " + currentMachtnutzer.getName() + " hat ein "
//					+ currentLichtschwert.getKiberkristallFarbe() + "es "
//					+ currentLichtschwert.getClass().getSimpleName() + "\n";
//		}
		return result;
	}
}
