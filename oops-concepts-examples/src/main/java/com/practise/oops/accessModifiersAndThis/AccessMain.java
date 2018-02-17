package com.practise.oops.accessModifiersAndThis;

public class AccessMain {

	public static void main(String[] args) {

		Access ac = new Access();

		System.out.println(ac.toHour());
		System.out.println(ac.toMin());

		ac.setValues(7, 8, 9);

		System.out.println(ac.toHour());
		System.out.println(ac.toMin());

	}
}
