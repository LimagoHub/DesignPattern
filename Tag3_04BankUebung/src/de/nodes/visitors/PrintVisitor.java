package de.nodes.visitors;

import de.nodes.Konto;
import de.nodes.KontoGruppe;

public class PrintVisitor extends AbstractKontenVisitor {
	
	@Override
	public void visit(Konto konto) {
		System.out.println(konto);
	}

	@Override
	public void visit(KontoGruppe kontoGruppe) {
		System.out.println(kontoGruppe);
	}
}
