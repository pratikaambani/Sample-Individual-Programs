package com.sample.singleprograms;

public class EqualsExample {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		String compareExample = null;

		System.out.println("The == operator tests whether two variables have " +
				"the same references (aka pointer to a memory address).\n");

		// if(compareExample.equals("Pratik")) {
		if ("Pratik".equals(compareExample)) {
			System.out.println("Yes Same.");
		} else {
			System.out.println("Nopes, Different");
		}


		String foo = new String("abc");
		String bar = new String("abc");
		String abc = new String("pqr");

		System.out.println("foo==bar: " +(foo==bar));
		System.out.println("foo.equals(bar): " +foo.equals(bar));

		System.out.println("foo=bar: " +(abc=bar));


		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 is:" + s1 == s2);
		System.out.println("s1 == s2 is:" + (s1 == s2));


	}

}
