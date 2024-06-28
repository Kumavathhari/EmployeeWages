package EmployeeWage;

import java.util.ArrayList;
import java.util.List;

public class EmpWageBuilder {
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;

        private final List<CompanyEmpWage> companyEmpWageList;

        public EmpWageBuilder() {
            companyEmpWageList = new ArrayList<>();
        }

        public void addCompanyEmpWage(String companyName, int empRatePerHour, int numWorkingDays, int maxHrsInMonth) {
            CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, empRatePerHour, numWorkingDays, maxHrsInMonth);
            companyEmpWageList.add(companyEmpWage);
        }

        public void computeEmployeeWage() {
            for (CompanyEmpWage companyEmpWage : companyEmpWageList) {
                int totalEmpWage = computeEmployeeWageForCompany(companyEmpWage);
                companyEmpWage.setTotalEmpWage(totalEmpWage);
                System.out.println(companyEmpWage);
            }
        }

        private int computeEmployeeWageForCompany(CompanyEmpWage companyEmpWage) {
            int totalEmpHrs = 0;
            int totalWorkingDays = 0;

            while (totalEmpHrs <= companyEmpWage.maxHrsInMonth && totalWorkingDays < companyEmpWage.numWorkingDays) {
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

                int empWage = empHrs * companyEmpWage.empRatePerHour;
                companyEmpWage.totalEmpWage += empWage;

                System.out.println("Company: " + companyEmpWage.companyName + " | Day: " + totalWorkingDays + " | Emp Hours: " + empHrs + " | Emp Wage: " + empWage);
            }

            return companyEmpWage.totalEmpWage;
        }
    }