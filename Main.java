package com.booya;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Vehicle", "Steering method", 4, "Power Source");
        System.out.println(vehicle.getTypeOfVehicle());

        ElectricCars electricCars = new ElectricCars("Electric", 4, "electric motor", 5, 0);
        System.out.println(electricCars.getTimeToCharge());
        System.out.println("Electric cars are " + electricCars.getTypeOfVehicle());

        Tesla teslaX = new Tesla(4, "Electric motor", 3, 0, 1, 1, 1);
        System.out.println("Tesla cars are " + teslaX.getTypeOfVehicle());
        System.out.println("Tesla cars have " + teslaX.getSelfDriving() + " self driving system.");
        System.out.println(teslaX.getBestCar());
    }
}
