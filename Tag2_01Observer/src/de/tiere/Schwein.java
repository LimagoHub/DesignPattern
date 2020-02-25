package de.tiere;

import java.util.ArrayList;
import java.util.List;

import de.events.PropertyChangeEvent;
import de.events.PropertyChangeListener;
import de.tiere.events.PigTooFatListener;

public class Schwein {
	
	
	private List<PigTooFatListener> pigTooFatListeners = new ArrayList<>();
	private List<PropertyChangeListener> propertyChangeListeners = new ArrayList<>();
	
	public void addPigTooFatListener(PigTooFatListener listener) {
		pigTooFatListeners.add(listener);
	}
	
	public void removePigTooFatListener(PigTooFatListener listener) {
		pigTooFatListeners.remove(listener);
	}
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeListeners.add(listener);
	}
	
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeListeners.remove(listener);
	}
	
	
	private void firePigTooFatEvent() {
		pigTooFatListeners.forEach(listener->listener.pigTooFat(this));
	}
	
	private void firePropertyChangedEvent(String propertyName, Object oldValue, Object newValue) {
		firePropertyChangedEvent(new PropertyChangeEvent(this, propertyName, oldValue, newValue));
	}
	
	private void firePropertyChangedEvent(PropertyChangeEvent event) {
		propertyChangeListeners.forEach(p->p.propertyChanged(event));
	}
	
	
	
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
		firePropertyChangedEvent("name", this.name, this.name = name);
	}

	public int getGewicht() {
		return gewicht;
	}

	private void setGewicht(int gewicht) {
		firePropertyChangedEvent("gewicht", this.gewicht, this.gewicht = gewicht);
		if(this.gewicht > 20) firePigTooFatEvent(); 
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
	
	
	

}
