package org.example;

public abstract class Elevator implements Elevator_Status {
    int currentFloor = 0;
    boolean isEmptyElevator = true;
    public boolean elevatorFree(){
        return isEmptyElevator;
    }
}
