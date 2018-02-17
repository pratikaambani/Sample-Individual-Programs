package com.practise.oops.clone;

/**
 * Created by Pratik Ambani on 1/01/2018.
 */


class Course {

    String subject1;
    String subject2;
    String subject3;

    public Course(String subject1, String subject2, String subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
}

class Student implements Cloneable {

    int id;
    Course course;
    String country;

    public Student(int id, String country, Course course) {
        this.id = id;
        this.course = course;
        this.country = country;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ShallowCloning {
    public static void main(String[] args) {
        Course science = new Course("Physics", "Chemistry", "Biology");

        Student pratik = new Student(1, "India", science);
        Student vishal = null;

        try {
            vishal = (Student) pratik.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("sub of Pratik initially: " + pratik.course.subject3);
        System.out.println("sub of Vishal initially: " + vishal.course.subject3);

        System.out.println("Modifying Vishal's value");
        vishal.course.subject3 = "Maths";

        System.out.println("sub of Pratik after modification: " + pratik.course.subject3);
        System.out.println("sub of Vishal after modification: " + vishal.course.subject3);
    }
}

