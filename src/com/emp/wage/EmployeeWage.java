package com.emp.wage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");

		Random random = new Random();

		int wagePerHour = 20;
		int fullDayHours = 8;
		int halfDayHours = 4;
		int salary = 0;
		int monthlySalary = 0;
		int workingDaysPerMonth = 20;

		for (int i = 1; i <= workingDaysPerMonth; i++) {

			int randomNum = random.nextInt(3);

			switch (randomNum) {
			case 0:
				System.out.println("Employee  is Absent");
				break;
			case 1:
				salary = wagePerHour * fullDayHours;
				break;
			case 2:
				salary = wagePerHour * halfDayHours;

			}

			monthlySalary = monthlySalary + salary;

			System.out.println("Salary is:" + salary);

		}

		System.out.println("Monthly Salary: " + monthlySalary);

	}

}
