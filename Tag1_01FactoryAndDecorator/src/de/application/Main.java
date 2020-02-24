package de.application;

import de.math.Calculator;
import de.math.CalculatorFactory;

public class Main {

	public static void main(String[] args) {
		Calculator calculator  = CalculatorFactory.createInstance();
		System.out.println(calculator.add(3, 4));

	}

}
