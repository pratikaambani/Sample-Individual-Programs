package com.practise.oops.accessModifiersAndThis;

public class FinalExample {

	private int sum;
	private final int NUMBER;

	public FinalExample(int a) {
		NUMBER = a;
	}

	public void add() {
		sum += NUMBER;
	}

	public String toString() {
		return String.format("Sum = %d \n", sum);
	}

}
