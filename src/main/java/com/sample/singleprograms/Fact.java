package com.sample.singleprograms;

public class Fact {
	public static void main(String args[]) {
		System.out.println("factorial: " +factorial(5));
	}

	public static int factorial(int a) {
		if (a==1)
			return a;
		return a * factorial(a-1);
	}
}
