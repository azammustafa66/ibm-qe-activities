package com.example;

public class Activity12 {
    public static void main(String[] args) {
        Adable ad1 = (a, b) -> System.out.println((a + b));
        ad1.add(12, 12);

        Adable ad2 = (int a, int b) -> {
            System.out.println(a + b);
        };
        ad2.add(12, 22);
    }
}
