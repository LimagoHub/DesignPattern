package de.bsm.trafficlight;

public class AbstractTrafficLightColorState extends AbstractTrafficLightState {

	public AbstractTrafficLightColorState(TrafficLight trafficLight) {
		super(trafficLight);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void switchOff() {
		getTrafficLight().current = getTrafficLight().offState;
	}

}
