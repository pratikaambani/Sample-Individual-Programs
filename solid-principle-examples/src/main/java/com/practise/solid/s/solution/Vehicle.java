package com.practise.solid.s.solution;

/**
 * Created by Pratik Ambani on 17/02/2018.
 */
public class Vehicle {

    private final int maxFuel;
    private int remainingFuel;

    public Vehicle(int maxFuel, int remainingFuel) {
        this.maxFuel = maxFuel;
        this.remainingFuel = remainingFuel;
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
}
