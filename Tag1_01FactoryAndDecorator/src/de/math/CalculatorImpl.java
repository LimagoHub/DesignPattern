package de.math;

public class CalculatorImpl implements Calculator {
	
	protected CalculatorImpl() {
	
	}
	
	
	@Override
	public double add(double a, double b) {
		
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a + b;
	}

	@Override
	public double sub(double a, double b) {
		return a - b ;
	}

}
