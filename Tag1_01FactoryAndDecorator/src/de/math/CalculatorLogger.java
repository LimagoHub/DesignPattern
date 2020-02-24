package de.math;

public class CalculatorLogger implements Calculator {

	
	private final Calculator calculator;

	protected CalculatorLogger(final Calculator calculator) {
		this.calculator = calculator;
	}

	public double add(double a, double b) {
		System.out.println("Add wurde gerufen");
		return calculator.add(a, b);
	}

	public double sub(double a, double b) {
		return calculator.sub(a, b);
	}
	
	
	
	
	
}
