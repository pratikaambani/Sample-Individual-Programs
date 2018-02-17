package com.sample.practise.stringManipulation;

public class MutabilityExample {
    public static void main(String[] args) {

        stringImmutability();

        classImmutability();

    }

    private static void classImmutability() {
        ImmutableClass immutableClass1 = new ImmutableClass(1, "Pratik", new Address("naroda", "India"));
        ImmutableClass immutableClass2 = new ImmutableClass(1, "Pratik", new Address("naroda", "India"));

        System.out.println("Reference Comparision: " + (immutableClass1 == immutableClass2));
        System.out.println("Value Comparision: " + (immutableClass1.equals(immutableClass2)));
    }

    private static void stringImmutability() {
        String name = "Pratik ";
        name.concat("Aniruddh");
        System.out.println("Name is - " + name);

        name = name.concat("Ambani");
        System.out.println(" Immutable Full Name is - " + name);
    }
}

final class ImmutableClass {
    private final int id;
    private final String name;
    private final Address address;

    public ImmutableClass(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}

class Address {

    private final String street;
    private final String county;

    public Address(String street, String county) {
        this.street = street;
        this.county = county;
    }

    public String getStreet() {
        return street;
    }

    public String getCounty() {
        return county;
    }
}