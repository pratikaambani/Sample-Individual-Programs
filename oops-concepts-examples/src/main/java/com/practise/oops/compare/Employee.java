package com.practise.oops.compare;

import java.util.Comparator;

/**
 * Created by Pratik Ambani on 24/11/2017.
 */
public class Employee implements Comparable<Employee> {

    public static Comparator<Employee> salaryComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (int) (o1.getSalary() - o2.getSalary());
        }
    };
    public static Comparator<Employee> idComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (o1.getId() - o2.getId());
        }
    };
    public static Comparator<Employee> ageComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (o1.getAge() - o2.getAge());
        }
    };
    private int id;
    private String name;
    private int age;
    private long salary;

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }

    private String g(int a, String b) {
        return null;
    }

    private String gg(int a, float b) {
        return null;
    }

    private String ggg(String a, float b) {
        return null;
    }


}
