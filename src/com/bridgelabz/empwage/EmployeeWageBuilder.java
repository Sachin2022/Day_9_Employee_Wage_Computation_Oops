package com.bridgelabz.empwage;

public class EmployeeWageBuilder {
	public static final int IS_FULL_TIME = 1;

	public static void main(String[] args) {
		System.out.println("Welcome to the Employee Wage Computation");
		empWage();
	}

	public static void empWage() {
		double empcheck = Math.floor(Math.random() * 10) % 2;
		if (empcheck == IS_FULL_TIME) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
	}
}
