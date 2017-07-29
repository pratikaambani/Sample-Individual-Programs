package com.sample.singleprograms;

class XYZ {
	final void demo() {
		System.out.println("XYZ Class Method");
	}
}

class MethodOverRiding extends XYZ {
	//Uncomment below line
/*
	void demo() {
		System.out.println("ABC Class Method");
	}
*/

	public  static void main(String args[]) {
		MethodOverRiding obj = new MethodOverRiding();
		obj.demo();
	}
}