package org.CollectionPractice;

import java.util.*;

class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee() {

	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return "ID: " + id + "\t" + "Name: " + name + "\t" + "Salary: " + salary;
	}
}

public class EmployeeArrayListApp {

	private static boolean flag;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		ArrayList<Employee> list = new ArrayList<>();

		System.out.println("Enter Employee Details: ");
		for (int i = 0; i < 2; i++) {
			System.out.println("Emp Id: ");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.println("Emp name: ");
			String name = sc.nextLine();

			System.out.println("Emp Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
		}

		do {
			System.out.println("==============================================================");
			System.out.println(" 🥰--------------- LinkedList Application ------------------🥰");
			System.out.println("==============================================================");

			System.out.println("Case 1: View All Employee Data");
			System.out.println("Case 2: Search Employee by using its id.");
			System.out.println("Case 3: Delete Employee by using its id.");
			System.out.println("Case 4: update employee name by using its id. ");
			System.out.println("Case 5: find the same name employee  ");
			System.out.println("Case 6: Exit code...");
			System.out.println("==============================================================");

			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				// Case 1: View All Employee Data
				System.out.println("ID\tName\tSalary");
				for (Employee e : list) {
					System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSalary());
				}
				break;

			case 2:
				// Case 2: Search Employee by using its id.
				System.out.println("Enter the id to Search: ");
				int id = sc.nextInt();

				boolean flag = false;

				for (Employee e : list) {
					if (e.getId() == id) {
						System.out.println(e);
						flag = true;
						break;
					}
				}
				if (!flag) {
					System.out.println("Id does not Available");
				}
				break;

			case 3:
				// Case 3: Delete Employee by using its id.
				System.out.println("Enter the id to delete: ");
				int deleteId = sc.nextInt();
				flag = false;

				Iterator<Employee> iterator = list.iterator();
				while (iterator.hasNext()) {
					Employee e = iterator.next();
					if (e.getId() == deleteId) {
						iterator.remove();
						flag = true;
						System.out.println("Employee deleted successfully.");
						break;
					}
				}

				if (!flag) {
					System.out.println("ID not found.");
				}
				break;

			case 4:
				// Case 4: update employee name by using its id.
				System.out.println("Enter the id to update: ");
				int updateId = sc.nextInt();
				sc.nextLine();
				flag = false;

				for (Employee e : list) {
					if (e.getId() == updateId) {
						System.out.println("Enter new name: ");
						String newName = sc.nextLine();
						e.setName(newName);
						flag = true;
						System.out.println("Employee name updated.");
						break;
					}
				}

				if (!flag) {
					System.out.println("ID not found.");
				}
				break;
			case 5:
				// Case 5: find the same name employee
				System.out.println("Enter the name to search: ");
			    String searchName = sc.nextLine();
			    flag = false;

			    for(Employee e : list) {
			        if(e.getName().equalsIgnoreCase(searchName)) {
			            System.out.println(e);
			            flag = true;
			        }
			    }

			    if (!flag) {
			        System.out.println("No employee found with the given name.");
			    }
				break;
			case 6:
				// case 5: Exit code...
				System.out.println("Exiting......");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Choice...");
			}
		} while (true);
	}

}
