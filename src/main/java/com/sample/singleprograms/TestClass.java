
abstract class Shape {

	public Shape() {
		System.out.println("Constructor of Shape class");
	}

	abstract void draw1();
}

class Circle extends Shape {

	Circle() {
		super();
		System.out.println("Inside Constructor of Circle");
	}

	void draw1() {
		System.out.println("This is Circle...");
	}
}

class Square extends Shape {

	Square() {
		System.out.println("Inside Constructor of Square");
	}

	void draw1() {
		// TODO Auto-generated method stub
		System.out.println("This is Square...");
	}

}

class TestClass {

	public static void main(String args[]) {
		Shape s1 = new Circle();
		s1.draw1();

		Shape s2 = new Square();
		s2.draw1();

	}

}
