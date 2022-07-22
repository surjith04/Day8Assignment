package com.assignment;

class DailyWage
{
    /*
    funtion to Calculate the Wage of a Employee
     */
    int calculateWage(int fullDayWork , int wagePerHour)
    {
        int totalWage = 0 ;

            totalWage = fullDayWork * wagePerHour ;
            return totalWage;
    }

    /*
    Function to Calculate Monthly Wage
     */

    int monthlyWage(int fullDayWork, int  wagePerHour , int totalDays)
    {
        int monthSalary = 0 ;
        monthSalary = fullDayWork * wagePerHour * totalDays;
        return monthSalary;
    }


    /*
        Calculate Wages till a condition of total
        working hours or days is reached for a month
     */

    double calculateWagesUsingCondition(int attendance)
    {
        int days=0;
        double wagesTotal = 0;
        int hours=0;
        int ch = 0;
        while (true)
        {

            if(attendance == 1)
            {
                ch = 1;
            }
            else
            {
                System.out.println("Employee is Absent");
                break;
            }
            switch (ch)
            {
                case 1:
                    days++;
                    hours +=8;
                    break;
                case 2:
                    days++;
                    hours +=4;
                    break;
            }
            if(days > 20 || hours >= 100){
                break;
            }
            wagesTotal = days * 8 * 20;
        }
        return wagesTotal;
    }

}
