package de.bsm.firma;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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
		mitarbeiters.forEach(System.out::println);
	}
	
	public void iterate(MitarbeiterVisitor visitor) {
		
		visitor.init();
//		for (AbstractMitarbeiter mitarbeiter : mitarbeiters) {
//			//visitor.visit(mitarbeiter);
//			mitarbeiter.accept(visitor);
//		}
		mitarbeiters.forEach(m->m.accept(visitor));
		visitor.close();
	}

}
