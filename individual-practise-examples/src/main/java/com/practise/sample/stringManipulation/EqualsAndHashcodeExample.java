package com.practise.sample.stringManipulation;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pratik Ambani on 26/11/2017.
 */
class Customer {
    private int customerID;
    private String firstName;
    private String lastName;

    public Customer(int customerID, String firstName, String lastName) {
        super();
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        if (customerID != customer.customerID) return false;
        if (!firstName.equals(customer.firstName)) return false;
        return lastName.equals(customer.lastName);

    }

    @Override
    public int hashCode() {
        int result = customerID;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }
}
public class EqualsAndHashcodeExample {

    public static void main(String[] args) {
        System.out.println("You must override hashCode() in every class that overrides equals(). Failure to do so will result in a violation " +
                "of the general contract for Object.hashCode(), which will prevent your class from functioning properly in conjunction with all" +
                " hash-based collections, including HashMap, HashSet, and Hashtable.");
        System.out.println("check difference in results between retaining and removing both methods");

        Map<Customer, String> m = new HashMap();
        Customer cust = new Customer(1, "Roger", "Cox");
        m.put(cust,"Roger Cox");
        // retrieving using another instance
        System.out.println(m.get(new Customer(1, "Roger", "Cox")));
        // retrieving using same instance
        System.out.println(m.get(cust));
    }
}