package com.practise.solid.i.solution;

/**
 * Created by Pratik Ambani on 18/02/2018.
 */
public abstract class Vehicle implements EngineSwitch {

    private boolean engineRunning;

    public boolean isEngineRunning() {
        return engineRunning;
    }

    @Override
    public void startEngine() {
        engineRunning = true;
    }

    @Override
    public void shutDownEngine() {
        engineRunning = false;
    }

}