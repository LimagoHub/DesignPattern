package de.math;

public class Calculator {
	
	private final static Calculator instance = new Calculator();
	private double memory = 0;
	
	
	private Calculator () {
		
	}

	public static Calculator getInstance() {
		return instance;
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

	public CalculatorMemento getMemento() {
		return new MyCalculatorMemento(memory);
	}

	public void setMemento(CalculatorMemento memento) {
		MyCalculatorMemento myMemento = (MyCalculatorMemento) memento;
		memory = myMemento.getMemory();
	}
	
	private static class MyCalculatorMemento implements CalculatorMemento {
		private final double memory;

		public MyCalculatorMemento(double memory) {
			this.memory = memory;
		}

		public double getMemory() {
			return memory;
		}
		
		
	}

}
