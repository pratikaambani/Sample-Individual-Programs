package com.sample.practise.stringManipulation;

public class EqualsIgCase {

	public static void main(String[] args) {

		String s1 = "Pratik";
		String s2 = "Test";
		String s3 = "tset";
		String s4 = "tEst";

		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s2.equalsIgnoreCase(s4));

	}

}

