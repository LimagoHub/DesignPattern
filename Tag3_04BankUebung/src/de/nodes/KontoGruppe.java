package de.nodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KontoGruppe extends AbstractKontoNode {
	
	private List<AbstractKontoNode> children = new ArrayList<>();
	
	@Override
	public List<AbstractKontoNode> getChildren() {
		
		return Collections.unmodifiableList(children);
	}
	
	public void append(AbstractKontoNode child) {
		child.setParent(this);
		children.add(child);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("KontoGruppe [Label=");
		builder.append(getLabel());
		builder.append("]");
		return builder.toString();
	}

	public KontoGruppe() {
		super();
		
	}

	public KontoGruppe(String label) {
		super(label);
		
	}
	
	

}
