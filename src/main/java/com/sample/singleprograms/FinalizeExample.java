package com.sample.singleprograms;


public class FinalizeExample {

	public void finalize() {
		System.out.println("This is printed in last");
	}

	public static void main(String args[]) {

		FinalizeExample fE1 = new FinalizeExample();
		FinalizeExample fE2 = new FinalizeExample();

		System.out.println("fE1.toString(); = " + fE1.toString());
		System.out.println("fE2.toString(); = " + fE2.toString());

		fE1 = null;
		fE2 = null;

		System.gc();

	}

}
