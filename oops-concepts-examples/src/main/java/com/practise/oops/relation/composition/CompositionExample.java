package com.practise.oops.relation.composition;

/**
 * Created by Pratik Ambani on 4/11/2017.
 */
/*
* Composition: Question <-> Answer
* We use the term composition to refer to relationships whose objects don’t have an independent lifecycle,
* and if the parent object is deleted, all child objects will also be deleted.
*/
public class CompositionExample {

    public static void main(String[] args) {

        Person person = new Person();

        long salary = person.getSalary();

        System.out.println("salary: " + salary);

    }
}
