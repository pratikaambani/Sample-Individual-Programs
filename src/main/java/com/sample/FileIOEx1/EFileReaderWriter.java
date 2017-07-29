package com.sample.FileIOEx1;

import java.io.*;

public  class EFileReaderWriter {

	public  static void main(String[] args) throws IOException {

		String text = "This is Development of File IO on 48.28";

		String fos1 = "\\\\tsclient//D//Xtra//fileOutputStream1.txt";

		File aFile = new File(fos1);

		FileWriter fw1 = new FileWriter(fos1);
		fw1.write("Hiiiiiii");
		fw1.write("Class = " + fw1.getClass());
		
		System.out.println("success");

		System.out.println("");
		System.out.println("");
		System.out.println("");

		FileReader fr = null;

		fr = new FileReader(aFile);
		System.out.println("Path = " + aFile.getAbsoluteFile());

		BufferedReader br = new BufferedReader(fr);
		String s = null;

		while ((s = br.readLine()) != null) {
			System.out.println("Contents are " + s);

		}
		br.close();

	}

}
