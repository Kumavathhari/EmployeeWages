package EmployeeWage;

public class EmployeeWage {
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        public static final int EMP_RATE_PER_HOUR = 20;
        public static final int NUM_WORKING_DAYS = 20;

        static void CalculateEmployeeMonthWage() {
            int totalEmpWage = 0;

            for (int day = 1; day <= NUM_WORKING_DAYS; day++) {
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

                int empWage = empHrs * EMP_RATE_PER_HOUR;
                totalEmpWage += empWage;
                System.out.println("Day: " + day + " Emp Wage: " + empWage);
            }

            System.out.println("Total Emp Wage for " + NUM_WORKING_DAYS + " days: " + totalEmpWage);
        }



    public static void main(String[] args) {
        CalculateEmployeeMonthWage();
    }
}