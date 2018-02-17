package com.practise.solid.i.solution;

/**
 * Created by Pratik Ambani on 18/02/2018.
 */
public class Car extends Vehicle implements RadioSwitch {

    private boolean radioOn;

    public boolean isRadioOn() {
        return radioOn;
    }

    @Override
    public void turnRadioOn() {
        radioOn = true;
    }

    @Override
    public void turnRadioOff() {
        radioOn = false;
    }

}