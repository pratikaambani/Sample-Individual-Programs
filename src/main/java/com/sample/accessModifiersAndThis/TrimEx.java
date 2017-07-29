package com.sample.accessModifiersAndThis;

public  class TrimEx {

	public  static void main(String[] args) {
		String s1 = "         Pratik        ";
		String s2 = "Pratik";

		System.out.println("s1 = " + s1);
		System.out.println("Trimmed s1 = " + s1.trim());
		System.out.println("s2 = " + s2);

		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("Same");
		} else
			System.out.println("Without trimming both string are not same");

		System.out.println();

		if (s1.trim().equalsIgnoreCase(s2)) {
			System.out.println("After trimming both string are same");
		}
	}

}
