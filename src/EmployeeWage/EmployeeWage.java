package EmployeeWage;

public class EmployeeWage {
            public static final int IS_PART_TIME = 1;
            public static final int IS_FULL_TIME = 2;

            public static void main(String[] args) {
                EmpWageBuilder empWageBuilder = new EmpWageBuilder();

                empWageBuilder.addCompanyEmpWage("CompanyA", 20, 20, 100);
                empWageBuilder.addCompanyEmpWage("CompanyB", 30, 22, 120);

                empWageBuilder.computeEmployeeWage();
            }
        }
