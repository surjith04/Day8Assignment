package com.assignment;

import java.util.Scanner;


/*
A company class acts as a Model
 */
public class Company
{
    private String companyName;
    private int fullDayWork;
    private int workingDays;
    private int wagePerHour;
    private int dailyWage;
    private int monthlySalary;

    Company()
    {}

    /*
    An All Args Constructor used to set the values
     */
    Company(String companyName, int fullDayWork, int workingDays, int wagePerHour,int dailyWage, int monthlySalary)
    {
        this.companyName = companyName;
        this.fullDayWork = fullDayWork;
        this.workingDays = workingDays;
        this.wagePerHour = wagePerHour;
        this.dailyWage = dailyWage;
        this.monthlySalary=monthlySalary;
    }



    public String getCompanyName() {
        return companyName;
    }

    public int getDailyWage() {
        return dailyWage;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getFullDayWork() {
        return fullDayWork;
    }

    public int getWorkingDays() {
        return workingDays;
    }


    public int getWagePerHour() {
        return wagePerHour;
    }

    /*
    to String method to return object in string format
     */

    @Override
    public String toString() {
        return "Company -> {" +
                "companyName='" + companyName + '\'' +
                ", fullDayWork=" + fullDayWork +
                ", workingDays=" + workingDays +
                ", wagePerHour=" + wagePerHour +
                ", dailyWage=" + dailyWage +
                ", monthlySalary=" + monthlySalary +
                '}';
    }


}
