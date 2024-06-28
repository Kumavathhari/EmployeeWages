package EmployeeWage;

public class EmployeeWage {
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
    public void MultipleCompany(String companyName, int empRatePerHour, int numWorkingDays, int maxHrsInMonth) {
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        int totalEmpWage = 0;

        while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays < numWorkingDays) {
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

            int empWage = empHrs * empRatePerHour;
            totalEmpWage += empWage;

            System.out.println("Company: " + companyName + " | Day: " + totalWorkingDays + " | Emp Hours: " + empHrs + " | Emp Wage: " + empWage);
        }

        System.out.println("Total Emp Wage for company: " + companyName + " is " + totalEmpWage);
    }



        public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.MultipleCompany("CompanyA", 20, 20, 100);
        employeeWage.MultipleCompany("CompanyB", 30, 22, 120);
    }
}