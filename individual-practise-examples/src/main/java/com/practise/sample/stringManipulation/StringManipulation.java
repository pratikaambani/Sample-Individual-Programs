package com.practise.sample.stringManipulation;

public class StringManipulation {

	public static void main(String[] args) {

		String s = "0pratik.a.ambani@relianceada.com";

		System.out.println("Main String = " + s);

		String s1 = s.substring(1);
		System.out.println("SubClass String = " + s1);

		String s2 = s1.trim();
		System.out.println("sub String = " + s2);

		int s3 = s2.indexOf("@");
		String s4 = s2.substring(0, s3);
		System.out.println("sub String = " + s3);
		System.out.println("sub String = " + s2.substring(0, s3));

		String s5 = s4.replace(".", " ");
		System.out.println("sub String = " + s5);

		System.out.println("Formatted Sreing = "
				+ s.substring(1).trim().substring(0, (s.indexOf("@")) - 1)
						.replace(".", " "));

	}

}
