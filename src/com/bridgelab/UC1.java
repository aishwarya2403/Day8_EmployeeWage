/*Check Employee is
*Present or Absent
* Use ((RANDOM)) for Attendance
*Check
**/
package com.bridgelab;

public class UC1 {
    static int is_full_time = 1;
    public static void  main(String[] args) {
        empcheck();
    }
    public static void  empcheck(){
        double random = Math.floor(Math.random()*10)%2;
        System.out.println(random);
        if (is_full_time == random){
            System.out.println("employee is present");

        }
        else {
            System.out.println("employee is absent");

        }
    }

}
