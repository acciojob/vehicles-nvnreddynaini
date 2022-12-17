package com.driver;

public class Vehicle {

    public String name;
    public int currentSpeed;
    private int currentDirection;
    private int speed;
    private int direction;

    public Vehicle(String name) {
        this.name = name;
        this.speed = 0;
        this.direction = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    public int getCurrentDirection() {
        return this.currentDirection;
    }

    public void steer(int direction){
        //direction is in degrees, add it to the current direction
        this.currentDirection = this.currentDirection + direction;
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop(){
        this.currentSpeed = 0;
        System.out.println("stop method called - The vehicle is stopped");
    }

}
