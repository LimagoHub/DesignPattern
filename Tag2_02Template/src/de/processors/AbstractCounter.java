package de.processors;

public abstract class AbstractCounter implements CharacterHandler {

	private int counter = 0;
	
	public int getCounter() {
		return counter;
	}



	
	protected void incrementCounter() {
		counter ++;
	}

	@Override
	public void init() {
		counter = 0;

	}

	

	@Override
	public void close() {
		System.out.println(this.getClass().getSimpleName() + " " + counter);

	}

}
