package com.sample.serialization1;

import java.io.Serializable;

public  class SerializationExample implements Serializable {

	private static final long serialVersionUID = 686800402478465782L;

	public  String name;
	public  int age;
	public  transient int roll;

	public  void personalDetails() {
		System.out.println("Name = " + name + " and age = " + age + " and roll = " + roll);
	}

}