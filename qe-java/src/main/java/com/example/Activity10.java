package com.example;

import java.util.*;
import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("Car");
        hs.add("Bike");
        hs.add("Bus");
        hs.add("Autorickshaw");
        hs.add("Bicycle");
        hs.add("Truck");

        System.out.println("The size of the hashset is : " + hs.size());

        System.out.println("The bus is removed from the set : " + hs.remove("Bus"));

        System.out.println("The element which is not in the set removing, is that possible? : " + hs.remove("Plane"));

        System.out.println("Does the set contains car : " + hs.contains("Car"));

        for (String s : hs) {
            System.out.println(s);
        }

    }
}
