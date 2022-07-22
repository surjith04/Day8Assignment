package com.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
A EmpWageBuilder class implemented with CompanyFunctions interface to perform the basic operation of a company
 */
public class EmpWageBuilder implements CompanyFunctions
{
    DailyWage dailyWage = new DailyWage();
    Scanner scanner = new Scanner(System.in);
    Company company = new Company();
    List<Company> companyList = new ArrayList<>();
    @Override

    /*
    A function to add Company to CompanyList
     */
    public void addCompany()
    {
        System.out.println("Enter Company Name");
        String companyName = scanner.next();
        System.out.println("Enter Employee of the Company Hours of Works Per Day");
        int workingHours = scanner.nextInt();
        System.out.println("Enter Employee of the Company Wages Per Hour");
        int wagePerHour = scanner.nextInt();
        System.out.println("Enter Company Total Working Days for a Month");
        int totalDays = scanner.nextInt();
        int dayWage = dailyWage.calculateWage(workingHours,wagePerHour);
        int monthlyWage = dailyWage.monthlyWage(workingHours,wagePerHour,totalDays);
        Company company = new Company(companyName,workingHours,wagePerHour,totalDays,dayWage,monthlyWage);
        companyList.add(company);
        System.out.println("Company Added " + company);
    }
    @Override

    /*
    A function to Display all the  Company in the CompanyList
     */
    public void showAllCompany()
    {
        if(companyList.isEmpty())
        {
            System.out.println("No Data Found \n ");
        }
        for(Company company : companyList)
        {
            System.out.println(company);
        }
    }


    /*
    A function to show a particular Company in CompanyList
     */

    @Override
    public void showCompany(String companyName)
    {
        boolean flag = false;
        for (Company company : companyList)
        {
            if(company.getCompanyName().equals(companyName))
            {

                System.out.println("Company Found : " + company);
                flag = true;
                break;
            }
            }
        if(!flag)
        {
            System.out.println("Company Not Found");
        }
    }


    /*
    A function to delete particular Company in CompanyList
     */

    @Override
    public void deleteCompany(String companyName)
    {
        boolean flag = false;
        if(companyList.isEmpty())
        {
            System.out.println("\n CompanyList is Empty");
        }
        for (Company company : companyList)
        {
            if(company.getCompanyName().equals(companyName))
            {
                companyList.remove(company);
                System.out.println("Contact Deleted Successfully");
                flag = true;
                break;
            }
        }
        if(!flag)
        {
            System.out.println("Company Not Found");
        }
    }


    /*
    A function to get the totalWage of the Company in the  CompanyList
     */

    @Override
    public void getTotalWage(String companyName)
    {
        boolean flag = false;
        for (Company company : companyList)
        {
            if(company.getCompanyName().equals(companyName))
            {
                System.out.println("The total Wage of the Company " + companyName + " is " + company.getMonthlySalary() );
                flag = true;
                break;
            }
        }
        if(!flag)
        {
            System.out.println("Company Not Found");
        }
    }

    /*
    A function to get Employee Wages in the company
     */

    @Override
    public void employeeDetails(String companyName)
    {
        boolean flag = false;
        for (Company company : companyList)
        {
            if(company.getCompanyName().equals(companyName))
            {
                EmployeeAttendance employeeAttendance = new EmployeeAttendance();
                int attendance = employeeAttendance.getAttendance();
                if (attendance == 0)
                {
                    System.out.println("\n Employee is Absent");
                    System.out.println("\n Cannot Calculate Wages for that Employee");
                }
                else
                {
                    if(employeeAttendance.employeeDetails() == 1)
                    {
                        System.out.println("\n Full Time Employee");
                        System.out.println("\n The Daily Wage of the Employee is " + company.getDailyWage() );
                        System.out.println("\n The Monthly Wage of the Employee is " + company.getMonthlySalary() );
                    }
                    else
                    {
                        System.out.println("\n Part Time Employee");
                        System.out.println("\n The Daily Wage of the Employee is " + (company.getDailyWage()/2));
                    }


                }
                System.out.println("The total Wage of the Company " + companyName + " is " + company.getMonthlySalary() );
                flag = true;
                break;
            }
        }
        if(!flag)
        {
            System.out.println("\n Company Not Found");
        }
    }
}
