package com.sample.practise.oopsconcepts.relation.composition;

/**
 * Created by Pratik Ambani on 4/11/2017.
 */
public class Person {

    private Job job;

    public Person() {
        this.job = new  Job();
        job.setSalary(10000);
    }

    public long getSalary() {
        return job.getSalary();
    }
}
