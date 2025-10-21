package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    private final String ALREADY_OCCUPIED = "This room is already occupied.";
    private final String ALREADY_UNOCCUPIED = "This room is already unoccupied.";

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false; // Starts Unoccupied
        this.isDirty = false; //Starts Clean
        this.isAvailable = true; // Starts Available
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        // A room is available only if it is unoccupied AND not dirty
        return !isOccupied && !isDirty;
    }

    public void checkIn() {
        if (isAvailable()) {
            this.isOccupied = true;
            this.isDirty = true; //Room is dirty because of check-in
            this.isAvailable = false;
            System.out.println("This room is now checked in.");
        } else if (isOccupied) {
            System.out.println(ALREADY_OCCUPIED);
        } else {
            System.out.println("This room is dirty.");
        }

    }

    public void checkOut() {
        if (isOccupied) {
            this.isOccupied = false;
            this.isAvailable = false;
            System.out.println("This room is now checked out.");
        } else {
            System.out.println(ALREADY_UNOCCUPIED);
        }
    }

    public void cleanRoom() {
        if (!isOccupied && isDirty) {
            this.isDirty = false;
            this.isAvailable = true;
            System.out.println("This room is now clean and can be checked out.");
        } else if (isOccupied) {
            System.out.println(ALREADY_OCCUPIED);
        } else {
            System.out.println("This room is already clean.");
        }
    }


}
