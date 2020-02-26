package de.nodes.visitors;

import de.nodes.Konto;
import de.nodes.KontoGruppe;

public interface KontenVisitor {

	void init();
	void visit(KontoGruppe kontoGruppe);
	void visit(Konto konto);
	void close();
	
}
