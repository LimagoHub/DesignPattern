package de.bsm.mitarbeiter;

import de.bsm.mitarbeiter.visitors.MitarbeiterVisitor;

public class GehaltsEmpaenger extends AbstractMitarbeiter {
	
	private double gehalt=1000;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GehaltsEmpaenger [gehalt=");
		builder.append(gehalt);
		builder.append(", Name=");
		builder.append(getName());
		builder.append("]");
		return builder.toString();
	}

	public GehaltsEmpaenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GehaltsEmpaenger(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public double getGehalt() {
		return gehalt;
	}

	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}

	@Override
	public void accept(MitarbeiterVisitor visitor) {
		visitor.visit(this);
		
	}
	
	

}
