package de.bsm.trafficlight;

public abstract class AbstractTrafficLightState implements TrafficLightState {
	
	
	private final TrafficLight trafficLight;
	
	

	public AbstractTrafficLightState(final TrafficLight trafficLight) {
		this.trafficLight = trafficLight;
	}
	
	

	public TrafficLight getTrafficLight() {
		return trafficLight;
	}



	@Override
	public String getColor() {
		throw new UnsupportedOperationException("H�h?");
	}

	@Override
	public void nextColor() {
		throw new UnsupportedOperationException("H�h?");

	}

}
