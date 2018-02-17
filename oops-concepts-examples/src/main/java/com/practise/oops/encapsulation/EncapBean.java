package com.practise.oops.encapsulation;


public class EncapBean {

	private String name;
	private String idNum;
	private int age;

	protected int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getIdNum() {
		return idNum;
	}

	//default
	void setAge(int newAge) {
		age = newAge;
	}

	public void setName(String newName) {
		name = newName;
	}

	//protected
	protected void setIdNum(String newId) {
		idNum = newId;
	}
}