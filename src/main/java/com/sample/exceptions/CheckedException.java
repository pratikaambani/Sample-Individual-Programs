package com.sample.exceptions;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class CheckedException {

	public static void main(String args[]) {

		System.out.println("Here nothing is handled so it throws "
				+ "error at compile time and hence this is "
				+ "Checked Exception.");


		List<String> ll = new ArrayList();
/*
		try {
			System.out.println("test");
		} catch(IOException e) {
			e.printStackTrace();
		}
*/

		FileInputStream file = null;
/*
		file = new FileInputStream("C://p.txt");

		file.close();
*/

	}

}
