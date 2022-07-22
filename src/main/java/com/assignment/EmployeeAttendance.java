package com.assignment;


import java.text.DecimalFormat;

/*
Class to return Employee Attendance
 */


class EmployeeAttendance extends DailyWage
{
    private int attendance;

    /*
    function to return Employee Attendance
     */
    int getAttendance()
    {
        DecimalFormat df = new DecimalFormat("#");
        attendance = Integer.parseInt(df.format(Math.floor(Math.random() * 1000 % 2)));
        if (attendance == 0 )
        {
            System.out.println("\n Employee is Absent");
        }
        else
        {
            System.out.println("\n Employee is Present");
            System.out.println(calculateWagesUsingCondition(attendance));
        }
        return attendance;
    }

    /*
        function to return Nature of Employee [PartTime[0] or FullTime[1]]
     */
    int employeeDetails()
    {
        DecimalFormat df = new DecimalFormat("#");
        int employee = Integer.parseInt(df.format(Math.floor(Math.random() * 1000 % 2)));
        if (employee == 0 )
        {
            employee = 0;
        }
        else
        {
            employee = 1;
        }
        return employee;
    }

}

