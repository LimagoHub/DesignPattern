package de.main;

import de.processors.FileProcessor;
import de.processors.CharacterCounter;
import de.processors.LineCounter;

public class Main {

	public static void main(String[] args) {
		FileProcessor processor = new FileProcessor();
		
		processor.addCharacterHandler(new CharacterCounter());
		processor.addCharacterHandler(new LineCounter());
		
		processor.run("latein.txt");

	}

}
