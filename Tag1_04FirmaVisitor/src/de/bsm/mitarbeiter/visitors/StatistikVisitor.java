package de.bsm.mitarbeiter.visitors;

import de.bsm.mitarbeiter.GehaltsEmpaenger;
import de.bsm.mitarbeiter.LohnEmpfaenger;

public class StatistikVisitor implements MitarbeiterVisitor {
	
	private int gehaltsEmpaengerZaehler = 0;
	private int lohnEmpfaengerZaehler = 0;
	

	@Override
	public void visit(GehaltsEmpaenger gehaltsEmpaenger) {
		gehaltsEmpaengerZaehler ++;

	}

	@Override
	public void visit(LohnEmpfaenger lohnEmpfaenger) {
		lohnEmpfaengerZaehler ++;

	}

	public int getGehaltsEmpaengerZaehler() {
		return gehaltsEmpaengerZaehler;
	}

	public int getLohnEmpfaengerZaehler() {
		return lohnEmpfaengerZaehler;
	}
	
	
	
	public int getGesamt() {
		return lohnEmpfaengerZaehler + gehaltsEmpaengerZaehler;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StatistikVisitor [gehaltsEmpaengerZaehler=");
		builder.append(gehaltsEmpaengerZaehler);
		builder.append(", lohnEmpfaengerZaehler=");
		builder.append(lohnEmpfaengerZaehler);
		builder.append(", gesamtZaehler=");
		builder.append(getGesamt());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void init() {
		gehaltsEmpaengerZaehler = lohnEmpfaengerZaehler = 0;
		
	}

	@Override
	public void close() {
		System.out.println(this);
		
	}

	
	

}
