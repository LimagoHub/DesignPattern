package de.nodes;

import java.util.Collections;
import java.util.List;

public class AbstractNode {
	
	private String label;
	private AbstractNode parent = null;
	
	public AbstractNode() {
		this("no Label");
	}
	
	public AbstractNode(String label) {
		this.label = label;
	}



	public List<AbstractNode> getChildren() {
		return Collections.emptyList();
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public AbstractNode getParent() {
		return parent;
	}

	public void setParent(AbstractNode parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AbstractNode [label=");
		builder.append(label);
		builder.append(", parent=");
		builder.append(parent);
		builder.append("]");
		return builder.toString();
	}

	
	
}
