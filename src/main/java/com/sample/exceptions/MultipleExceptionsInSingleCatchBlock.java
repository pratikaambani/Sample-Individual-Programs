package com.sample.exceptions;

import java.io.FileNotFoundException;

public class MultipleExceptionsInSingleCatchBlock {
	public static void main(String args[]) {

		try {
			int a = 1 / 0;
			throw new FileNotFoundException();
		} catch (ArithmeticException | IllegalAccessError| FileNotFoundException  e) {
			e.printStackTrace();
		} finally {
			System.out.println("tada");
		}
		
		
		tryReturnTest();
	}

	private static int tryReturnTest() {
		try {
			System.out.println("test");
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("test from finally");
			return 0;
		}
	}

}
