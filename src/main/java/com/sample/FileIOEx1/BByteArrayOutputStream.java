package com.sample.FileIOEx1;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public  class BByteArrayOutputStream {

	public  static void main(String args[]) throws IOException {

		System.out.println("To write into multiple files.");

		String text = "This is Development of File IO on 48.28";

		String fos1 = "\\\\tsclient//D//Xtra//fileOutputStream1.txt";
		String fos2 = "\\\\tsclient//D//Xtra//fileOutputStream2.txt";

		FileOutputStream fOS1 = new FileOutputStream(fos1);
		FileOutputStream fOS2 = new FileOutputStream(fos2);

		ByteArrayOutputStream bOS = new ByteArrayOutputStream();
		byte[] b = text.getBytes();

		bOS.write(b);
		bOS.writeTo(fOS1);
		bOS.writeTo(fOS2);
		
		bOS.flush();
		

	}

}
