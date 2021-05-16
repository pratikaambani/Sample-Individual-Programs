package com.practise.solid.o.violation;

/**
 * Created by Pratik Ambani on 17/02/2018.
 */
public class EventHandler {

    private Vehicle vehicle;

    public EventHandler(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void changeDrivingMode(final DrivingMode drivingMode) {
        switch (drivingMode) {
            case SPORT:
                vehicle.setPower(500);
                vehicle.setPower(10);
                break;
            case COMFORT:
                vehicle.setPower(400);
                vehicle.setSuspensionHeight(20);
                break;
            default:
                vehicle.setPower(300);
                vehicle.setSuspensionHeight(30);
                break;
            // when we need to add another drivingMode, (e.g. ECONOMY) 2 classes will change: DrivingMode and EventHandler.
        }
    }


}
