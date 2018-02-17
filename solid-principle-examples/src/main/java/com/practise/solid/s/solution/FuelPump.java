package com.practise.solid.s.solution;

/**
 * Created by Pratik Ambani on 17/02/2018.
 */
public class FuelPump {

    public void reFuel(final Vehicle vehicle) {
        final int remainingFuel = vehicle.getRemainingFuel();
        final int additionalFuel = vehicle.getMaxFuel() - remainingFuel;
        vehicle.setRemainingFuel(remainingFuel + additionalFuel);
    }

}
