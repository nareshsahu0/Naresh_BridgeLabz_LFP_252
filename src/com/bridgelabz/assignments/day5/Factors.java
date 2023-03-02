package com.bridgelabz.assignments.day5;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = in.nextInt();
        System.out.print(1);
        for (int i = 2; i < n; i++) {
            if (n % i == 0 && prime(i)) {
                System.out.print(" , " + i);
            }
        }
    }

    public static boolean prime(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

}