package com.practise.sample.exceptions;

import java.io.FileNotFoundException;

public class MultipleExceptionsInSingleCatchBlock {
	public static void main(String[] args) {

		multipleCatchBlock();
		
		tryReturnTest();

	}

	private static void multipleCatchBlock() {
		try {
			int a = 1 / 0;
			throw new FileNotFoundException();
		} catch (ArithmeticException | IllegalAccessError| FileNotFoundException  e) {
			e.printStackTrace();
		} finally {
			System.out.println("tada");
		}
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
