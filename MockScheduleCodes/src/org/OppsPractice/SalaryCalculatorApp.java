package org.OppsPractice;

import java.util.*;

class Employee {
	private int id;
	private String name;
	private int totalWorking;
	private double salary;
	private int overtime;

	public Employee(int id, String name, int totalWorking, double salary) {
		this.id = id;
		this.name = name;
		this.totalWorking = totalWorking;
		this.salary = salary;
		this.overtime = 0;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getTotalWorking() {
		return totalWorking;
	}

	public double getSalary() {
		return salary;
	}

	public int getOvertime() {
		return overtime;
	}

	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}

	public void displayDetails() {
		System.out.printf("%-5d %-10s %-15d %-10.2f %-10d%n", id, name, totalWorking, salary, overtime);
	}
}

class Overtime {
	private Employee[] emp;

	void setEmployee(Employee[] emp) {
		this.emp = emp;
	}

	void calculateOvertime() {
		final int STANDARD_HOURS = 40;
		final int OVERTIME_RATE = 50;

		System.out.println("\nID   Name       Total Working  Salary     Overtime   OT Pay    Total Salary");
		for (Employee e : emp) {
			int overtimeHours = 0;
			if (e.getTotalWorking() > STANDARD_HOURS) {
				overtimeHours = e.getTotalWorking() - STANDARD_HOURS;
			}

			e.setOvertime(overtimeHours);
			double overtimePay = overtimeHours * OVERTIME_RATE;
			double totalSalary = e.getSalary() + overtimePay;

			System.out.printf("%-5d %-10s %-15d %-10.2f %-10d %-8.2f %-10.2f%n", e.getId(), e.getName(),
					e.getTotalWorking(), e.getSalary(), e.getOvertime(), overtimePay, totalSalary);
		}
	}

}

public class SalaryCalculatorApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total number of employees: ");
		int size = sc.nextInt();
		Employee[] emp = new Employee[size];

		for (int i = 0; i < size; i++) {
			System.out.println("\nEnter details for Employee " + (i + 1));
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Total Working Hours: ");
			int totalWorking = sc.nextInt();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			emp[i] = new Employee(id, name, totalWorking, salary);
		}

		System.out.println("\nInitial Employee Details:");
		System.out.printf("%-5s %-10s %-15s %-10s %-10s%n", "ID", "Name", "Total Working", "Salary", "Overtime");
		for (Employee e : emp) {
			e.displayDetails();
		}

		Overtime ot = new Overtime();
		ot.setEmployee(emp);
		ot.calculateOvertime();

	}
}
