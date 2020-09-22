package com.in28minutes.microservices.limitservices.bean;

public class LimitsConfiguration {
private int minimum;
private int maximum;


public LimitsConfiguration() {
	super();
}

public LimitsConfiguration(int minimum, int maximum) {
	super();
	this.minimum = minimum;
	this.maximum = maximum;
}

public int getMinimum() {
	return minimum;
}

public int getMaximum() {
	return maximum;
}

}
