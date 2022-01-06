package com.bridgelabz.empwage;

public class EmployeeWageBuilder {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to the Employee Wage Computation");
		empWage();
	}

	public static void empWage() {
		int empHrs = 0;
		int empwage = 0;
		double empcheck = Math.floor(Math.random() * 10) % 3;
		if (empcheck == IS_FULL_TIME) {
			System.out.println("Employee is Full time ");
			empHrs = 8;
		} else if (empcheck == IS_PART_TIME) {
			System.out.println("Employee is Part time");
			empHrs = 4;
		} else {
			System.out.println("Employee is Absent");
			empHrs = 0;
		}
		empwage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp wage = " + empwage);
	}
}
