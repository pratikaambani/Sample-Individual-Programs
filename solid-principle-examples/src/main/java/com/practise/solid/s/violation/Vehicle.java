package com.practise.solid.s.violation;

/**
 * Created by Pratik Ambani on 17/02/2018.
 */
public class Vehicle {

    private final int maxFuel;
    private int remainingFuel;

    public Vehicle(int maxFuel, int remainingFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    // this is not a car's responsibility.
    public void reFuel() {
        remainingFuel = maxFuel;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public void setRemainingFuel(int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }

    public void accelerate() {
        remainingFuel--;
    }

}
