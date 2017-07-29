class X {
	int a = 10;
}

class Y extends X {
	int a = 20;
}

class Z extends X {
	int a = 30;
}

// X is a supper class of Y and Z which are sibblings.

public  class typecast {
	public  static void main(String args[]) {

		int i;
		double j = 7.48;

		i = (int) j;

		System.out.println("f = " + j + " and a = " + i);

		X x = new X();
		System.out.println("val x = " + x.a);
		Y y = new Y();
		System.out.println("val y = " + y.a);
		Z z = new Z();
		System.out.println("val z = " + z.a);

		X xy = new Y(); // compiles ok (up the hierarchy)
		System.out.println("val xy = " + xy.a);
		X xz = new Z(); // compiles ok (up the hierarchy)
		System.out.println("val xz = " + xz.a);
		// ERROR
		// Y yz = new Z(); incompatible type (sibblings)

		// ERROR
		// Y y1 = new X(); X is not a Y
		// ERROR
		// Z z1 = new X(); X is not a Z

		X x1 = y; // compiles ok (y is subclass of X)
		System.out.println("val x1 = " + x1.a);
		System.out.println("val y = " + y.a);

		X x2 = z; // compiles ok (z is subclass of X)
		System.out.println("val x2 = " + x2.a);
		System.out.println("val z = " + z.a);

		try {
			Y y1 = (Y) x; // compiles ok but produces runtime error
			System.out.println("val y1 = " + y1.a);
			Z z1 = (Z) x; // compiles ok but produces runtime error
			System.out.println("val z1 = " + z1.a);
		} catch (ClassCastException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error aala...");
		}
		Y y2 = (Y) x1; // compiles and runs ok (x1 is type Y)
		System.out.println("val y2 = " + y2.a);
		System.out.println("val x1 = " + x1.a);
		Z z2 = (Z) x2; // compiles and runs ok (x2 is type Z)
		System.out.println("val z2 = " + z2.a);
		System.out.println("val x2 = " + x2.a);
		// ERROR
		// Y y3 = (Y) z; inconvertible types (sibblings)
		// ERROR
		// Z z3 = (Z) y; inconvertible types (sibblings)

		Object o = z;

		try {
			Object o1 = (Y) o; // compiles ok but produces runtime error
			System.out.println("val = " + o1);
		} catch (ClassCastException e) {
			e.printStackTrace();
		}

	}
}
