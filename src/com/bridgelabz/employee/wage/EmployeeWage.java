package com.bridgelabz.employee.wage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");

		Random random = new Random();

		int wagePerHour = 20;
		int fullDayHours = 8;
		int partTimeHours = 4;
		int wagePerDay = 0;
		int monthlySalary = 0;

		for (int day = 1; day <= 20; day++) {
			int attendance = random.nextInt(3);
			wagePerDay = 0;
			switch (attendance) {
			case 0:
				System.out.println("Employee Absent.");
				break;
			case 1:
				wagePerDay = partTimeHours * wagePerHour;
				break;
			default:
				wagePerDay = fullDayHours * wagePerHour;

			}

			monthlySalary = monthlySalary + wagePerDay;

		}

	}

}
