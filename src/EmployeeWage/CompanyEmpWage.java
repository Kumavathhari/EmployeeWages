package EmployeeWage;

public class CompanyEmpWage {
    public final String companyName;
    public final int empRatePerHour;
    public final int numWorkingDays;
    public final int maxHrsInMonth;
    public int totalEmpWage;

    public CompanyEmpWage(String companyName, int empRatePerHour, int numWorkingDays, int maxHrsInMonth) {
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.numWorkingDays = numWorkingDays;
        this.maxHrsInMonth = maxHrsInMonth;
        this.totalEmpWage = 0;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "Total Emp Wage for company: " + companyName + " is " + totalEmpWage;
    }
}
