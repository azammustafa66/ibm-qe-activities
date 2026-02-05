package com.example;

import java.util.*;

public class Activity3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        double seconds = sc.nextDouble();

        double earthYear = 31557600;
        double mercury = 0.2408467;
        double venus = 0.61519726;
        double mars = 1.8808158;
        double jupiter = 11.862615;
        double saturn = 29.447498;
        double uranus = 84.016846;
        double neptune = 164.79132;

        double ageOnEarth = seconds / earthYear;

        System.out.println("Age on Earth   : " + ageOnEarth);
        System.out.println("Age on Mercury : " + ageOnEarth / mercury);
        System.out.println("Age on Venus   : " + ageOnEarth / venus);
        System.out.println("Age on Mars    : " + ageOnEarth / mars);
        System.out.println("Age on Jupiter : " + ageOnEarth / jupiter);
        System.out.println("Age on Saturn  : " + ageOnEarth / saturn);
        System.out.println("Age on Uranus  : " + ageOnEarth / uranus);
        System.out.println("Age on Neptune : " + ageOnEarth / neptune);

        sc.close();
    }
}
