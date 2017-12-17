package com.sample.practise.oopsconcepts.overloading;

public class Overloading4 {

	public static void main(int a) {
		System.out.println(a * a);
	}

	public static void main(String[] args) {
		System.out.println("Main invoked");
		main(10);
	}

}
