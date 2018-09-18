package com.cg;

public class Traveller {

	public static void main(String[] args) {
		Vehicle v = VehicleFactory.getInstance();
		v.move();
	}
	
}
