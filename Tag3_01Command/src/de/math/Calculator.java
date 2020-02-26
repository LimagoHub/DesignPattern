package de.math;

public class Calculator {
	
	private final static Calculator instance = new Calculator();
	private double memory = 0;
	
	private Calculator () {
		
	}

	public static Calculator getInstance() {
		return instance;
	}
	
	
	
	
	public double getMemory() {
		return memory;
	}

	public void setMemory(double memory) {
		this.memory = memory;
	}

	public void add(double value) {
		memory += value;
	}
	
	public void sub(double value) {
		memory -= value;
	}
	
	public void mult(double value) {
		memory *= value;
	}
	
	public void div(double value) {
		memory /= value;
	}
	
	public void print() {
		System.out.println(memory);
	}
	
	public void clear() {
		memory = 0;
	}
	

}
