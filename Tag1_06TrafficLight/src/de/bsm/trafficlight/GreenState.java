package de.bsm.trafficlight;

public class GreenState extends AbstractTrafficLightColorState {

	public GreenState(TrafficLight trafficLight) {
		super(trafficLight);
		
	}

	@Override
	public String getColor() {
		return "Green";
	}

	@Override
	public void nextColor() {
		getTrafficLight().current = getTrafficLight().redState;
	}
	
	

}
