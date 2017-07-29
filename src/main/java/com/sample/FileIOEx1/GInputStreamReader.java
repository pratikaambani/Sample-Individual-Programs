package com.sample.FileIOEx1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GInputStreamReader {

	public static void main(String args[]) throws IOException {

		InputStreamReader iSR = new InputStreamReader(System.in);

		BufferedReader bR = new BufferedReader(iSR);

		System.out.println("Name pls");

		// String name = bR.readLine();

		String name = "";

		while (!name.equals("Stop")) {
			System.out.println("Enter whatever u want except Stop or else program will terminate");
			name = bR.readLine();
		}

		System.out.println("y did u press stop, bye bye");
		// System.out.println("Yo " +name+ " !!");

	}

}
