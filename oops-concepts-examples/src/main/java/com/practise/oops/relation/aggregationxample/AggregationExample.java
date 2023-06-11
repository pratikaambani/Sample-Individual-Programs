package com.practise.oops.relation.aggregationxample;

/*
* Aggregation: Phone <-> Battery
* We call aggregation those relationships whose objects have an independent lifecycle,
* but there is ownership, and child objects cannot belong to another parent object.
*/
class Address {

    String city;
    String state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

public class AggregationExample {

    int id;
    String name;
    Address address;

    public AggregationExample(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String args[]) {

        Address a1 = new Address("Ahmedabad", "Fujarat", "India");
        Address a2 = new Address("NM", "Maha", "India");

        AggregationExample agEx = new AggregationExample(10, "Pratik", a2);

        agEx.display();
    }

    public void display() {
        System.out.println("ID = " + id + " and Name = " + name);
        System.out
                .println("City = " + address.city + " and State = " + address.state + " Country = " + address.country);
    }
}
