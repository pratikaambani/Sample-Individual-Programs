package com.practise.solid.o.solution.mode;

/**
 * Created by Pratik Ambani on 17/02/2018.
 */
public class Comfort implements DrivingMode {

    private static final int POWER = 40;
    private static final int SUSPENSION_HEIGHT = 10;

    @Override
    public int getPower() {
        return POWER;
    }

    @Override
    public int getSuspensionHeight() {
        return SUSPENSION_HEIGHT;
    }
}
