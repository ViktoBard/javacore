package com.kitcenter.app.homework.lesson16;

/**
 * Created by Viktor on 01.07.2017.
 */
public class Tracktor extends Machine {
    public Tracktor(String name, int currentSpeed) {
        super(name, currentSpeed);
    }

    public int getSpeed() {
        return this.getCurrentSpeed();
    }

    public double getWeight() {
        return this.weight;
    }

    public int getPaxCount() {
        return this.paxCount;
    }

    public int getWheelsCount() {
        return this.wheelsCount;
    }

    @Override
    public String toString() {
        return "Vehicle name is: " + getName() + "\n" +
                "Current speed is: " + getSpeed() + "\n" +
                "Pax count is: " + getPaxCount() + "\n" +
                "Number of wheels: " + getWheelsCount() + "\n" +
                "Weight is: " + getWeight();
    }

    public void setWheelsCount(int wheelsNum) {
        this.wheelsCount = wheelsNum;
    }

    public void setPaxCount(int paxNum) {
        this.paxCount = paxNum;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}