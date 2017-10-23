package com.booya;

public class ElectricCars extends Vehicle {

    private int timeToCharge;
    private int soundItMakes;
    private int currentGear;


    public ElectricCars(String typeOfVehicle, int wheels, String powerSource, int timeToCharge, int soundItMakes) {
        super(typeOfVehicle, "steering wheel", wheels, powerSource);
        this.timeToCharge = timeToCharge;
        this.soundItMakes = soundItMakes;
        this.currentGear = 1;
    }

    public void changeVelocity(int speed, int direction) {

        move(speed, direction);
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Changed to " + this.currentGear + " gear.");
    }

    @Override
    public void stop() {
        super.stop();
    }

    public int getTimeToCharge() {
        return timeToCharge;
    }

    public int getSoundItMakes() {
        return soundItMakes;
    }
}
