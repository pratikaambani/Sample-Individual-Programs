package com.practise.oops.overriding;

import java.io.FileNotFoundException;

class SuperClassExample {

    //6. Constructors cannot be overridden.
    public SuperClassExample() {
    }

    //5. A method declared static cannot be overridden but can be re-declared.
    static protected Integer sum(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    //1. final can't be overridden
    final void demo() {
        System.out.println("SuperClassExample Class Method");
    }

    //2. Arguments must be same
    Integer sum(int a, int b) {
        return a + b;
    }

    //3. The return type should be the same or a subtype of the return type declared
    // in the original overridden method in the super class.
    Integer sum(int a, int b, int c) {
        return a + b + c;
    }

    //4. The access level cannot be more restrictive than the overridden method’s access level.
    // For example: if the super class method is declared public then the overridding
    // method in the sub class cannot be either private or protected.
    // public, protected, default, private
    protected Integer sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    //7. An overriding method can throw any uncheck exceptions,
    // regardless of whether the overridden method throws exceptions or not.
    Integer sum(int a, int b, int c, int d, int e, int f) {
        return a + b + c + d + e + f;
    }

    //8. However the overriding method should not throw checked exceptions
    // that are new
    Integer sum(int a, int b, int c, int d, int e, int f, int g) {
        return a + b + c + d + e + f + g;
    }

    //9.or broader than the ones declared by the overridden method.
    Integer sum(int a, int b, int c, int d, int e, int f, int g, int h) throws FileNotFoundException {
        return a + b + c + d + e + f + g + h;
    }


}

public class SubClassExample extends SuperClassExample {

    //1.
/*
    void demo() {
		System.out.println("SubClassExample Class Method");
	}
*/

    //2.
/*
	@Override
	Integer sum(int a, int b, int c) {
		return a+b+b;
	}
*/

    //3.
/*
	@Override
	Number sum(int a, int b, int c) {
		return a+b+c;
	}
*/

    //4.
/*
	@Override
	Integer sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}
*/

    //6.
    //@Override
    public SubClassExample() {
        super();
    }


    //6.
/*
	@Override
	public SuperClassExample() {
	}
*/

    //5.
    //@Override
    static protected Integer sum(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    public static void main(String args[]) {
        SubClassExample obj = new SubClassExample();
        obj.demo();
    }

    //8.
/*
	@Override
	Integer sum(int a, int b, int c, int d, int e, int f, int g) throws FileNotFoundException {
		return super.sum(a, b, c, d, e, f, g);
	}
*/

    //9.
/*
	@Override
	Integer sum(int a, int b, int c, int d, int e, int f, int g, int h) throws IOException  {
		return a+b+c+d+e+f+g+h;
	}
*/

    //7.
    @Override
    Integer sum(int a, int b, int c, int d, int e, int f) throws ArrayIndexOutOfBoundsException {
        return a + b + c + d + e + f;
    }
}