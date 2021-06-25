package com.java7;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//Try this example by adding and removing the hashcode method
public class HashcodeAndEquals {
    public static void main(String[] args) {

        //equals() significance
//        1. Remove equals() from Teacher class and observe output from below method
//        equals();


//        2. Remove hashCode() from Employee class and observe output from below method
//        hashcode();
    }

    private static void equals() {
        Teacher firstTeacher = new Teacher("Pratik", 100);
        Teacher secondTeacher = new Teacher("Pratik", 100);
        System.out.println(firstTeacher);
        System.out.println(secondTeacher);
        System.out.println(firstTeacher.equals(secondTeacher));
    }

    private static void hashcode() {
        Map<Employee, String> empMap = new HashMap<>();

        Employee emp1 = new Employee("John", 23, "Bangalore");
        empMap.put(emp1, "John details");

        Employee emp2 = new Employee("Max", 29, "Chennai");
        empMap.put(emp2, "Max details");

        System.out.println(emp1);
        System.out.println(emp2);

        Employee emp3 = new Employee("John", 23, "Bangalore");
        System.out.println(emp3);
        System.out.println(empMap.get(emp3));
    }
}

class Teacher {
    private final String name;
    private final int salary;

    public Teacher(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return salary == teacher.salary && name.equals(teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }
}

class Employee {
    private final String name;
    private final int age;
    private final String address;

    public Employee(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                name.equals(employee.name) &&
                address.equals(employee.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address);
    }
}