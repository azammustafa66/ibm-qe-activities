
package com.example;

import java.util.*;

public class Activity13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Random index : value");
        for (int i = 0; i < n; i++) {
            int idx = rand.nextInt(0, n);
            System.out.println(idx + " : " + nums[idx]);
        }
    }
}
