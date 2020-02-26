package de.commands;

import de.math.Calculator;

public class ClearCommand extends AbstractCommand{
	
	private double value;

	@Override
	public void execute() {
		value = Calculator.getInstance().getMemory();
		Calculator.getInstance().clear();
		
	}
	
	@Override
	public void undo() {
		Calculator.getInstance().setMemory(value);
	}
	
	@Override
	public boolean isQuery() {
		return false;
	}

}
