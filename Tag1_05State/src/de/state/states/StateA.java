package de.state.states;

public class StateA extends AbstractState {
	
	

	public StateA(Fassade fassade) {
		super(fassade);
		
	}

	@Override
	public void drucken() {
		System.out.println("Hier druckt A");
	}

	@Override
	public void toB() {
		getFassade().current = getFassade().stateB;
		
	}
	
	

}
