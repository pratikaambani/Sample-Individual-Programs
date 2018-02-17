package com.practise.solid.d.violation;

/**
 * Created by Pratik Ambani on 18/02/2018.
 */
public class RacingCar {
    private final int maxFuel;
    private int remainingFuel;
    private int power;

    public RacingCar(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    public void accelerate() {
        power++;
        remainingFuel--;
    }
}