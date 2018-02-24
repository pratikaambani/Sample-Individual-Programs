package com.practise.oops.relation.association;

/**
 * Created by Pratik Ambani on 20/11/2017.
 */
public class AssociationExample {

    /*
    * Association: Teacher <-> Student
    * We call association those relationships whose objects have an independent lifecycle and where there is no ownership between the objects.
    */

    //class Transport Company
    public static void main(String[] args) {
        Driver driverObject = new Driver("Salaam Saab", "i20", 8605);
        System.out.println("Name: " + driverObject.driverName + " and " +
                "Car Name: " + driverObject.carName + " and No: " + driverObject.carNo);
    }
}

class Car {
    String carName;
    int carNo;

    public Car(String carName, int carNo) {
        this.carName = carName;
        this.carNo = carNo;
    }
}

class Driver extends Car {
    String driverName;

    public Driver(String driverName, String carName, int carNo) {
        super(carName, carNo);
        this.driverName = driverName;
    }

}