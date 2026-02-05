package com.example;

import java.util.*;

public class Activity11 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Black");
        map.put(2, "Brown");
        map.put(3, "Yellow");
        map.put(4, "Green");
        map.put(5, "Pink");

        map.remove(3);

        System.out.println("Does the map Contains Green ? : " + map.containsValue("Green"));
        System.out.println("The size of the map is : " + map.size());
    }
}
