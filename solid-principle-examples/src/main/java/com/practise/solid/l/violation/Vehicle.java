package com.practise.solid.l.violation;

/**
 * Created by Pratik Ambani on 18/02/2018.
 */
public class Vehicle {

    private Gear gear;

    public Gear getGear() {
        return gear;
    }

    public void changeGear(final Gear gear) {
        this.gear = gear;
    }

}
