package com.practise.temp;

import java.util.*;

class Employees {
    private final int id;
    private final String name;

    public Employees(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return id == employees.id &&
                name.equals(employees.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class SampleHashSet {

    public static void main(String[] args) {


        String s1 = "Java";
        s1 = s1.concat(" Rules!");
        System.out.println("s1 : " + s1);
        s1.toLowerCase();
        System.out.println("s1 : " + s1);

        Employees e1 = new Employees(1, "test1");
        Employees e2 = new Employees(1, "test1");
        Set<Employees> set = new HashSet<Employees>();
        set.add(e1);
        set.add(e2);
        System.out.println("set size is : " + set.size());

        Map mm = new HashMap();
        mm.put("p", "a");
        mm.put("p", "m");

        Set ss = new HashSet();
        ss.add("Pratik");
        ss.add("Pratik");
        ss.add("Ramesh");
        ss.add("null");
        ss.size();

        ss.stream().sorted().forEach(System.out::println);
    }

}
