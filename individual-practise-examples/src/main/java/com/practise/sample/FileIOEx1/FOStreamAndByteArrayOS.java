package com.practise.sample.FileIOEx1;

import java.io.*;

public class FOStreamAndByteArrayOS {

	public static void main(String args[]) {

		System.out.println("FileOutputStream.");

		try {
			FileOutputStream fOS1 = new FileOutputStream("fileOutputStream1.txt");
			FileOutputStream fOS2 = new FileOutputStream("fileOutputStream2.txt");

			String file1Details = "These are the contents of file1.";
			String file2Details = "These are the contents of file2.";

			byte b1[] = file1Details.getBytes();
			byte b2[] = file2Details.getBytes();

			ByteArrayOutputStream bOS = new ByteArrayOutputStream();

			bOS.write(b1);
			bOS.write(b2);

			bOS.writeTo(fOS1);
			bOS.flush();
			// bOS.close();

			fOS1.write(b1);
			fOS2.write(b2);
			fOS1.close();
			fOS2.close();

			System.out.println("Success !!");

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Now inputStream - Reading,");

		try {
			FileInputStream fIN1 = new FileInputStream("fileOutputStream1.txt");
			FileInputStream fIN2 = new FileInputStream("fileOutputStream2.txt");
			FileInputStream fIN3 = new FileInputStream("fileOutputStream3.txt");

			SequenceInputStream sIS = new SequenceInputStream(fIN1, fIN2);

			int i;
			try {
				while ((i = sIS.read()) != -1) {
					System.out.print((char) i);
				}
				sIS.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			int j = 0;

			try {
				while ((j = fIN3.read()) != -1) {
					System.out.print((char) j);

				}
				System.out.println();
				System.out.println("EOF");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
