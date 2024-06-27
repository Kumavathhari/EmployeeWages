package EmployeeWage;

public class EmployeeWage {
    public static int IS_PART_TIME = 1;
    public static int IS_FULL_TIME = 2;
    public static int EMP_RATE_PER_HOUR = 20;
    static void CalculatePartTimeWage(){
        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random()*10)%3;
        if (empCheck == IS_PART_TIME) {
            empHrs = 4;
        } else if (empCheck == IS_FULL_TIME){
            empHrs = 8;
        }else {
            empHrs =0;
        }
        empWage = empHrs*EMP_RATE_PER_HOUR;
        System.out.println("Part-Time Employee Wage : " + empWage);
    }

    public static void main(String[] args) {
        CalculatePartTimeWage();
    }
}