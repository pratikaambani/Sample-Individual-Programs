package com.sample.staticExample;

class Static_Student {
	int rollno;
	String name;
	static String college = "DPS";

	Static_Student(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

	public  static void main(String args[]) {
		Static_Student s1 = new Static_Student(111, "A");
		Static_Student s2 = new Static_Student(222, "B");

		s1.display();
		s2.display();
	}
}
