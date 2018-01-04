package com.sample.practise.oopsconcepts.clone;

/**
 * Created by Pratik Ambani on 1/01/2018.
 */
class Courses implements Cloneable{

    String subject1;
    String subject2;
    String subject3;

    public Courses(String subject1, String subject2, String subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Students implements Cloneable {

    int id;
    Courses courses;
    String country;

    public Students(int id, String country, Courses courses) {
        this.id = id;
        this.courses = courses;
        this.country = country;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Students students = (Students) super.clone();
        students.courses = (Courses) courses.clone();
        return students;
    }
}

public class DeepCloning {
    public static void main(String[] args) {
        Courses science = new Courses("Physics", "Chemistry", "Biology");

        Students pratik = new Students(1, "India", science);
        Students vishal = null;

        try {
            vishal = (Students) pratik.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("sub of Pratik initially: " +pratik.courses.subject3);
        System.out.println("sub of Vishal initially: " +vishal.courses.subject3);

        System.out.println("Modifying Vishal's value");
        vishal.courses.subject3 = "Maths";

        System.out.println("sub of Pratik after modification: " +pratik.courses.subject3);
        System.out.println("sub of Vishal after modification: " +vishal.courses.subject3);
    }
}

