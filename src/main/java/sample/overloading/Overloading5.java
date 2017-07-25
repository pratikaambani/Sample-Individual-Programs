package com.sample.overloading;

class Calculation {
	void sum(int a, long b) {
		System.out.println("a method invoked");
	}

	void sum(long a, int b) {
		System.out.println("b method invoked");
	}

	public static void main(String args[]) {
		Calculation obj = new Calculation();
		obj.sum(20, 20);// now ambiguity
	}
}

// type proportion compile time error