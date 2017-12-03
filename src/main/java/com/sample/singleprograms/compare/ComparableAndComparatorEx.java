package com.sample.singleprograms.compare;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Pratik Ambani on 24/11/2017.
 */
public class ComparableAndComparatorEx {
    public static void main(String[] args) {
        Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(10, "Mikey", 25, 10000);
        empArr[1] = new Employee(20, "Arun", 29, 20000);
        empArr[2] = new Employee(5, "Lisa", 35, 5000);
        empArr[3] = new Employee(1, "Pankaj", 32, 50000);

        //sorting employees array using Comparable interface implementation
        Arrays.sort(empArr);
        System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));

        Arrays.sort(empArr,Employee.ageComparator);
        System.out.println("Employees list sorted by Age:\n"+Arrays.toString(empArr));

        Arrays.sort(empArr,Employee.idComparator);
        System.out.println("Employees list sorted by id:\n"+Arrays.toString(empArr));

        Arrays.sort(empArr,Employee.salaryComparator);
        System.out.println("Employees list sorted by Salary:\n"+Arrays.toString(empArr));

    }

}