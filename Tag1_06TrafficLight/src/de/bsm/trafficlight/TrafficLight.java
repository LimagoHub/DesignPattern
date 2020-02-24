package de.bsm.trafficlight;

public class TrafficLight {
	
	protected final TrafficLightState redState = new RedState(this);
	protected final TrafficLightState greenState = new GreenState(this);
	protected TrafficLightState current = redState;
	
	public String getColor() {
		return current.getColor();
	}
	public void nextColor() {
		current.nextColor();
	}

}
