package de.nodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import de.nodes.visitors.KontenVisitor;

public abstract class AbstractKontoNode {
	
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
		iterator().forEachRemaining(System.out::println);
	}
	
	public Iterator<AbstractKontoNode> iterator() {
		final List<AbstractKontoNode> liste = new ArrayList<>();
		fillListRecursiv(liste);
		return liste.iterator();
	}
	
	public void iterate(KontenVisitor visitor) {
		visitor.init();
		iterator().forEachRemaining(n->n.accept(visitor));
		visitor.close();
	}
	
	public abstract void accept(KontenVisitor visitor);
	
	private void fillListRecursiv(List<AbstractKontoNode> list) {
		list.add(this);
		for (AbstractKontoNode child : getChildren()) {
			child.fillListRecursiv(list);
		}
	}
	
}
