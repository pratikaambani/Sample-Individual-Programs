class student {
	int id1;
	String name1;

	student(int id, String name) {
		id1 = id;
		name1 = name;
	}

	void display() {
		System.out.println(id1 + " " + name1);
	}

	public  static void main(String args[]) {
		student s1 = new student(234, "Pappu");
		student s2 = new student(432, "Feku");
		s1.display();
		s2.display();
	}
}