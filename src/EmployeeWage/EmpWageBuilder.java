package EmployeeWage;

public class EmpWageBuilder {
    private final String companyName;
    private final int empRatePerHour;
    private final int numWorkingDays;
    private final int maxHrsInMonth;
    private int totalEmpWage;

    public EmpWageBuilder(String companyName, int empRatePerHour, int numWorkingDays, int maxHrsInMonth) {
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.numWorkingDays = numWorkingDays;
        this.maxHrsInMonth = maxHrsInMonth;
        this.totalEmpWage = 0;
    }

    public void computeEmployeeWage() {
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays < numWorkingDays) {
            int empHrs = 0;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case EmployeeWage.IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case EmployeeWage.IS_PART_TIME:
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

    public int getTotalEmpWage() {
        return totalEmpWage;
    }
}

