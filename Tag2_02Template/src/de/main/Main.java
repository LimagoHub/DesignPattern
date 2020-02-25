package de.main;

import de.processors.AbstractFileProcessor;
import de.processors.CharacterCounter;
import de.processors.LineCounter;

public class Main {

	public static void main(String[] args) {
		AbstractFileProcessor processor = new LineCounter();
		
		processor.run("latein.txt");

	}

}
