package de.commands;

public class CommandFactory {
	
	private final static String PREFIX = "de.commands.";
	private final static String SUFFIX = "Command";
	
	public static Command create(String zeile) {
		
		try {
			String tokens [] = zeile.split(" ");
			Command retval = (Command) Class.forName(PREFIX + tokens[0] + SUFFIX).newInstance();
			retval.parse(tokens);
			
			return retval;
		} catch (Throwable e) {
			
			e.printStackTrace();
			return null;
		}
		
		
	}

}
