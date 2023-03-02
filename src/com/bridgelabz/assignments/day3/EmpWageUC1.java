package com.bridgelabz.assignments.day3;

public class EmpWageUC1 {
    public static void main(String[] args) {
        int Is_full_Time = 1;

        double randomCheck = Math.floor(Math.random() * 10) % 2;
        if (randomCheck == Is_full_Time)
            System.out.println("employee is present");
        else
            System.out.println("employee is not present");
    }
}
