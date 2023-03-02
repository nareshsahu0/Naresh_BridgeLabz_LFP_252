package com.bridgelabz.assignments.day5;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x value");
        int x = in.nextInt();
        System.out.println("Enter y value");
        int y = in.nextInt();
        int i = y;
        y = x;
        System.out.println("x value is :" + i + "     y value is :" + y);
    }

}
