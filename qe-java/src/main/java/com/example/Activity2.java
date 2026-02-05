package com.example;

public class Activity2 {
    static boolean checkSum(int[] list) {
        int sum = 0;
        for (int num : list) {
            if (num == 10) {
                sum += num;
            }
        }
        return sum == 30 ? true : false;
    }

    public static void main(String[] args) {
        int[] list = { 10, 77, 10, 54, -11, 10 };
        boolean res = checkSum(list);
        System.out.println(res);
    }
}