package com.sample.overloading;

class Overloading1 {
	void sum(int a, int b) {
		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String args[]) {
		Overloading1 obj = new Overloading1();
		obj.sum(10, 10, 10);
		obj.sum(20, 20);

	}
}