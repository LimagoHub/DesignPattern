package de.application;

import de.client.CalculatorClient;
import de.math.Calculator;
import de.math.CalculatorFactory;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = CalculatorFactory.createInstance();
		
		CalculatorClient client = new CalculatorClient(calculator);
		client.run();

	}

}
