package de.nodes;

import java.util.Collections;
import java.util.List;

public class AbstractKontoNode {
	
	private String label;
	private AbstractKontoNode parent = null;
	
	public AbstractKontoNode() {
		this("no Label");
	}
	
	public AbstractKontoNode(String label) {
		this.label = label;
	}



	public List<AbstractKontoNode> getChildren() {
		return Collections.emptyList();
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public AbstractKontoNode getParent() {
		return parent;
	}

	public void setParent(AbstractKontoNode parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AbstractKontoNode [label=");
		builder.append(label);
		builder.append(", parent=");
		builder.append(parent);
		builder.append("]");
		return builder.toString();
	}

	public void print() {
		System.out.println(this);
		for (AbstractKontoNode child : getChildren()) {
			child.print();
		}
	}
	
}
