package de.nodes;

public class Leaf extends AbstractNode {

	public Leaf() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Leaf(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Leaf [Label=");
		builder.append(getLabel());
		builder.append("]");
		return builder.toString();
	}

	
	
}
