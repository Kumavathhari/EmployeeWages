package EmployeeWage;

public class EmployeeWage {
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        public static final int EMP_RATE_PER_HOUR = 20;
        public static final int NUM_WORKING_DAYS = 20;

        public static final int MAX_HRS_IN_MONTH = 100;

    static void EmployeeMonthDaysTillReached() {
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        int totalEmpWage = 0;

        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS) {
            int empHrs = 0;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }

            totalEmpHrs += empHrs;
            totalWorkingDays++;

            int empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;

            System.out.println("Day: " + totalWorkingDays + " Emp Hours: " + empHrs + " Emp Wage: " + empWage);
        }

        System.out.println("Total Emp Wage for " + totalWorkingDays + " days and " + totalEmpHrs + " hours: " + totalEmpWage);
    }



    public static void main(String[] args) {
        EmployeeMonthDaysTillReached();
    }
}