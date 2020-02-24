package de.bsm.mitarbeiter.visitors;

import de.bsm.mitarbeiter.GehaltsEmpaenger;
import de.bsm.mitarbeiter.LohnEmpfaenger;

public abstract class AbstractMitarbeiterVisitor implements MitarbeiterVisitor {

	@Override
	public void visit(GehaltsEmpaenger gehaltsEmpaenger) {
		// ok

	}

	@Override
	public void visit(LohnEmpfaenger lohnEmpfaenger) {
		// ok

	}

	@Override
	public void init() {
		// ok
		
	}

	@Override
	public void close() {
		// ok
		
	}
	
	

}
