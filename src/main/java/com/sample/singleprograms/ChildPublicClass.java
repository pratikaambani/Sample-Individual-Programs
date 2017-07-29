package com.sample.singleprograms;

class ParentClass1 {

	ParentClass1() {
//	private ParentClass1() {
		System.out.println("Constr ParentClass1()");
	}

	public void methodEx() {
		System.out.println("Inside method of SuperClass");
	}

	public void anotherMethod() {
		System.out.println("Inside another method of Super Class.");
	}
}

public class ChildPublicClass extends ParentClass1 {

	ChildPublicClass() {
		System.out.println("Constr of ChildPublicClass().");
	}

	private void ParentClass1() {
		System.out.println("Constr ParentClass1()");
	}

	public void methodEx() {
		System.out.println("Inside method of SubClass");
	}

	/*
	 * public void anotherMethod() { System.out.println(
	 * "Inside another method of Sub Class."); }
	 */
	public static void main(String args[]) {

		System.out.println("This is example of Method Overriding");

		ParentClass1 obj2 = new ChildPublicClass();
		obj2.methodEx();
		obj2.anotherMethod();
		System.out.println("\n It is reference of class - " + obj2.getClass().getSimpleName() + "\n");

		ParentClass1 obj3 = new ParentClass1();
		obj3.methodEx();
		obj3.anotherMethod();
		System.out.println("\n It is reference of class - " + obj3.getClass().getSimpleName() + "\n");

		ChildPublicClass obj1 = new ChildPublicClass();
		obj1.methodEx();
		obj1.anotherMethod();
		System.out.println("\n It is reference of class - " + obj1.getClass().getSimpleName() + "\n");

	}
}
