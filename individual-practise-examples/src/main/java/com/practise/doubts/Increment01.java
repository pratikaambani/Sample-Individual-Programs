package com.practise.doubts;

public class Increment01 {
	public static void main(String[] args) {
		int a;

		a = 4;
		System.out.println(++a); // Prints 5
		System.out.println(a); // Prints 5
		System.out.println();

		a = 4;
		System.out.println(a++); // Prints 4
		System.out.println(a); // Prints 5
		System.out.println();

		a = 4;
		System.out.println(--a); // Prints 3
		System.out.println(a); // Prints 3
		System.out.println();

		a = 4;
		System.out.println(a--); // Prints 4
		System.out.println(a); // Prints 3
		System.out.println();
	}
}