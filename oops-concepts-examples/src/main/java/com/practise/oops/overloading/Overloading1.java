package com.practise.oops.overloading;

class Overloading1 {
	void sum(int a, int b) {
		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}


	void sum(Integer a) {
		System.out.println(a );
	}
	void sum(String a) {
		System.out.println(a );
	}


	public static void main(String args[]) {
		Overloading1 obj = new Overloading1();
		obj.sum(10, 10, 10);
		obj.sum(20, 20);
		Integer arg = null;

		obj.sum(arg);

	}
}