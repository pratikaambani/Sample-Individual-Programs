package com.practise.sample.staticExample;

public class Student {
    static String college = "DPS";
    int rollno;
    String name;

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    public static void main(String args[]) {
        Student s1 = new Student(111, "A");
        Student s2 = new Student(222, "B");

        s1.display();
        s2.display();
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
