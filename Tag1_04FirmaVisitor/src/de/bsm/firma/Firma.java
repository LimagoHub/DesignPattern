package de.bsm.firma;

import java.util.ArrayList;
import java.util.List;

import de.bsm.mitarbeiter.AbstractMitarbeiter;
import de.bsm.mitarbeiter.visitors.MitarbeiterVisitor;

public class Firma {
	
	private List<AbstractMitarbeiter> mitarbeiters = new ArrayList<AbstractMitarbeiter>();

	public boolean addMitarbeiter(AbstractMitarbeiter e) {
		return mitarbeiters.add(e);
	}

	public boolean removeMitarbeiter(Object o) {
		return mitarbeiters.remove(o);
	}
	
	public void print() {
		for (AbstractMitarbeiter mitarbeiter : mitarbeiters) {
			System.out.println(mitarbeiter);
		}
	}
	
	public void iterate(MitarbeiterVisitor visitor) {
		for (AbstractMitarbeiter mitarbeiter : mitarbeiters) {
			//visitor.visit(mitarbeiter);
			mitarbeiter.accept(visitor);
		}
	}

}
