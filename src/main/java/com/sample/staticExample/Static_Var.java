package com.sample.staticExample;

class Static_Var {

	int count = 0;// will get memory when instance is created
	// static int count = 0;

	// static int count=0;
	// will get memory only once and retain its value

	Static_Var() {
		count++;
		System.out.println(count);
	}

	public static void main(String args[]) {

		Static_Var c1 = new Static_Var();
		Static_Var c2 = new Static_Var();
		Static_Var c3 = new Static_Var();

	}
}