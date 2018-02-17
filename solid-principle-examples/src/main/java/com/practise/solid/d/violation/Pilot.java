package com.practise.solid.d.violation;

/**
 * Created by Pratik Ambani on 18/02/2018.
 */
public class Pilot {

    private RacingCar vehicle;

    public Pilot() {
        this.vehicle = new RacingCar(100);
    }

    public void increaseSpeed() {
        vehicle.accelerate();
    }
}
