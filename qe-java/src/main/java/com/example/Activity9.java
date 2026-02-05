package com.example;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Azam");
        list.add("Son");
        list.add("Messi");
        list.add("Ronaldo");
        list.add("Van Dijk");

        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("Third name in the list " + list.get(2));
        System.out.println("Is Messi in the list ? : " + list.contains("Messi"));
        System.out.println("List size before removing " + list.size());
        list.remove("Son");
        System.out.println("List size after removing " + list.size());
    }
}
