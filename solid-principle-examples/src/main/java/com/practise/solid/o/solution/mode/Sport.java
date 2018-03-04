package com.practise.solid.o.solution.mode;

/**
 * Created by Pratik Ambani on 17/02/2018.
 */
public class Sport implements DrivingMode {

    private static final int POWER = 459;
    private static final int SUSPENSION_HEIGHT = 90;

    @Override
    public int getPower() {
        return POWER;
    }

    @Override
    public int getSuspensionHeight() {
        return SUSPENSION_HEIGHT;
    }
}
