package de.nodes.visitors;

import de.nodes.Konto;
import de.nodes.KontoGruppe;

public class AbstractKontenVisitor implements KontenVisitor{

	@Override
	public void init() {
		// ok
		
	}

	@Override
	public void visit(KontoGruppe kontoGruppe) {
		// ok
		
	}

	@Override
	public void visit(Konto konto) {
		// ok
		
	}

	@Override
	public void close() {
		// ok
		
	}

}
