package de.beans;

import java.util.Comparator;
import java.util.TreeSet;

import de.tiere.Schwein;

public class Main {

	public static void main(String[] args) {

		Person p = Person
		.builder()
		.anrede("Herr")
		.vorname("John")
		.build();
		
		System.out.println(p);
		
		
		
		Comparator<Schwein> c = Comparator.nullsFirst(Comparator.naturalOrder());
		c = c.thenComparing(Comparator.comparingInt(Schwein::getGewicht));
		
		
		TreeSet<Schwein> schweine = new TreeSet<>(c);
		schweine.add(new Schwein("Piggy"));
		schweine.add(new Schwein("Babe"));
		schweine.add(null);

	}

}
