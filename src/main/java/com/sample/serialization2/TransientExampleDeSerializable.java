package com.sample.serialization2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

class TransientExampleDeSerializable {
	public  static void main(String args[]) throws Exception {

		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("c://p.txt"));
			SampleData s = (SampleData) in.readObject();
			System.out.println(s.id + " " + s.name + " " + s.age);
			in.close();

		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
			System.out.println("File nai mili");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception");
		}
	}
}