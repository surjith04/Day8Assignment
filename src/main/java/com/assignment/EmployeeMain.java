package com.assignment;

import java.util.Scanner;

public class EmployeeMain
{
    /*
    Main Class which helps us to WORK on all the functions
     */
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------USE CASE-------------------");
        EmployeeAttendance employeeAttendance = new EmployeeAttendance();
        employeeAttendance.getAttendance();
        System.out.println("--------------------------------------------");
        EmpWageBuilder companyDetails = new EmpWageBuilder();
        while (true) {
            System.out.println("Enter 1 to Add a Company");
            System.out.println("Enter 2 to Show All Company");
            System.out.println("Enter 3 to Show Specific Company");
            System.out.println("Enter 4 to Show Total Wage of a  Company");
            System.out.println("Enter 5 to Delete a Company");
            System.out.println("Enter 6 to Get a Employee Wage");
            System.out.println("Enter 7 to Exit");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    companyDetails.addCompany();
                    break;
                case 2:
                    companyDetails.showAllCompany();
                    break;
                case 3:
                    System.out.println("\n Enter Company Name");
                    String companyName = sc.next();
                    companyDetails.showCompany(companyName);
                    break;
                case 4:
                    System.out.println("\n Enter Company Name");
                    companyName = sc.next();
                    companyDetails.getTotalWage(companyName);
                    break;
                case 5:
                    System.out.println("\n Enter Company Name");
                    companyName = sc.next();
                    companyDetails.deleteCompany(companyName);
                    break;
                case 6:
                    System.out.println("\n Enter Company Name");
                    companyName = sc.next();
                    companyDetails.employeeDetails(companyName);
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        }
    }
}
