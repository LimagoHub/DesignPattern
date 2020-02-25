package de.processors;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {
	
	private List<CharacterHandler> handlers = new ArrayList<>();
	
	
	public void addCharacterHandler(CharacterHandler handler) {
		handlers.add(handler);
	}
	
	public final void run(String filename) {
		
		try(FileReader reader = new FileReader(filename)) {
			
			init();
			int c;
			while( (c = reader.read())  != -1) {
				process((char) c);
			}
			close();
			
			
		} catch ( Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private void init() {
		handlers.forEach(h->h.init());
	}
	
	private void close() {
		handlers.forEach(h->h.close());
	}
	
	private void process(char c) {
		handlers.forEach(h->h.process(c));
	}
}
