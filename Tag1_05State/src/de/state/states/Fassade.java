package de.state.states;

public class Fassade {
	
	protected final State stateA = new StateA(this);
	protected final State stateB = new StateB(this);
	
	protected State current = stateA;

	public void drucken() {
		current.drucken();
	}

	public void toA() {
		current.toA();
	}

	public void toB() {
		current.toB();
	}
	
	

}
