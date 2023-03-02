package com.bridgelabz.assignments.day3;

public class EmpWageUC4 {

    public static final int Is_Part_Time = 1;
    public static final int Is_Full_Time = 2;
    public static final int Emp_Rate_Per_Hr = 20;


    public static void main(String[] args) {
        int empHrs = 0;
        int empWage = 0;
        int randomCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (randomCheck) {
            case Is_Part_Time:
                empHrs = 4;
                break;

            case Is_Full_Time:
                empHrs = 8;
                break;

            default:
                empHrs = 0;
        }
        empWage = empHrs * Emp_Rate_Per_Hr;
        System.out.println("Employee wages " + empWage);
    }
}
