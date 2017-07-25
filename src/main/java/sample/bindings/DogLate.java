package com.sample.bindings;

class Animal {
	void eat() {
		System.out.println("animal is eating...");
	}
}

class DogLate extends Animal {
	void eat() {
		System.out.println("dog is eating...");
	}

	public static void main(String args[]) {
		Animal a = new DogLate();
		a.eat();
	}
}