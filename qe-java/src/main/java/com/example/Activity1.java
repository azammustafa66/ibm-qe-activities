package com.example;

class Car {
    String name;
    String colour;
    String transmission;
    int make;
    int tyres;
    int doors;

    Car(String name, String colour, String transmission, int make) {
        this.name = name;
        this.colour = colour;
        this.transmission = transmission;
        this.make = make;
        this.tyres = 4;
        this.doors = 4;
    }

    void displayCharactersitics() {
        System.out.printf("Name: %s\nColour: %s\nTransmission: %s\nMake: %d\nTyres: %d\nDoors: %d\n", name, colour,
                transmission, make, tyres, doors);
    }

    void accelerate() {
        System.out.println("Car is moving forward");
    }

    void brake() {
        System.out.println("Car has stopped moving");
    }
}

public class Activity1 {
    public static void main(String[] args) {
        Car car = new Car("i20", "Black", "Manual", 2023);
        car.displayCharactersitics();
        car.accelerate();
        car.brake();
    }
}
