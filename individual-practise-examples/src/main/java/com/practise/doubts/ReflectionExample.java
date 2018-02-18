package com.practise.doubts;

class ReflectionClass {

	public ReflectionClass() {
		System.out.println("Sample Class Constructor");
	}

	int a = 0;
}

public class ReflectionExample {

	int a = 0;

	void printName(Object o) {
		Class c2 = o.getClass();

		System.out.println(c2.getName());
	}

	public static void main(String args[]) throws ClassNotFoundException {

		int a = 0;

		// 1st
		Class c1 = Class.forName("ReflectionClass");
		System.out.println(c1.getSimpleName());
		System.out.println(c1.getName());

		ReflectionClass sC = new ReflectionClass();

		ReflectionExample rClass = new ReflectionExample();
		// 2nd
		String c2 = sC.getClass().getName();
		String c3 = rClass.getClass().getName();

		System.out.println();
		System.out.println();
		System.out.println(c2);
		System.out.println(c3);

		System.out.println();
		System.out.println();
		System.out.println();

		// 3rd
		System.out.println(boolean.class.getName());

		Class c5 = ReflectionExample.class;
		System.out.println(c5.getName());

		Class c6 = ReflectionClass.class;
		System.out.println(c6.getName());

	}

}
