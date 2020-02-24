package de.main;

import de.bsm.firma.Firma;
import de.bsm.mitarbeiter.GehaltsEmpaenger;
import de.bsm.mitarbeiter.LohnEmpfaenger;
import de.bsm.mitarbeiter.visitors.PrintVisitor;
import de.bsm.mitarbeiter.visitors.ResetArbeitszeitVisitor;

public class Main {

	public static void main(String[] args) {
		Firma firma = new Firma();
		
		firma.addMitarbeiter(new LohnEmpfaenger("Mayer"));
		firma.addMitarbeiter(new LohnEmpfaenger("Muller"));
		firma.addMitarbeiter(new GehaltsEmpaenger("Hinz"));
		firma.addMitarbeiter(new GehaltsEmpaenger("Kunz"));
		firma.addMitarbeiter(new LohnEmpfaenger("Schulz"));
		firma.addMitarbeiter(new LohnEmpfaenger("Schmidt"));
		
		//firma.print();
		
		firma.iterate(new PrintVisitor());
		firma.iterate(new ResetArbeitszeitVisitor());
		firma.iterate(new PrintVisitor());

	}

}
