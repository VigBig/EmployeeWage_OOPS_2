package com.bridgelabz.employeewage;


import java.util.Scanner;



class CalculateEmployeeWage{

    Scanner sc = new Scanner(System.in);

    private String companyName;
    private int wagePerHour = 0;
    private int fullDayHour = 0;
    private int partDayHour = 0;
    private int totalWorkDay = 0;
    private int totalWorkHour = 0;

    private int dayCount = 1;
    private int hourCount = 0;
    private int totalWage = 0;
    private int dayPresent = 0;

    CalculateEmployeeWage(){
        System.out.println("Enter Company Name:");
        String companyName = sc.nextLine();
        this.companyName = companyName;

        System.out.println("Enter Wage per Hour:");
        int wagePerHour = sc.nextInt();
        this.wagePerHour = wagePerHour;

        System.out.println("Enter Hours spent on a Full Day's work:");
        int fullDayHour = sc.nextInt();
        this.fullDayHour = fullDayHour;

        System.out.println("Enter Hours spent on a Part Time's work:");
        int partDayHour = sc.nextInt();
        this.partDayHour = partDayHour;

        System.out.println("Enter Total No. of Working Days in a Month:");
        int totalWorkDay = sc.nextInt();
        this.totalWorkDay = totalWorkDay;

        System.out.println("Enter Total No. of Working Hours in a Month:");
        int totalWorkHour = sc.nextInt();
        this.totalWorkHour = totalWorkHour;
    }

    public void totalWage(){

        while (dayCount<=totalWorkDay  && hourCount<=totalWorkHour) {

            int dailyWage = 0;
            int attendance = (int) (Math.random() * 10) % 3;

            switch (attendance) {
                case 1:
                    System.out.println("Employee is present Full Time");
                    hourCount = hourCount + fullDayHour;
                    dailyWage = wagePerHour * fullDayHour;
                    dayPresent++;
                    break;
                case 2:
                    System.out.println("Employee is present Part Time");
                    hourCount = hourCount + partDayHour;
                    dailyWage = wagePerHour * partDayHour;
                    dayPresent++;
                    break;
                default:
                    System.out.println("Employee is absent");
            }

            System.out.println("Daily Wage on Day :" + dayCount + " is :" +dailyWage);
            totalWage = totalWage + dailyWage;
            dayCount++;
        }
        System.out.println("In one month of "+(dayCount-1)+" working days, employee worked for :\n"
                +dayPresent+ " days and \n"
                + hourCount + " hours and \n"+
                "earned total wages of "+ totalWage);

    }
}


public class EmployeeWage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CalculateEmployeeWage[] cew;

        System.out.println("Welcome to Employee Wage Computation Program");

        System.out.println("How may companies details would you like to add ?");
        int num = sc.nextInt();

        cew = new CalculateEmployeeWage[num];

        for(int i=0; i<num; i++){
            cew[i] = new CalculateEmployeeWage();
            cew[i].totalWage();
        }


//        CalculateEmployeeWage cew = new CalculateEmployeeWage();
//        cew.totalWage();
//        CalculateEmployeeWage[] cew = new CalculateEmployeeWage[1];


    }
}