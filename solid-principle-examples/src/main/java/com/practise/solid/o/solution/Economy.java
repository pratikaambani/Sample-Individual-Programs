package com.practise.solid.o.solution;

/**
 * Created by Pratik Ambani on 17/02/2018.
 */
public class Economy implements DrivingMode {

    private static final int POWER = 30;
    private static final int SUSPENSION_HEIGHT = 20;

    @Override
    public int getPower() {
        return POWER;
    }

    @Override
    public int getSuspensionHeight() {
        return SUSPENSION_HEIGHT;
    }
}
