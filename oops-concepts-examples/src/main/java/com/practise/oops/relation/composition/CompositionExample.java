package com.practise.oops.relation.composition;

/**
 * Created by Pratik Ambani on 4/11/2017.
 */
public class CompositionExample {

    public static void main(String[] args) {

        Person person = new Person();

        long salary = person.getSalary();

        System.out.println("salary: " +salary);

    }
}
