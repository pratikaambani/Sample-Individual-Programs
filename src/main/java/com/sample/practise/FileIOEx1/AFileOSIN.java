package com.sample.practise.FileIOEx1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AFileOSIN {

	public static void main(String args[]) throws IOException {

		String text = "This is Development of File IO on 48.28";

		String fos1 = "fileOutputStream1.txt";

		FileOutputStream fOS1 = new FileOutputStream(fos1);

		byte[] b = text.getBytes();
		fOS1.write(b);
		fOS1.close();

		System.out.println("success....");

		String fis1 = "fileOutputStream1.txt";
		FileInputStream fIS1 = new FileInputStream(fis1);

		System.out.println("Total file size to read (in bytes) : " + fIS1.available());

		System.out.println("Total file size to read (in bytes) : " + fIS1.read());

		System.out.println("Total file size to read (in bytes) : " + fIS1.getChannel().position());

		int i = 0;
		while ((i = fIS1.read()) != -1) {
			System.out.print((char) i);
		}
	}
}
