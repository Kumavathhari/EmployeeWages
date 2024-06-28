package EmployeeWage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

    public class EmpWageBuilder implements EmpWageBuilderInterface {
        private ArrayList<CompanyEmpWage> companyEmpWageList;
        private Map<String, CompanyEmpWage> companyToEmpWageMap;

        public EmpWageBuilder() {
            companyEmpWageList = new ArrayList<>();
            companyToEmpWageMap = new HashMap<>();
        }

        @Override
        public void addCompanyEmpWage(String companyName, int empRatePerHour, int numWorkingDays, int maxHrsInMonth) {
            CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, empRatePerHour, numWorkingDays, maxHrsInMonth);
            companyEmpWageList.add(companyEmpWage);
            companyToEmpWageMap.put(companyName, companyEmpWage);
        }

        @Override
        public void computeEmployeeWage() {
            for (CompanyEmpWage companyEmpWage : companyEmpWageList) {
                companyEmpWage.setTotalEmpWage(this.computeEmployeeWage(companyEmpWage));
                System.out.println(companyEmpWage);
            }
        }

        private int computeEmployeeWage(CompanyEmpWage companyEmpWage) {
            int totalEmpHrs = 0;
            int totalWorkingDays = 0;

            while (totalEmpHrs <= companyEmpWage.maxHrsInMonth && totalWorkingDays < companyEmpWage.numWorkingDays) {
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

                int empWage = empHrs * companyEmpWage.empRatePerHour;
                companyEmpWage.addDailyWage(empWage); // Store daily wage
                companyEmpWage.totalEmpWage += empWage;

                System.out.println("Company: " + companyEmpWage.companyName + " | Day: " + totalWorkingDays + " | Emp Hours: " + empHrs + " | Emp Wage: " + empWage);
            }

            return companyEmpWage.totalEmpWage;
        }

        @Override
        public int getTotalEmpWage(String companyName) {
            CompanyEmpWage companyEmpWage = companyToEmpWageMap.get(companyName);
            return companyEmpWage != null ? companyEmpWage.totalEmpWage : 0;
        }

    }
