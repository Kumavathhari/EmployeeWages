package EmployeeWage;

public interface EmpWageBuilderInterface {
    void addCompanyEmpWage(String companyName, int empRatePerHour, int numWorkingDays, int maxHrsInMonth);

    void computeEmployeeWage();

    int getTotalEmpWage(String companyName);
}
