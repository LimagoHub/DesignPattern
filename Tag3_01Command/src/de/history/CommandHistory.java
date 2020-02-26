package de.history;

import java.util.ArrayDeque;
import java.util.Deque;
 
import de.commands.Command; 

public class CommandHistory {
	
	private Deque<Command> undoQueue = new ArrayDeque<>();
	private Deque<Command> redoQueue = new ArrayDeque<>();
	
	public void add(Command command) {
		if(command.isQuery()) return;
		undoQueue.push(command);
		redoQueue.clear();
	}
	
	public void undo() {
		if(undoQueue.isEmpty()) {
			System.out.println("can't undo");
		}
		else {
			Command command = undoQueue.pop();
			command.undo();
			redoQueue.push(command);
		}
	}

	public void redo() {
		if(redoQueue.isEmpty()) {
			System.out.println("can't redo");
		}
		else {
			Command command = redoQueue.pop();
			command.execute();
			undoQueue.push(command);
		}
	}

}
