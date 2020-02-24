package de.state.states;

public class AbstractState implements State {
	
	private final Fassade fassade;
	
	

	public AbstractState(Fassade fassade) {
		this.fassade = fassade;
	}

	@Override
	public void drucken() {
		throw new UnsupportedOperationException("H�h??");

	}

	@Override
	public void toA() {
		throw new UnsupportedOperationException("H�h??");

	}

	@Override
	public void toB() {
		throw new UnsupportedOperationException("H�h??");
	}

	public Fassade getFassade() {
		return fassade;
	}
	
	

}
