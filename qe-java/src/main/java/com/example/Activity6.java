package com.example;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.lang.Thread;

class Plane {
    private int maxPassengers;
    private ArrayList<Character> passengers;
    private LocalDateTime lastTimeLanded;
    private LocalDateTime lastTimeTookOff;

    Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    private void add(Character ch) {
        if (passengers.size() >= maxPassengers) {
            System.out.println("Max passengers on board ! No more space");
        } else {
            this.passengers.add(ch);
        }
    }

    public void onBoard(Character ch) {
        add(ch);
    }

    public LocalDateTime takeOff() {
        this.lastTimeTookOff = LocalDateTime.now();
        return lastTimeTookOff;
    }

    public LocalDateTime land() {
        this.lastTimeLanded = LocalDateTime.now();
        passengers.clear();
        return this.lastTimeLanded;
    }

    public LocalDateTime getLastTimeLanded() {
        return this.lastTimeLanded;
    }

    public LocalDateTime getLastTimeTookOff() {
        return this.lastTimeTookOff;
    }

    public ArrayList<Character> getPassengers() {
        return this.passengers;
    }
}

public class Activity6 {
    public static void main(String[] args) {
        Plane plane = new Plane(10);

        for (int i = 0; i < 5; i++) {
            char ch = (char) ('A' + i);
            plane.onBoard(ch);
        }
        System.out.println("Take Off Time " + plane.takeOff());
        ArrayList<Character> passengers = plane.getPassengers();
        for (char ch : passengers) {
            System.out.println(ch);
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Landing Time: " + plane.land());
    }
}
