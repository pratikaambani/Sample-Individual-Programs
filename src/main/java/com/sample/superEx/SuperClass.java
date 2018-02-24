package com.sample.superEx;

class SuperClass {
	SuperClass() {
		System.out.println("Inside SuperClass");
	}

	public SuperClass(int a, int b) {
		System.out.println("Inside mul arg SuperClass" + (a * b));
	}

}

class SubClass extends SuperClass {
	public SubClass(int a, int b) {
		super(11, 12);
		System.out.println("Inside Example2" + (a + b));
	}

	public SubClass() {
		super();
		System.out.println("Inside Example2");
	}

	public static void main(String[] args) {
		SubClass t1 = new SubClass(10, 15);
		SubClass t2 = new SubClass();
	}
}