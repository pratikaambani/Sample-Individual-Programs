package com.sample.singleprograms.compare;

import java.util.Arrays;

/**
 * Created by Pratik Ambani on 24/11/2017.
 */
public class InvalidComparable {
    public static void main(String[] args) {

        InvalidEmployee[] empArr = new InvalidEmployee[4];
        empArr[0] = new InvalidEmployee(10, "Mikey", 25, 10000);
        empArr[1] = new InvalidEmployee(20, "Arun", 29, 20000);
        empArr[2] = new InvalidEmployee(5, "Lisa", 35, 5000);
        empArr[3] = new InvalidEmployee(1, "Pankaj", 32, 50000);

        Arrays.sort(empArr);
        System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));
    }
}
