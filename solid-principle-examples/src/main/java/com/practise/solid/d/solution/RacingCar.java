package com.practise.solid.d.solution;

/**
 * Created by Pratik Ambani on 18/02/2018.
 */
public class RacingCar implements Vehicle {

    private final int maxFuel;
    private int remainingFuel;
    private int power;

    public RacingCar(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    @Override
    public void accelerate() {
        power++;
        remainingFuel--;
    }
}