package de.math;

import java.time.Duration;
import java.time.Instant;

public class CalculatorBenchmark implements Calculator{
	
	private final Calculator calculator;

	public CalculatorBenchmark(Calculator calculator) {
		this.calculator = calculator;
	}

	public double add(double a, double b) {
		Instant start = Instant.now();
		double retval =  calculator.add(a, b);
		Instant ende = Instant.now();
		
		Duration duration = Duration.between(start, ende);
		System.out.println("Duration = " + duration.toMillis());
		
		return retval;
	}

	public double sub(double a, double b) {
		return calculator.sub(a, b);
	}
	
	

}
