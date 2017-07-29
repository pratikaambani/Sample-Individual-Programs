package com.sample.superEx;

class Test_Super {
	Test_Super() {
		System.out.println("Inside Test_Super");
	}

	public Test_Super(int a, int b) {
		System.out.println("Inside mul arg Test_Super" + (a * b));
	}

}

class Test1 extends Test_Super {
	public Test1(int a, int b) {
		super(11, 12);
		System.out.println("Inside Test1" + (a + b));
	}

	public Test1() {
		super();
		System.out.println("Inside Test1");
	}

	public static void main(String[] args) {
		Test1 t1 = new Test1(10, 15);
		Test1 t2 = new Test1();
	}
}