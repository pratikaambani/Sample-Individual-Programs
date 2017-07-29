package com.sample.serialization2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public  class TransientExampleSerializable {

	public  static void main(String args[]) throws IOException {

		SampleData sD = new SampleData(100, "Pratik", 21);

		FileOutputStream fOS = new FileOutputStream("C:\\p.txt");

		ObjectOutputStream oOS = new ObjectOutputStream(fOS);

		oOS.writeObject(sD);
		oOS.flush();
		oOS.close();
	}
}
