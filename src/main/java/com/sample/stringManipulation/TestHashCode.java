package com.sample.stringManipulation;


public  class TestHashCode {

	public  static void main(String[] args) {
		// TODO Auto-generated method stub

		TestHashCode thc = new TestHashCode();

		System.out.println(thc);

		System.out.println(thc.hashCode());

		System.out.println(thc.getClass());

		System.out.println("Class Name = " + thc.getClass().getSimpleName());

		System.out.println("Class Name = " + thc.getClass().getCanonicalName());

	}

}
