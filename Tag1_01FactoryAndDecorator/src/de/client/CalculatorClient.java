package de.client;

import de.math.Calculator;

public class CalculatorClient {
	
	private final Calculator calculator;
	
	
	
	public CalculatorClient(final Calculator calculator) {
		this.calculator = calculator;
	}



	public void run() {
		
		System.out.println(calculator.add(3, 4));
	}

}
