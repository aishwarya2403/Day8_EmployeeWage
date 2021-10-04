package com.bridgelab;

public class UC3 {
    static final int FULL_TIME=1;
    static final int PART_TIME=2;

    public static void main(String[] args){

        final double isPresent = empCheck();
        if(isPresent == 1){
            final double wage = calculateWage(20, 8);
            System.out.println("Employee is present full time.");
            System.out.println("Total Employee Wage is: "+ wage);
        }
        else if(isPresent == 2){
            final double wage = calculateWage(20, 4);
            System.out.println("Employee is present half time");
            System.out.println("Total Employee Wage is: "+ wage);
        }
        else{
            System.out.println("Employee is absent");
            System.out.println("Total Employee Wage is: 0.0");
        }

    }
    public static double empCheck(){
        double PRESENT = Math.floor(Math.random() * 10) % 3;
        return PRESENT;
    }
    public static double calculateWage(final int ratePerHrs, final int totalHrs){
        return ratePerHrs*totalHrs;
    }
}
