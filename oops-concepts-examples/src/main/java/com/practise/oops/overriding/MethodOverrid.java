package com.practise.oops.overriding;

public class MethodOverrid {

	public static void main(String[] args) {
		/*
		 * child1 c = (child1) new parent1(); c.m1();
		 */
		child1 c = new child1();
		c.test(null);
		c.num(1);
		//byte b = (byte) 129;
		//System.out.println(b);
		


		
		
		
		
		
	}

}

class parent1 {
	public void m1() {
		// m2();
		System.out.println("Parent call m1 is call");
	}

	public void m2() {
		System.out.println("Parent call m2 is call");
	}
}

class child1 extends parent1 {

	public void m2() {
		System.out.println("child call m2 is call");
	}

	public void test(Object obj) {
		System.out.println("Object version is called");
	}

	public void test(String str) {
		System.out.println("str is called");
	}

	public void num(Integer a ) {
		System.out.println("int is called");
	}

	public void num(Double a) {
		System.out.println("flat is called");
	}
	public void num(byte a) {
		System.out.println("byte is called");
	}
}