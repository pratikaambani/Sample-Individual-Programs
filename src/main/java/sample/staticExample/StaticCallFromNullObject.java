package com.sample.staticExample;

public class StaticCallFromNullObject {

	public static int a = 1;

	public static void main(String[] args) {

		System.out.println("We can call static method from null object.");
		System.out.println("Here it is how.");

		// StaticCallFromNullObject t = null;
		StaticCallFromNullObject t = new StaticCallFromNullObject();
		t.aStaticMethod();

		System.out.println(" \n \n and this is again main methid");

		StaticCallFromNullObject.aStaticMethod();
	}

	public static void aStaticMethod() {

		System.out.println("This text is from static method --> " + (a++) + "time..");
	}
}
