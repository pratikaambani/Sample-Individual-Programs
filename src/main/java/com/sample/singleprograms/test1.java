
abstract class Shape1 {

	public  Shape1() {
		System.out.println("Constructor of Shape1 class");
	}

	abstract void draw1();
}

class Circle1 extends Shape1 {

	Circle1() {
		super();
		System.out.println("Inside Constructor of Circle");
	}

	void draw1() {
		System.out.println("This is Circle...");
	}
}

class Square1 extends Shape1 {

	Square1() {
		System.out.println("Inside Constructor of Square");
	}

	void draw1() {
		// TODO Auto-generated method stub
		System.out.println("This is Square...");
	}

}

class test1 {

	public  static void main(String args[]) {
		Shape1 s1 = new Circle1();
		s1.draw1();

		Shape1 s2 = new Square1();
		s2.draw1();

	}

}
