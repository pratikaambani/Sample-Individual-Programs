package com.sample.serialization2;

import java.io.Serializable;

public class SampleData implements Serializable {
	int id;
	String name;
	transient int age;// Now it will not be serialized

	public SampleData(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
}