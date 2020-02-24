package flyweight;

import java.util.ArrayList;
import java.util.List;

public class AttributedCharacter {
	
	private static final List<AttributedCharacter> characters = new ArrayList<>();
	
	private final char c;
	private final boolean bold;
	
	private AttributedCharacter(final char c, final boolean bold) {
		this.c = c;
		this.bold = bold;
		characters.add(this);
	}
	
	public static AttributedCharacter getInstance(final char c, final boolean bold) {
		for (AttributedCharacter character : characters) {
			if(character.bold == bold && character.c == c)
				return character;
		}
		return new AttributedCharacter(c, bold);
	}

	public char getC() {
		return c;
	}

	public boolean isBold() {
		return bold;
	}
	

}
