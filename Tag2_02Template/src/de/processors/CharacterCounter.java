package de.processors;

import org.w3c.dom.css.Counter;

public class CharacterCounter extends AbstractFileProcessor {
	
	private int counter = 0;

	@Override
	public void process(char c) {
		counter ++;

	}
	
	@Override
	public void close() {
		System.out.println(counter);
	}

}
