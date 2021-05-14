package de.hs_lu.o2s.tut6.uebung;

import java.util.ArrayList;

public class Yachtkatalog extends ArrayList {

	public boolean add(Object objectToAdd) {
		if (objectToAdd instanceof Boot && !bootAlreadyExists(((Boot) objectToAdd)))
			return super.add(objectToAdd);
		return false;
	}

	public String toString() {
		String result = "";
		if (this.getTeuerstesBoot() != null)
			result += "Unsere premium Yacht: " + this.getTeuerstesBoot() + "\n";
		for (Object currentObject : this) {
			if (currentObject instanceof Segelboot) {
				Segelboot currentSegelboot = (Segelboot) currentObject;
				result += currentSegelboot.getClass().getSimpleName() + ": " + currentSegelboot;
				if (currentSegelboot.hasRettungsboot())
					result += ", inkl. " + currentSegelboot.getRettungsboot().getClass().getSimpleName() + ": "
							+ currentSegelboot.getRettungsboot() + "\n";
				else
					result += "\n";
			}
		}
		for (Object currentObject : this) {
			if (currentObject instanceof Rettungsboot) {
				Rettungsboot currentRettungsboot = (Rettungsboot) currentObject;
				result += currentRettungsboot.getClass().getSimpleName() + ": " + currentRettungsboot + "\n";
			}
		}
		return result;
	}

	private Boot getTeuerstesBoot() {
		Boot teuerstesBoot = null;
		for (Object currentObject : this) {
			if (currentObject instanceof Boot) {
				Boot currentBoot = (Boot) currentObject;
				if (teuerstesBoot == null)
					teuerstesBoot = currentBoot;
				else {
					if (currentBoot.getPreis() > teuerstesBoot.getPreis())
						teuerstesBoot = currentBoot;
				}
			}
		}
		return teuerstesBoot;
	}

	private boolean bootAlreadyExists(Boot bootToCheck) {
		for (Object currentObject : this) {
			if (currentObject instanceof Boot) {
				Boot currentBoot = (Boot) currentObject;
				boolean hasSameName = currentBoot.getName() == bootToCheck.getName();
				boolean hasSamePrice = currentBoot.getPreis() == bootToCheck.getPreis();
				if (hasSameName && hasSamePrice)
					return true;
			}
		}
		return false;
	}
}
