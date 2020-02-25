package de.events;

public class PropertyChangeEvent {
	
	private final Object source;
	private final String propertyName;
	private final Object oldValue;
	private final Object newValue;
	
	
	public PropertyChangeEvent(Object source, String propertyName, Object oldValue, Object newValue) {
		this.source = source;
		this.propertyName = propertyName;
		this.oldValue = oldValue;
		this.newValue = newValue;
	}


	public Object getSource() {
		return source;
	}


	public String getPropertyName() {
		return propertyName;
	}


	public Object getOldValue() {
		return oldValue;
	}


	public Object getNewValue() {
		return newValue;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PropertyChangeEvent [source=");
		builder.append(source);
		builder.append(", propertyName=");
		builder.append(propertyName);
		builder.append(", oldValue=");
		builder.append(oldValue);
		builder.append(", newValue=");
		builder.append(newValue);
		builder.append("]");
		return builder.toString();
	}
	
	

}
