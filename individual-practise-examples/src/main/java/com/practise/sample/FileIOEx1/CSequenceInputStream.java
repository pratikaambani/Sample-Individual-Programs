package com.practise.sample.FileIOEx1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class CSequenceInputStream {
	public static void main(String args[]) throws IOException {

		String fis1 = "fileOutputStream1.txt";
		String fis2 = "fileOutputStream2.txt";

		FileInputStream fIS1 = new FileInputStream(fis1);
		FileInputStream fIS2 = new FileInputStream(fis2);

		SequenceInputStream sIS = new SequenceInputStream(fIS1, fIS2);

		int i;

		while ((i = sIS.read()) != -1) {
			System.out.print((char) i);
		}

		sIS.close();
		fIS1.close();
		fIS2.close();

	}

}
