package com.sample.singleprograms;

import java.io.IOException;

class ParentClass {

	static {
		System.out.println("1. Inside Static of ParentClass  \n");
		clear();
	}

	{
		System.out.println("3. Non-static block of ParentClass  \n");
		clear();
	}

	ParentClass() {
		System.out.println("4. Constructor of ParentClass  \n");
		clear();
	}

	public static void clear() {
		/*
		 * try { Runtime.getRuntime().exec("cls"); } catch (IOException e) {
		 * e.printStackTrace(); }
		 */
		System.out.println("---------------------------");
	}

}

public class ChildClass extends ParentClass {

	static {
		System.out.println("2. Inside Static of ChildClass \n");
		clear();
	}

	{
		System.out.println("5. Non-static block of ChildClass \n");
		clear();
	}

	ChildClass() {
		System.out.println("6. Constructor of ChildClass \n");
		clear();
	}

	public static void main(String[] args) {
		ChildClass t = new ChildClass();

		// ChildClass t2 = new ChildClass();
	}
}