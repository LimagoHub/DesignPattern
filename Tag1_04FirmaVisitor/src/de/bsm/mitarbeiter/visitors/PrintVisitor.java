package de.bsm.mitarbeiter.visitors;

import de.bsm.mitarbeiter.GehaltsEmpaenger;
import de.bsm.mitarbeiter.LohnEmpfaenger;

public class PrintVisitor extends AbstractMitarbeiterVisitor {

	@Override
	public void visit(GehaltsEmpaenger gehaltsEmpaenger) {
		System.out.println(gehaltsEmpaenger);

	}

	@Override
	public void visit(LohnEmpfaenger lohnEmpfaenger) {
		System.out.println(lohnEmpfaenger);

	}

}
