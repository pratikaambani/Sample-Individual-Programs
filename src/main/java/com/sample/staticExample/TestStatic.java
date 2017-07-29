package com.sample.staticExample;

public  class TestStatic {

	private String first;
	private String last;
	// Test by removing static from below int
	private int members = 0;

	public  TestStatic(String f, String l) {
		first = f;
		last = l;
		members++;

		System.out.printf("Constructor for %s %s, Total members = %d \n",
				first, last, members);
	}

	public  String getFirst() {
		return first;
	}

	public  String getLast() {
		return last;
	}

	public  int getMembers() {
		return members;
	}

}
