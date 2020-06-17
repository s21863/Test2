package com.company;

public class Plane extends Vehicle implements Flying {
    public Plane(double tankCapacity, double loadingSpace) {
        super(tankCapacity, loadingSpace);
    }

    private double maxSpeed;

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Plane(double tankCapacity, double loadingSpace, double maxSpeed) {
        super(tankCapacity, loadingSpace);
        this.maxSpeed = maxSpeed;
    }
}
