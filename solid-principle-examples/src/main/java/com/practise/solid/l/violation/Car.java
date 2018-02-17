package com.practise.solid.l.violation;

/**
 * Created by Pratik Ambani on 18/02/2018.
 */
public class Car extends Vehicle {

    @Override
    public void changeGear(Gear gear) {
        if (Gear.REVERSE.equals(gear) && getGear().equals(Gear.DRIVE)) {
            throw new RuntimeException("Can't change to REVERSE gear when " + getGear().toString() + " gear is engaged!");
        }
    }
}
