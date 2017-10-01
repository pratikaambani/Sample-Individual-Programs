package com.sample.FileIOEx1;

import java.io.*;

public class DBufferredOutputStream {

	public static void main(String[] args) throws IOException {

		String text = "This is Development of File IO on 48.28 - BufferedOutputStream";

		String fos1 = "\\\\tsclient//D//Xtra//fileOutputStream1.txt";

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
		
		String fis1 = "\\\\tsclient//D//Xtra//FileinputStream.txt";
		FileInputStream fIS1 = new FileInputStream(fis1);

		BufferedInputStream bIS1 = new BufferedInputStream(fIS1);
		
		int i = 0;
		while ((i = bIS1.read()) != -1) {
			System.out.print((char) i);
		}

		

	}

}
