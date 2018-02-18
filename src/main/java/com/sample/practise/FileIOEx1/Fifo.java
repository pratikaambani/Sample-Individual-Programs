package com.sample.practise.FileIOEx1;

import java.io.FileWriter;
import java.io.IOException;

public class Fifo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fos1 = "fileOutputStream1.txt";
		try {
			FileWriter f1w = new FileWriter(fos1);
			f1w.write("Hiiiiiii");
			f1w.write("Class = " + f1w.getClass());
		} catch (IOException io) {
			io.printStackTrace();
		}
	}

}
