package com.sample.stringManipulation;


public class HashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = new String("Hi");
		String b = "Hi";

		String v = new String("Hi");

		System.out.print("a.hashCode(); = " + a.hashCode());
		System.out.println(" \n \t b.hashCode(); = " + b.hashCode());
		System.out.println(" \n \t v.hashCode(); = " + v.hashCode());
	}

}
