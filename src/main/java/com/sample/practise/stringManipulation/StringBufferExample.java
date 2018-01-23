package com.sample.practise.stringManipulation;

public class StringBufferExample {
	public static void main(String args[]) {

		String s = new String("Hellow");
		StringBuffer sb = new StringBuffer("Hello ");

		System.out.println(s);// prints Hello
		System.out.println(sb);// prints Hellow

		s.concat("Ambani");
		sb.append("Ambani");

		System.out.println(s);// prints Hello
		System.out.println(sb);// prints Hello Ambani

		sb.insert(5, " Pratik");
		System.out.println(sb);

		// sb.replace(0, 2, null);
		// System.out.println(sb.charAt(0));

		System.out.println(sb.capacity());

		sb.append("tsedfjgbdfjg");
		System.out.println(sb.capacity());

		sb.ensureCapacity(46);
		System.out.println(sb.capacity());

		sb.ensureCapacity(47);
		System.out.println(sb.capacity());

		System.out.println();

	}
}