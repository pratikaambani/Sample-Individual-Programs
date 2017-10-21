package com.sample.bindings;


public class DogEarly {

	private void eat() {
		System.out.println("dog is eating...");
	}

	public static void main(String args[]) {
		DogEarly d1 = new DogEarly();
		d1.eat();
	 }
}
