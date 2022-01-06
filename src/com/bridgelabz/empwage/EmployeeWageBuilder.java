package com.bridgelabz.empwage;

public class EmployeeWageBuilder {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static int MAX_WORKING_DAYS = 20;
	public static final int MAX_WORKING_HRS = 100;

	public static void main(String[] args) {
		System.out.println("Welcome to the Employee Wage Computation");
		empWage("Infosys", 21, 20, 100);
		empWage("Tesala", 22, 25, 70);
		empWage("Reliance", 27, 23, 64);
	}

	public static void empWage(String company, int empRatePerHr, int numWorkingDays, int maxHrs) {
		int empHrs = 0;
		int totalEmpHrs = 8;
		int totalWorkingDays = 0;
		while (totalEmpHrs <= MAX_WORKING_HRS && totalWorkingDays < MAX_WORKING_DAYS) {
			totalWorkingDays++;
			int empcheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empcheck) {
			case 1:
				System.out.println("Employee is Full time ");
				empHrs = 8;
				break;
			case 2:
				System.out.println("Employee is Part time ");
				empHrs = 4;
				break;
			default:
				System.out.println("Employee is Absent");
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
		}
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println(company + " company Total Daily Wage for days " + totalWorkingDays + " and hours "
				+ totalEmpHrs + " is: " + totalEmpWage);

		return;

	}
}
