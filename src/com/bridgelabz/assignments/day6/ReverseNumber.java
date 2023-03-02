package com.bridgelabz.assignments.day6;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 0;
        int reverse = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        num = input.nextInt();
        input.close();
        while (num != 0) {
            reverse = reverse * 10;
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("reverse number is " + reverse);
    }
}
