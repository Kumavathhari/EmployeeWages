package EmployeeWage;

public class EmployeeWage {
        public static void main(String[] args) {
            EmpWageBuilder empWageBuilder = new EmpWageBuilder();
            empWageBuilder.addCompanyEmpWage("CompanyA", 20, 20, 100);
            empWageBuilder.addCompanyEmpWage("CompanyB", 30, 22, 120);
            empWageBuilder.computeEmployeeWage();
        }
    }
