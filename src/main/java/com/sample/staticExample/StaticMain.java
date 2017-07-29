package com.sample.staticExample;

public  class StaticMain {
	public  static void main(String args[]) {

		TestStatic tS1 = new TestStatic("Pratik", "Ambani");
		TestStatic tS2 = new TestStatic("Another", "Value");
		TestStatic tS3 = new TestStatic("Third", "Value3");
		TestStatic tS4 = new TestStatic("Forutth", "Value4");

		// System.out.println(TestStatic.getMembers());
		System.out.println(TestStatic.class);

		System.out.println();
		System.out.println(tS2.getFirst());
		System.out.println(tS3.getLast());
		System.out.println(tS4.getMembers());

	}

}
