package com.sample.practise.oopsconcepts.overloading;

class Overloading5 {
	void sum(int a, long b) {
		System.out.println("a method invoked");
	}

	void sum(long a, int b) {
		System.out.println("b method invoked");
	}

	public static void main(String args[]) {
		Overloading5 obj = new Overloading5();
		System.out.println("uncomment below line");
//		obj.sum(20, 20);// now ambiguity
	}
}

// type proportion compile time error