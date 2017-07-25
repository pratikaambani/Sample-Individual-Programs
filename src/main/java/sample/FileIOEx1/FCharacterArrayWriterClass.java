package com.sample.FileIOEx1;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FCharacterArrayWriterClass {
	public static void main(String args[]) throws IOException {

		System.out.println("To write op into multiple files.");

		CharArrayWriter cAW = new CharArrayWriter();
		cAW.write("Hiii");

		FileWriter fW1 = new FileWriter("C://test1.txt");
		FileWriter fW2 = new FileWriter("C://test2.txt");
		FileWriter fW3 = new FileWriter("C://test3.txt");
		FileWriter fW4 = new FileWriter("C://test4.txt");
		FileWriter fW5 = new FileWriter("C://test5.txt");

		cAW.writeTo(fW1);
		cAW.writeTo(fW2);
		cAW.writeTo(fW3);
		cAW.writeTo(fW4);
		cAW.writeTo(fW5);

		fW1.close();
		fW2.close();
		fW3.close();
		fW4.close();
		fW5.close();

	}

}
