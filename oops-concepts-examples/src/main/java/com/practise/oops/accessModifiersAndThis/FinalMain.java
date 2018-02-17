package com.practise.oops.accessModifiersAndThis;

public class FinalMain {

	public static void main(String[] args) {
		FinalExample fE = new FinalExample(10);

		for (int i = 0; i < 5; i++) {
			fE.add();
			System.out.printf("%s", fE);

			// Below operation is not possible as we have declared NUMBER as
			// final in Final Example class.
			// fE.NUMBER = 12310;
		}
	}
}
