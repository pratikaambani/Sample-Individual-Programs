package com.practise.solid.d.solution;

/**
 * Created by Pratik Ambani on 18/02/2018.
 */
public class Driver {

    private Vehicle vehicle;

    public Driver(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void increaseSpeed() {
        vehicle.accelerate();
    }
}
