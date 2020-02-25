package de.bsm.trafficlight;
public interface TrafficLightState {

	String getColor();
	void nextColor();
	void switchOn();
	void switchOff();
	
}
