package com.cg;

import org.springframework.beans.factory.annotation.Required;

public class Car implements Vehicle {

	Car() {

	}

	private Wheel wheel;
	private String type;

	@Override
	public String toString() {
		return "Car [wheel=" + wheel + ", type=" + type + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void move() {
		wheel.rotate();
		System.out.println("Car is moving");
	}

	public Car(Wheel wheel) {
		super();
		this.wheel = wheel;
	}

	public void init() {
		System.out.println("Car init");
	}

	public void destroy() {
		System.out.println("Car destroy");
	}

	public Wheel getWheel() {
		return wheel;
	}

	@Required
	public void setWheel(Wheel wheel) {
		System.out.println("Setting wheel");
		this.wheel = wheel;
	}

}
