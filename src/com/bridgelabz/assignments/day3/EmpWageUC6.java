package com.bridgelabz.assignments.day3;

public class EmpWageUC6 {
    public static final int Is_Part_Time = 1;
    public static final int IS_Full_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 10;

    public static void main(String args[]) {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalEmpWage = 0;
        int empWage = 0;
        int totalWorkingDays = 0;
        for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case Is_Part_Time:
                    empHrs = 4;
                    break;
                case IS_Full_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("Employee wages is:" + empWage);
        }
        System.out.println("Employee wages is:" + totalEmpWage);
    }
}
