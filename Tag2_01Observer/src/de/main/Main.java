package de.main;

import de.tiere.Schwein;
import de.tiere.events.PigTooFatListener;

public class Main {
	
	private Metzger metzger = new Metzger();
	private Spediteur spediteur = new Spediteur();
	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Schwein piggy = new Schwein("Miss Piggy");
		piggy.addPigTooFatListener(new SchweineMetzgerAdapter());
		piggy.addPigTooFatListener(spediteur::fahren);
		
		piggy.addPropertyChangeListener(System.out::println);

		for (int i = 0; i < 10; i++) {
			piggy.fressen();
		}
		
		piggy.fressen();
		
	}
	
	class SchweineMetzgerAdapter implements PigTooFatListener{

		@Override
		public void pigTooFat(Schwein fettesSchwein) {
			metzger.schlachten(fettesSchwein);
			
		}
		
	}

}

class Spediteur {
	public void fahren(Object ware) {
		System.out.println("Wir fahren auf er Autobahn...");
	}
}

class Metzger  {

	
	public void schlachten(Object tier) {
		System.out.println("Messer wetz!");
		
	}
	
}
