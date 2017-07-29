package com.sample.singleprograms;

public  class ComplexJavaClass {

	public  static void main(String args[]) {

		char x = 'X';
		int i = 0;

		System.out.println(false ? 0 : x);
		
		System.out.println("next");

		if (false)
			System.out.println(0);
		else
			System.out.println(x);

		System.out.println("next.");
		
		if (true)
			System.out.println(x);
		else
			System.out.println(i);

		System.out.println(true ? x : i);

		int a = x;

		System.out.println("ASCII = " + (a));
	}

}
