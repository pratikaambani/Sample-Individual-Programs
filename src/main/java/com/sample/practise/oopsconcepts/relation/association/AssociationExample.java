package com.sample.practise.oopsconcepts.relation.association;

/**
 * Created by Pratik Ambani on 20/11/2017.
 */
public class AssociationExample {
//class Transport Company
    public static void main(String[] args) {
        Driver driverObject = new Driver("Salaam Saab", "i20", 8605);
        System.out.println("Name: " +driverObject.driverName+ " and " +
                "Car Name: " +driverObject.carName+ " and No: " +driverObject.carNo);
    }
}

/*
Association: Teacher <-> Student
We call association those relationships whose objects have an independent lifecycle and where there is no ownership between the objects.
*/

/*
Aggregation: Phone <-> Battery
We call aggregation those relationships whose objects have an independent lifecycle, but there is ownership, and child objects cannot belong to another parent object.
*/

/*
Composition: Question <-> Answer
We use the term composition to refer to relationships whose objects don’t have an independent lifecycle, and if the parent object is deleted, all child objects will also be deleted.
*/


class CarClass {
    String carName;
    int carNo;

    public CarClass(String carName, int carNo) {
        this.carName = carName;
        this.carNo= carNo;
    }
}

class Driver extends CarClass{
    String driverName;

    public Driver(String driverName, String carName, int carNo) {
        super(carName, carNo);
        this.driverName = driverName;
    }

}