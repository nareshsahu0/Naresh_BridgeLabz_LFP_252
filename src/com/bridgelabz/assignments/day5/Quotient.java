package com.bridgelabz.assignments.day5;

import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter two values");
        int x = in.nextInt();
        int y = in.nextInt();
        int temp = x;
        x = Math.max(x, y);
        y = Math.min(temp, y);
        System.out.println("Remainder = " + x % y);
        System.out.println("quotient = " + ((x - (x % y)) / y));
    }
}
