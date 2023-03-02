package com.bridgelabz.assignments.day3;

public class EmpWageUC2 {
    public static void main(String[] args) {

        int Is_Full_Time = 1;
        int Emp_Rate_Per_Hr = 20;
        int empHrs = 0;
        int empWage = 0;
        double randomCheck = Math.floor(Math.random() * 10) % 2;

        if (randomCheck == Is_Full_Time)
            empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * Emp_Rate_Per_Hr;
        System.out.println("Employee wage is " + empWage);
    }
}
