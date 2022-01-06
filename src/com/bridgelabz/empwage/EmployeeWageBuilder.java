package com.bridgelabz.empwage;

public class EmployeeWageBuilder {
	public static final int IS_FULL_TIME = 1;
	public static final int EMP_RATE_PER_HOUR = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to the Employee Wage Computation");
		empWage();
	}

	public static void empWage() {
		int empHrs = 0;
		int empwage = 0;
		double empcheck = Math.floor(Math.random() * 10) % 2;
		if (empcheck == IS_FULL_TIME) {
			System.out.println("Employee is Present");
			empHrs = 8;
		} else {
			System.out.println("Employee is Absent");
			empHrs = 0;
		}
		empwage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp wage " + empwage);
	}
}
