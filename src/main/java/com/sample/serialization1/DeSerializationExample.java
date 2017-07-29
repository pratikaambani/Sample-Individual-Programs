package com.sample.serialization1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationExample {

	public static void main(String args[]) {

		SerializationExample sE = null;

		try {
			FileInputStream fIS = new FileInputStream("\\\\tsclient//D//Xtra//pratik.ser");

			ObjectInputStream oIS = new ObjectInputStream(fIS);

			sE = (SerializationExample) oIS.readObject();

			System.out.println("se=  " + sE);

			System.out.println("Now getting values from serialized object file.");

			System.out.println("Name = " + sE.name);

			System.out.println("Age = " + sE.age);

			System.out.println("Roll = " + sE.roll);
			System.out.println("Look Roll is not serialized due to using transient.");

			oIS.close();
			fIS.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
