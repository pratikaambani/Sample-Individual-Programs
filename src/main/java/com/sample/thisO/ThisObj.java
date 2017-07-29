package com.sample.thisO;

public  class ThisObj {

	public  static void main(String[] args) {

		// When we pass an object, as parameter to the output statement
		// internally toString() method of that
		// object will be called
		Test t = new Test(10);

		System.out.println("value = " + t);

	}

}
