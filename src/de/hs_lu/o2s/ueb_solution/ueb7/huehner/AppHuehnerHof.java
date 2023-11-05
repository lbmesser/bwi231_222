package de.hs_lu.o2s.ueb_solution.ueb7.huehner;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AppHuehnerHof {

	public static void main(String[] args) throws ParseException {
		
		HuehnerHof hof = new HuehnerHof();
		
		Ei ei1 = new Ei("braun", 52.0);
		Ei ei2 = new Ei("weiss", 54.0);
		
		Henne h1 = new Henne("Berta", ei2, new SimpleDateFormat("yyyy-MM-dd").parse("2018-01-01"));
		Henne h2 = new Henne("Erna", new SimpleDateFormat("yyyy-MM-dd").parse("2017-01-01"));
		Henne h3 = new Henne("Emma", new SimpleDateFormat("yyyy-MM-dd").parse("2016-01-01"));
		
		System.out.println("Fuege ei1 hinzu.");
		hof.add(ei1);
		
		System.out.println("Fuege henne1 hinzu. Das ihr zugeordnete ei2 sollte automatisch in den Huehnerhof eingefuegt werden");
		hof.add(h1);
		if(hof.contains(ei2)) System.out.println("Korrekt, ei2 wurde hinzugefuegt.");
		else System.out.println("Falsch, ei2 nicht hinzugefuegt - Aufgabenteil d) bearbeiten!");
		
		System.out.println("Fuege Hennen h2 und h3 sowie das Ei ei1 hinzu.");
		hof.add(h2);
		hof.add(h3);
		hof.add(ei1);
		
		System.out.println();
		System.out.println("Alle Hennen und Eier auf dem Hof:");
		System.out.println(hof);
		
		System.out.println("Versuche Emma (2016-01-01) noch einmal hinzuzufuegen...");
		if (hof.add(new Henne("Emma", new SimpleDateFormat("yyyy-MM-dd").parse("2016-01-01")))) System.out.println("Fehler in HuehnerHof. Emma (2016-01-01) ist schon vorhanden und darf nicht noch einmal eingefuegt werden! Aufgabenteil c) bearbeiten!");
		else System.out.println("HuehnerHof korrekt: konnte Emma nicht noch einmal zum Huehnerhof hinzufuegen");
		
		System.out.println("Versuche Emma (2016-10-31) hinzuzufuegen...");
		if (hof.add(new Henne("Emma", new SimpleDateFormat("yyyy-MM-dd").parse("2016-10-31")))) System.out.println("HuehnerHof korrekt: konnte Emma mit einem anderen Geburtsdatum hinzufuegen");
		else System.out.println("Fehler in HuehnerHof. Emma (2016-10-31) konnte nicht hinzugefuegt werden, obwohl diese Kombination aus Name/Geburtsdatum noch nicht auftaucht! Aufgabenteil c) bearbeiten!");
		
		
		System.out.println();
		System.out.println("Alle Hennen und Eier auf dem Hof:");
		System.out.println(hof);
	}

}
