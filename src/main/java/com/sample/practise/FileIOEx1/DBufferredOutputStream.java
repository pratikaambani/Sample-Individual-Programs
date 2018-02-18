package com.sample.practise.FileIOEx1;

import java.io.*;

public class DBufferredOutputStream {

	public static void main(String[] args) throws IOException {

		String text = "This is Development of File IO on 48.28 - BufferedOutputStream";

		System.out.println("The class implements a buffered output stream. By setting up such " +
				"an output stream, an application can write bytes to the underlying " +
				"output stream without necessarily causing a call to the underlying" +
				" system for each byte written.\n");

		String fos1 = "fileOutputStream1.txt";

		FileOutputStream fOS1 = new FileOutputStream(fos1);

		BufferedOutputStream bOS1 = new BufferedOutputStream(fOS1);

		byte[] b = text.getBytes();
		bOS1.write(b);
		bOS1.flush();

		System.out.println("Success written.....");
		fOS1.close();
		
		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		String fis1 = "FileinputStream.txt";
		FileInputStream fIS1 = new FileInputStream(fis1);

		BufferedInputStream bIS1 = new BufferedInputStream(fIS1);
		
		int i = 0;
		while ((i = bIS1.read()) != -1) {
			System.out.print((char) i);
		}

		

	}

}
