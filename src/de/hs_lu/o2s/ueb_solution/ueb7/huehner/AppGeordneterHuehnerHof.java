package de.hs_lu.o2s.ueb_solution.ueb7.huehner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;

public class AppGeordneterHuehnerHof {

	public static void main(String[] args) throws ParseException {
		
		HuehnerHof hof = new HuehnerHof();
		
		Henne h1 = new Henne("Berta", new Ei("weiss", 54.0), new SimpleDateFormat("yyyy-MM-dd").parse("2018-01-01"));
		Henne h2 = new Henne("Erna", new Ei("weiss", 54.0), new SimpleDateFormat("yyyy-MM-dd").parse("2017-01-01"));
		Henne h3 = new Henne("Emma", new SimpleDateFormat("yyyy-MM-dd").parse("2016-01-01"));
						
		hof.add(h1);
		hof.add(h2);
		hof.add(h3);
		
		hof.add(new Ei("braun", 55.0));
		hof.add(new Ei("braun", 56.0));
		hof.add(new Ei("braun", 57.0));
		
		System.out.println("Hof");
		System.out.println(hof);
		System.out.println();
		
		GeordneterHuehnerHof geordneterHof = new GeordneterHuehnerHof(hof);
		System.out.println("Geordneter Hof");
		System.out.println(geordneterHof);
				
		
	}

}
