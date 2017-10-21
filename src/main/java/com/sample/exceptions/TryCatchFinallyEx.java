package com.sample.exceptions;

public class TryCatchFinallyEx {
	public static void main(String args[]) {

		try {
			System.out.println("Calculate = " + (10 / 0));
		} catch (ArithmeticException e) {
			System.out.println("Oooops !! Exception Occurred - " + e);
		} finally {
			System.out.println("Inside Finally");
		}
		System.out.println("Outside Finally");
	}

}
