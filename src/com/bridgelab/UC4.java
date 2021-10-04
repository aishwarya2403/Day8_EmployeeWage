package com.bridgelab;

public class UC4 {
    static  int FULL_TIME=1;
    static  int PART_TIME=2;

    public static void main(String[] args){

        final int isPresent = empCheck();
        switch(isPresent){
            case 1 :{ // cc-bbc   case colon bracket break colon
                final double wage = calculateWage(20, 8);
                System.out.println("Employee is present for full time");
                System.out.println("Total Employee Wage for full time is: "+ wage);
            }break;
            case 2 :{
                final double wage = calculateWage(20, 4);
                System.out.println("Employee is present for part time");
                System.out.println("Total Employee Wage for part time is: "+ wage);
            }break;
            default :{
                System.out.println("Employee is absent");
                System.out.println("Total Employee Wage is: 0");
            }break;
        }
    }
    public static int empCheck(){

        final int PRESENT = (int)Math.floor(Math.random() * 10) % 3;
        return PRESENT;
    }
    public static double calculateWage(final int ratePerHrs, final int totalHrs){
        return ratePerHrs*totalHrs;
    }

}
