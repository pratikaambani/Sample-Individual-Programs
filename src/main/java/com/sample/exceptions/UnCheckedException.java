package com.sample.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public  class UnCheckedException {

	public  static void main(String args[]) {

		int i = 10;
		int j = 0;
		
		System.out.println("Here syntactically everything fine "
				+ "but error is in logic which Compiler doesn't understand"
				+ "and hence throws runtime exception, that is UnCheckedException");
		
		System.out.println("Lets Calculate --");
		
		System.out.println("Dividing 10 by 0 and -- " +(i/j));
		
		System.out.println("Arere This wont be printed.");
	}

}
