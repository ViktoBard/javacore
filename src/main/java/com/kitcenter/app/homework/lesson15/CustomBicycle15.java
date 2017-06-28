package com.kitcenter.app.homework.lesson15;

/**
 * Created by Viktor on 28.06.2017.
 */
public class CustomBicycle15 extends Bicycle15 {

    private int speed;
    private int gear;

    public void setSpeed(int speed){
        this.speed = speed;
        System.out.println("New speed is " + getSpeed());
    }
    public void setGear(int gear){
        this.gear = gear;
        System.out.println("New gear is " + getGear());
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    @Override
    public void ride(){
        System.out.println("Wshhhhh!");
    }
}
