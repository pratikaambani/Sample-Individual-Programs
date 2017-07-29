class SampleClass {

	public  SampleClass() {
		System.out.println("Sample Class Constructor");
	}

	int a = 0;
}

public  class ReflectionAPIClassclass {

	int a = 0;

	void printName(Object o) {
		Class c2 = o.getClass();

		System.out.println(c2.getName());
	}

	public  static void main(String args[]) throws ClassNotFoundException {

		int a = 0;

		// 1st
		Class c1 = Class.forName("SampleClass");
		System.out.println(c1.getSimpleName());
		System.out.println(c1.getName());

		SampleClass sC = new SampleClass();

		ReflectionAPIClassclass rClass = new ReflectionAPIClassclass();
		// 2nd
		String c2 = sC.getClass().getName();
		String c3 = rClass.getClass().getName();

		System.out.println();
		System.out.println();
		System.out.println(c2);
		System.out.println(c3);

		System.out.println();
		System.out.println();
		System.out.println();

		// 3rd
		System.out.println(boolean.class.getName());

		Class c5 = ReflectionAPIClassclass.class;
		System.out.println(c5.getName());

		Class c6 = SampleClass.class;
		System.out.println(c6.getName());

	}

}
