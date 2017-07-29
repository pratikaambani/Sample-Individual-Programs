package com.sample.bindings;

public class LateOrDynamicBinding {

	public static void main(String[] args) {
		// Vehicle v = new Vehicle();
		Vehicle v = new Car();
		v.start();
	}
}

class Vehicle {

	public void start() {
		System.out.println("Inside Vehcle class");
	}
}

class Car extends Vehicle {

	public void start() {
		System.out.println("Inside Car class");
	}
}
