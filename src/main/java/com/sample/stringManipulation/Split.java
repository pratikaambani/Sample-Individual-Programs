package com.sample.stringManipulation;

public  class Split {
	public  static void main(String args[]) {

		String banner = new String(",Wel,come,to,Civili,zation,3.0");

		System.out.println("Main String = " + banner);
		System.out.println("");

		for (String s : banner.split(",", -2)) {
			System.out.println(s);
		}
		System.out.println("");

		for (String s : banner.split(",", -1)) {
			System.out.println(s);
		}
		System.out.println("");

		for (String s : banner.split(",", 0)) {
			System.out.println(s);
		}
		System.out.println("");

		for (String s : banner.split(",", 1)) {
			System.out.println(s);
		}
		System.out.println("");

		for (String s : banner.split(",", 2)) {
			System.out.println(s);
		}
		System.out.println("");

		for (String s : banner.split(",", 3)) {
			System.out.println(s);
		}
		System.out.println("");

		for (String s : banner.split(",", 4)) {
			System.out.println(s);
		}
		System.out.println("");

	}
}
