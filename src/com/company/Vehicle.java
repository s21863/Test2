package com.company;

public abstract class Vehicle implements StartStop {
    private double tankCapacity;
    private double maxTankCapacity;
    private double loadingSpace;
    private boolean engine;

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getLoadingSpace() {
        return loadingSpace;
    }

    public void setLoadingSpace(double loadingSpace) {
        this.loadingSpace = loadingSpace;
    }

    public Vehicle(double tankCapacity, double loadingSpace) {
        this.tankCapacity = tankCapacity;
        this.loadingSpace = loadingSpace;
    }

    public void engineOff() {
        this.engine = false;

    }

    public void engineOn() {
        this.engine = true;
    }

    public void displayEngineOn(boolean engine) {
        if (engine = true) {
            System.out.println("Engine is on");
        }
    }

    public void displayEngineOff(boolean engine) {
        if (engine = false) {
            System.out.println("Engine is off");
        }
    }

    public void displayTankCapacityInfo(double tankCapacity, double maxTankCapacity) {
        if (tankCapacity == maxTankCapacity) {
            this.engine = false;
        }
    }
}
