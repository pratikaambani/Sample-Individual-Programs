package com.practise.sample.FileIOEx1;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FCharacterArrayWriterClass {
	public static void main(String args[]) throws IOException {

		System.out.println("To write op into multiple files.");

		CharArrayWriter cAW = new CharArrayWriter();
		cAW.write("Hiii");

		FileWriter fW1 = new FileWriter("../../../../fileOutputStream1.txt");
		FileWriter fW2 = new FileWriter("../../../../fileOutputStream2.txt");
		FileWriter fW3 = new FileWriter("../../../../fileOutputStream3.txt");
		FileWriter fW4 = new FileWriter("../../../../fileOutputStream4.txt");
		FileWriter fW5 = new FileWriter("../../../../fileOutputStream5.txt");

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
