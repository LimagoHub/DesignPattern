package de.bsm.mitarbeiter.visitors;

import de.bsm.mitarbeiter.LohnEmpfaenger;

public class ResetArbeitszeitVisitor extends AbstractMitarbeiterVisitor {

	@Override
	public void visit(LohnEmpfaenger lohnEmpfaenger) {
		lohnEmpfaenger.setArbeitszeit(0);
	}
	
	

}
