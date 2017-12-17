package com.sample.practise.oopsconcepts.overloading;


class Overloading3 {
	int sum(int a, int b) {
		return a + b;
	}

	double sum1(int a, int b) {
		return a + b;
	}

	public static void main(String args[]) {
		Overloading3 obj = new Overloading3();
// Compile Time Error
//		int result = (int) obj.sum1(200000000000000000000, 20);
		int result = (int) obj.sum1(20, 20); // Compile Time Error

		System.out.println("Result = " + result);

	}
}