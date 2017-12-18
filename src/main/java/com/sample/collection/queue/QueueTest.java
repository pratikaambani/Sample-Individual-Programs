package com.sample.collection.queue;

import java.util.LinkedList;

/**
 * Created by Pratik Ambani on 18/12/2017.
 */
class Queue<E> {

    private LinkedList<E> list = new LinkedList<E>();

    public void enqueue(E item) {
        list.addLast(item);
    }

    public E dequeue() {
        return list.poll();
    }

    public boolean hasItems() {
        return !list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void addItems(Queue<? extends E> q) {
        while (q.hasItems()) list.addLast(q.dequeue());
    }
}

public class QueueTest {
    public static void main(String[] args) {
        Queue<Employee> empList;
        empList = new Queue<Employee>();
        Queue<HourlyEmployee> hList;

        hList = new Queue<HourlyEmployee>();
        hList.enqueue(new HourlyEmployee("T", "D"));
        hList.enqueue(new HourlyEmployee("G", "B"));
        hList.enqueue(new HourlyEmployee("F", "S"));
        empList.addItems(hList);
        System.out.println("The employees' names are:");

        while (empList.hasItems()) {
            Employee emp = empList.dequeue();
            System.out.println(emp.firstName + " " + emp.lastName);
        }
    }
}

class Employee {
    public String lastName;
    public String firstName;

    public Employee(String last, String first) {
        this.lastName = last;
        this.firstName = first;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}

class HourlyEmployee extends Employee {

    public HourlyEmployee(String last, String first) {
        super(last, first);
    }
}