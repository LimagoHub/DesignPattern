package main;

import java.util.Scanner;

import de.commands.Command;
import de.commands.CommandFactory;
import de.history.CommandHistory;

public class Main {

	public static void main(String[] args) {
		
		final Scanner  scanner = new Scanner(System.in);
		final CommandHistory history = new CommandHistory();
		
		while(true) {
			System.out.print("#>");
			final String zeile = scanner.nextLine();
			if("ende".equalsIgnoreCase(zeile)) break;
			if("undo".equals(zeile)) {
				history.undo();
				continue;
			}
			if("redo".equals(zeile)) {
				history.redo();
				continue;
			}
			
			final Command command = CommandFactory.create(zeile);
			if (command == null)
				continue;
			
			command.execute();
			
			if(! command.isQuery())
				history.add(command);
			
		}

	}

}
