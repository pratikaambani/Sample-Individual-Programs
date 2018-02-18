package com.practise.doubts;

class Student {
	int id1;
	String name1;

	Student(int id, String name) {
		id1 = id;
		name1 = name;
	}

	void display() {
		System.out.println(id1 + " " + name1);
	}

	public static void main(String args[]) {
		Student s1 = new Student(234, "Pappu");
		Student s2 = new Student(432, "Feku");
		s1.display();
		s2.display();
	}
}