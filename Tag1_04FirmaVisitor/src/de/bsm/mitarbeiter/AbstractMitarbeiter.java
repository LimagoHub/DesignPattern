package de.bsm.mitarbeiter;

import de.bsm.mitarbeiter.visitors.MitarbeiterVisitor;

public abstract class AbstractMitarbeiter {
	
	private String name;
	
	public AbstractMitarbeiter() {
		name = "Mueller";
	}

	public AbstractMitarbeiter(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "AbstractMitarbeiter [name=" + name + "]";
	}
	
	public abstract void accept(MitarbeiterVisitor visitor);
	

}
