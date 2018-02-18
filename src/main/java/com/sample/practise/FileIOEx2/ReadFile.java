package com.sample.practise.FileIOEx2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {

		ReadFile rf = new ReadFile();

		try {
			rf.getFile("C://p.txt");
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception eccured --> " + e);
			e.printStackTrace();
		}
	}

	private String getFile(String fileName) {
		StringBuilder sb = new StringBuilder();

		ClassLoader cl = getClass().getClassLoader();

		String a = cl.getResource(fileName).getFile();

		File f = new File(a);

		try {
			Scanner s = new Scanner(f);

			while (s.hasNext()) {
				String line = s.nextLine();
				sb.append(line).append("\n");
			}
			s.close();
		} catch (IOException ioe) {
			System.out.println("IOE Occurred. " + ioe);
		}

		return sb.toString();
	}

}
