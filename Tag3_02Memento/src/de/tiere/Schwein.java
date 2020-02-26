package de.tiere;

public class Schwein {
	
	
		
	private String name;
	private int gewicht;
	
	public Schwein() {
		this("nobody");
	}
	
	public Schwein(String name) {
		setName(name);
		setGewicht(10);
	}

	public String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public int getGewicht() {
		return gewicht;
	}

	private void setGewicht(int gewicht) {
		this.gewicht = gewicht;
		
	}
	
	public void fressen() {
		setGewicht(getGewicht() + 1);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Schwein [name=");
		builder.append(name);
		builder.append(", gewicht=");
		builder.append(gewicht);
		builder.append("]");
		return builder.toString();
	}
	
	public void setMemento(SchweineMemento memento) {
		MySchweineMemento myMemento = (MySchweineMemento) memento;
		name = myMemento.getName();
		gewicht = myMemento.getGewicht();
	}
	
	public SchweineMemento getMemento() {
		return new MySchweineMemento(name, gewicht);
	}
	private static class MySchweineMemento implements SchweineMemento {
		
		private final String name;
		private final int gewicht;
		
		public String getName() {
			return name;
		}

		public int getGewicht() {
			return gewicht;
		}

		public MySchweineMemento(String name, int gewicht) {
			super();
			this.name = name;
			this.gewicht = gewicht;
		}
		
		
	}
	

}
