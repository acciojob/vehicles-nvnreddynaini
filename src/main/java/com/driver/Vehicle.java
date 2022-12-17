package com.driver;

public class Vehicle {

    private String name;
    public int currentSpeed;
    private int currentDirection;
    private int speed;
    private int direction;

    public Vehicle() {
        this.speed = 0;
        this.direction = 0;
    }

    public String getName() {
        return name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void steer(int direction){
        //direction is in degrees, add it to the current direction
        currentDirection = currentDirection + direction;
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
