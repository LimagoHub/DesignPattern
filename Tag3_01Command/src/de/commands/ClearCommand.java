package de.commands;

import de.math.Calculator;
import de.math.CalculatorMemento;

public class ClearCommand extends AbstractCommand{
	
	private CalculatorMemento memento;

	@Override
	public void execute() {
		memento = Calculator.getInstance().getMemento();
		Calculator.getInstance().clear();
		
	}
	
	@Override
	public void undo() {
		Calculator.getInstance().setMemento(memento);
	}
	
	@Override
	public boolean isQuery() {
		return false;
	}

}
