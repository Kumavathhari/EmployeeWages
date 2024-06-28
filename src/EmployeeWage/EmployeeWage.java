package EmployeeWage;

public class EmployeeWage {
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;

        public static void main(String[] args) {
            EmpWageBuilder companyA = new EmpWageBuilder("CompanyA", 20, 20, 100);
            companyA.computeEmployeeWage();
            System.out.println("Total Wage for " + companyA.getTotalEmpWage());

            EmpWageBuilder companyB = new EmpWageBuilder("CompanyB", 30, 22, 120);
            companyB.computeEmployeeWage();
            System.out.println("Total Wage for " + companyB.getTotalEmpWage());
        }
}