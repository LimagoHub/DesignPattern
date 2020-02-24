package de.state.states;

public class AbstractState implements State {
	
	private final Fassade fassade;
	
	

	public AbstractState(Fassade fassade) {
		this.fassade = fassade;
	}

	@Override
	public void drucken() {
		throw new UnsupportedOperationException("Häh??");

	}

	@Override
	public void toA() {
		throw new UnsupportedOperationException("Häh??");

	}

	@Override
	public void toB() {
		throw new UnsupportedOperationException("Häh??");
	}

	public Fassade getFassade() {
		return fassade;
	}
	
	

}
