package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;
    int getNumberOfBeds() {
        return numberOfBeds;
    }
    double getPrice() {
        return price;
    }
    boolean isOccupied() {
        return "Occupied: " + occupied;
    }
    boolean isDirty() {
        return "Dirty: " + dirty;
    }
    boolean isAvailable() {
        return "Available: " + available;
    }
}
