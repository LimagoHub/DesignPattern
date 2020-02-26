package de.beans;

public class Person {
	
	private String id=null;
	private String anrede="Frau";
	private String vorname="Jane";
	private String nachname="Doe";
	private String ort = "Frankfurt";
	
	public Person() {
		
	}

	public String getId() {
		return id;
	}

	

	public void setId(String id) {
		this.id = id;
	}

	public String getAnrede() {
		return anrede;
	}

	public void setAnrede(String anrede) {
		this.anrede = anrede;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [id=");
		builder.append(id);
		builder.append(", anrede=");
		builder.append(anrede);
		builder.append(", vorname=");
		builder.append(vorname);
		builder.append(", nachname=");
		builder.append(nachname);
		builder.append(", ort=");
		builder.append(ort);
		builder.append("]");
		return builder.toString();
	}
	
	public static PersonBuilder builder() {
		return new PersonBuilder();
	}
	
	public static class  PersonBuilder {
		private Person person = new Person();
		
		public PersonBuilder id(String id) {
			person.setId(id);
			return this;
		}
		public PersonBuilder anrede(String anrede) {
			person.setAnrede(anrede);
			return this;
		}
		public PersonBuilder vorname(String vorname) {
			person.setVorname(vorname);
			return this;
		}
//		private String nachname="Doe";
//		private String ort = "Frankfurt";

		public Person build() {
			// Validieren
			return person;
		}
	}

}
