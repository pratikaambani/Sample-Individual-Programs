package com.sample.singleprograms;

abstract class Shape {

	public Shape() {
		System.out.println("Constructor of Shape class");
	}

	abstract void draw();

	void paint() {
		System.out.println("Inside paint method of abstract class Shape.");
		System.out.println(
				"Also this method is called only if not overridden by any sub class extending this abstract class.");
	}
}

class Circle extends Shape {

	Circle() {
		// super();
		System.out.println("Inside Constructor of Circle");
	}

	void draw() {
		System.out.println("This is Circle...");

	}

	void paint() {
		System.out.println("Inside paint method of Concrete class Circle.");
		System.out.println("Also, this method is overridden.");
	}

}

class Square extends Shape {

	Square() {
		System.out.println("Inside Constructor of Square");
	}

	void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is Square...");
	}

}

class absClassAndInstanceOf {

	public static void main(String args[]) {
		Shape s1 = new Circle();
		s1.draw();

		s1.paint();

		System.out.println("");
		System.out.println("Cant Instantiate Shape.");
		// Shape s1 = new Shape();

		System.out.println("");
		Shape s2 = new Square();
		s2.draw();
		s2.paint();

		System.out.println("");
		System.out.println("S1 belongs to  = " + s1.getClass().getSimpleName());

		System.out.println("S2 belongs to = " + s2.getClass().getSimpleName());

		if (s1 instanceof Shape) {
			System.out.println("Yes, s1 belongs to Shape");
		} else {
			System.out.println("No, s1 doesn't belong to Shape");
		}

		if (s1 instanceof Square) {
			System.out.println("Yes, s1 belongs to Square");
		} else {
			System.out.println("No, s1 doesn't belong to Square");
		}

		if (s1 instanceof Circle) {
			System.out.println("Yes, s1 belongs to Circle");
		} else {
			System.out.println("No, s1 doesn't belong to Circle");
		}

	}

}
