package de.nodes;

import de.nodes.visitors.KontenVisitor;

public class Konto extends AbstractKontoNode {
	
	private double saldo = 0;

	public Konto() {
		super();
		
	}

	public Konto(String label) {
		super(label);
		
	}
	

	public Konto(String label, double saldo) {
		super(label);
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Konto [saldo=");
		builder.append(saldo);
		builder.append(", Label=");
		builder.append(getLabel());
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	public void accept(KontenVisitor visitor) {
		visitor.visit(this);
	}

	

	
	
}
