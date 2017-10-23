package com.booya;

public class Vehicle {

    private String typeOfVehicle;
    private String steering;
    private int wheels;
    private String powerSource;

    private int currentDirection;
    private int currentVelocity;

    public Vehicle(String typeOfVehicle, String steering, int wheels, String powerSource) {
        this.typeOfVehicle = typeOfVehicle;
        this.steering = steering;
        this.wheels = wheels;
        this.powerSource = powerSource;
        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle changing steering at " + currentDirection + " degrees.");
    }

    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle is moving at " + velocity + " in direction " + direction);
    }

    public void start() {
        System.out.println("Vehicle turns on");
    }

    public void stop() {
        this.currentVelocity = 0;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public String getSteering() {
        return steering;
    }

    public int getWheels() {
        return wheels;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }
}
