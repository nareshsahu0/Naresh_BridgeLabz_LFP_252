package com.bridgelabz.assignments.day5;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int input = in.nextInt();
        if (input % 2 == 0) {
            System.out.println(input + " is a even number");
        } else {
            System.out.println(input + " is a odd number.");
        }
    }

}


