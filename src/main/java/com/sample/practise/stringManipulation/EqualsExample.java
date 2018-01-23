package com.sample.practise.stringManipulation;

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


		stringEquals();

		intEquals();

		String foo = new String("abc");
		String bar = new String("abc");
		String abc = new String("pqr");

		System.out.println("foo==bar: " +(foo==bar));
		System.out.println("foo.equals(bar): " +foo.equals(bar));

		System.out.println("foo=bar: " +(abc=bar));
		System.out.println("now abc: " +abc);


		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 is:" + s1 == s2);
		System.out.println("s1 == s2 is:" + (s1 == s2));


	}

	private static void intEquals() {
		int i1 = 10;
		int i2 = 10;
		Integer i3 = 10;
		Integer i4 = 10;
		Integer i5 = new Integer(10);
		Integer i6 = new Integer(10);

		System.out.println(i3.equals(i1));
		System.out.println(i3.equals(i4));
		System.out.println(i3.equals(i5));

		System.out.println(i5.equals(i1));
		System.out.println(i5.equals(i6));

		System.out.println(i1==i2);
		System.out.println(i1==i3);
		System.out.println(i1==i5);

		System.out.println(i3==i4);
		System.out.println(i3==i5);

		System.out.println(i5==i6);

	}

	private static void stringEquals() {

		String s1 = "pratik";
		String s2 = "pratik";
		String s3 = new String("Pratik");
		String s4 = new String("Pratik");

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));

		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
	}

}
