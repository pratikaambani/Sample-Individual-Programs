package com.sample.serialization1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public  class SerializeMain {

	public  static void main(String[] args) {

		SerializationExample sE = new SerializationExample();
		sE.name = "Pratik";
		sE.age = 24;
		sE.roll = 10;

		try {
			FileOutputStream fOS = new FileOutputStream("\\\\tsclient//D//Xtra//pratik.ser");

			ObjectOutputStream oOS = new ObjectOutputStream(fOS);
			oOS.writeObject(sE);

			oOS.close();
			fOS.close();

			System.out.printf("Great !! \nSerialized data is saved in \\\\tsclient//D//Xtra//pratik.ser");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
