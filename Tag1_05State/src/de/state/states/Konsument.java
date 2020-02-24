package de.state.states;

public class Konsument {

	public static void main(String[] args) {
		Fassade fassade = new Fassade();
		
		fassade.drucken();
		fassade.toB();
		fassade.drucken();
		fassade.toB();

	}

}
