package com.sample.practise.exceptions;

public class CloneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CloneExample tc = new CloneExample();

		System.out.println("tetstx = " + tc);

		System.out.println("hashCode = " + tc.hashCode());
		System.out.println("getClass = " + tc.getClass());
		try {
			System.out.println("clone = " + tc.clone());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
