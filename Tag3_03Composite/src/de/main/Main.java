package de.main;

import de.nodes.AbstractNode;
import de.nodes.Leaf;
import de.nodes.Node;

public class Main {

	public static void main(String[] args) {
		Node root = new Node("root");
		
		Node e1 = new Node("e1");
		root.append(e1);
		
		
		Node e2 = new Node("e2");
		root.append(e2);
		
		Node e1_1 = new Node("e1_1");
		e1.append(e1_1);
		
		Leaf leaf = new Leaf("e2_1");
		e2.append(leaf);
		
		travers(root);

	}
	
	public static void travers(AbstractNode node) {
		System.out.println(node);
		for (AbstractNode child : node.getChildren()) {
			travers(child);
		}
	}
	

}
