package com.practise.sample.exceptions;

public class TryCatchFinallyReturnEx {
	public static void main(String args[]) {

		try {
			System.out.println("Calculate = " + (10 / 0));
		} catch (ArithmeticException e) {
			System.out.println("Oooops !! Exception Occurred - " + e);
		} finally {
			System.out.println("Inside Finally");
		}
		System.out.println("Outside Finally");

		try {
			System.out.println("try");
//			return;
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("catch");
			return;
		} finally {
			System.out.println("finally");
			return;
		}

	}

}
