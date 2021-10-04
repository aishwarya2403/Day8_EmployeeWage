package com.bridgelab;

public class UC2 {
    private static int PRESENT=1;

    public static void main(String[] args){

        boolean isPresent = empCheck();
        if(isPresent){
            double wage = calculateWage(20,8);
            System.out.println("Employee is present");
            System.out.println("Total Employee Wage is: "+ wage);
        }else{
            System.out.println("Employee is absent");
            System.out.println("Total Employee Wage is: 0.0");
        }

    }
    public static boolean empCheck(){
        return PRESENT == Math.floor(Math.random() * 10) % 2;
    }
    public static double calculateWage(int ratePerHrs, int totalHrs){
        return ratePerHrs*totalHrs;
    }
}
