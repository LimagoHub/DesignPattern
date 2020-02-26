package de.main;

import de.nodes.AbstractKontoNode;
import de.nodes.Konto;
import de.nodes.KontoGruppe;

public class Main {

	public static void main(String[] args) {
		KontoGruppe root = new KontoGruppe("root");
		
		KontoGruppe e1 = new KontoGruppe("e1");
		root.append(e1);
		
		
		KontoGruppe e2 = new KontoGruppe("e2");
		root.append(e2);
		
		KontoGruppe e1_1 = new KontoGruppe("e1_1");
		e1.append(e1_1);
		
		Konto leaf = new Konto("e2_1");
		e2.append(leaf);
		
		root.print();

	}
	
	

}
