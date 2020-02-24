package de.state.states;

public class StateB extends AbstractState {

	public StateB(Fassade fassade) {
		super(fassade);
		
	}

	@Override
	public void toA() {
		getFassade().current = getFassade().stateA;
	}
	
	@Override
	public void drucken() {
		System.out.println("Hier druckt B!");
	}

}
