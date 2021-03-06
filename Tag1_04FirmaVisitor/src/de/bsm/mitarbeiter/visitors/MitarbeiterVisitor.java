package de.bsm.mitarbeiter.visitors;

import de.bsm.mitarbeiter.GehaltsEmpaenger;
import de.bsm.mitarbeiter.LohnEmpfaenger;

public interface MitarbeiterVisitor {
	public void init();
	public void close();
	public void visit(GehaltsEmpaenger gehaltsEmpaenger);
	public void visit(LohnEmpfaenger lohnEmpfaenger);

}
