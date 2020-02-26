package de.nodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Node extends AbstractNode {
	
	private List<AbstractNode> children = new ArrayList<>();
	
	@Override
	public List<AbstractNode> getChildren() {
		
		return Collections.unmodifiableList(children);
	}
	
	public void append(AbstractNode child) {
		child.setParent(this);
		children.add(child);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Node [Label=");
		builder.append(getLabel());
		builder.append("]");
		return builder.toString();
	}

	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Node(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}
	
	

}
