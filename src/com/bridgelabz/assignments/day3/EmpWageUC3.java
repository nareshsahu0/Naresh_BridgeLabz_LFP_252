package com.bridgelabz.assignments.day3;

public class EmpWageUC3 {
    public static void main(String[] args) {
        int Is_Part_Time = 1;
        int Is_Full_Time = 2;
        int Emp_Rate_Per_Hr = 20;
        int empHrs = 0;
        int empWage = 0;
        double randomCheck = Math.floor(Math.random() * 10) % 3;
        if (randomCheck == Is_Part_Time)
            empHrs = 4;
        else if (randomCheck == Is_Full_Time)
            empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * Emp_Rate_Per_Hr;
        System.out.println("employeee wages is " + empWage);


    }
}
