package com.practise.oops.overriding;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Static methods cannot be overridden but they can be hidden. The print()
 * method of Child is not overridden (not subject to polymorphism) by print() of
 * parent but it will hide it. If you call print() in Child (NOT Parent.print()
 * or Child.print() ... just print()), the one of Child will be called and not
 * Parent. Since this is not subjected to polymorphism, the call print() in
 * Parent will never be redirected to the one in Child.
 */
class Parents {

	static void print() {
		System.out.println("Parent version method is call.");
	}
	public void display() throws IOException {
		System.out.println("Parent display is called.");
	}
}

class Child extends Parents {

	static void print() {
		System.out.println("Child version method is call.");
	}
	//cannot reduce the visibility of orverriden method
	public void display() throws FileNotFoundException{
		System.out.println("child display is called.");
	}
}

public class StaticOverridden {
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception {
		Parents p = new Child();
		p.print();
		Parents d = new Child();
		d.display();
	}
}