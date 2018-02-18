package com.practise.doubts;

import java.util.Vector;

public class testExceptionColln {
	public static void main(String[] args) {
		// Create a list of names

		testExceptionColln classname = new testExceptionColln();

		String a = "ss";
		int b = 5;
		String c[] = { "a", "b" };

		Vector v = new Vector();

		v.add(123);
		v.add(1);

		int a123 = 0, b123 = 1;
		try {
			int c1 = b123 / a123;
			System.out.println("c(a/b) = " + c1);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Arithmatic Exc");
		} catch (Exception e) {
			System.out.println("Exception occurred");
		}

		System.out.println("a is " + a.getClass().getName());
		System.out.println("b is " + b);
		// System.out.println("c is " +c1.getClass().getName());
		System.out.println("v1 is "
				+ v.firstElement().getClass().getName().contains("Integer"));

		String pi = "df";

		try {
			int das = Integer.parseInt(pi);
			System.out.println("das = " + das);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		System.out.println("v1 is "
				+ v.firstElement().getClass().getName().contains("Integer"));

		System.out.println("classname is = "
				+ classname.getClass().getPackage());
		System.out
				.printf("classname is = " + classname.getClass().getPackage());
		System.out.println("classname is = "
				+ classname.getClass().getPackage());
		System.out.print("classname is = " + classname.getClass().getPackage());

		// 1. Vectors
		/*
		 * Vector v = new Vector();
		 * 
		 * v.add("P"); v.add("R"); v.add("A"); v.add("T"); v.add("I");
		 * v.add("K");
		 * 
		 * for(int a=0;a<v.size();a++) { System.out.println("Elements aer"
		 * +v.capacity()); System.out.println("Elements aer" +v.get(a)); }
		 */

		// 2. Arraylist
		/*
		 * List names = new ArrayList();
		 * 
		 * //Add some names in list names.add("Eve"); names.add("Anna");
		 * names.add("Tonny"); names.add("Steve");
		 * 
		 * 
		 * 
		 * //Method #3 : Iterate using advanced for loop
		 * System.out.println("Using Iterator"); Iterator iterator =
		 * names.iterator(); while (iterator.hasNext()) {
		 * System.out.println(iterator.next()); }
		 *//*
			 * //Method #4 : Iterate using while loop
			 * System.out.println("Using while  loop"); int index = 0 ; while
			 * (names.size()> index) { System.out.println(names.get(index));
			 * index++ ; }
			 */}

	// 3. Enum

	Vector v1 = new Vector();

}