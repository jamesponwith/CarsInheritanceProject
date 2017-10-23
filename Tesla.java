package com.booya;

public class Tesla extends ElectricCars {
    private int selfDriving;
    private int computerDash;
    private int bestCar;

    public Tesla(int wheels, String powerSource, int timeToCharge, int soundItMakes, int selfDriving, int computerDash, int bestCar) {
        super("Teslas", wheels, powerSource, timeToCharge, soundItMakes);
        this.selfDriving = selfDriving;
        this.computerDash = computerDash;
        this.bestCar = bestCar;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0) {
            stop();
        }
        else if(newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        }
        else if(newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        }
        else if(newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        }
        else {
            changeGear(4);
        }
        if(newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }

    public int getSelfDriving() {
        return selfDriving;
    }

    public int getComputerDash() {
        return computerDash;
    }

    public int getBestCar() {
        return bestCar;
    }
}
