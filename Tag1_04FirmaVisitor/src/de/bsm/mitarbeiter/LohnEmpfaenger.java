package de.bsm.mitarbeiter;

import de.bsm.mitarbeiter.visitors.MitarbeiterVisitor;

public class LohnEmpfaenger extends AbstractMitarbeiter {
	
	private double stundenlohn=10, arbeitszeit=40;

	public double getStundenlohn() {
		return stundenlohn;
	}

	public void setStundenlohn(double stundenlohn) {
		this.stundenlohn = stundenlohn;
	}

	public double getArbeitszeit() {
		return arbeitszeit;
	}

	public void setArbeitszeit(double arbeitszeit) {
		this.arbeitszeit = arbeitszeit;
	}

	public LohnEmpfaenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LohnEmpfaenger(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LohnEmpfaenger [stundenlohn=");
		builder.append(stundenlohn);
		builder.append(", arbeitszeit=");
		builder.append(arbeitszeit);
		builder.append(", Name=");
		builder.append(getName());
		builder.append("]");
		return builder.toString();
	}

	
	
	@Override
	public void accept(MitarbeiterVisitor visitor) {
		visitor.visit(this);
		
	}
	


}
