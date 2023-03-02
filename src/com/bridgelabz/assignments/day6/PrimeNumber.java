package com.bridgelabz.assignments.day6;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int temp;
        boolean isPrime = true;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int num = input.nextInt();
        input.close();

        for (int i = 2; i <= num / 2; i++) {
            temp = num / i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
            System.out.println(num + " is prime number");
        }
    }
}
