/*Q5. Converting Map to List and Sorting
 Description: Convert a HashMap (employee name as key and salary as value) into a List of 
 entries and sort them by salary in descending order.
*/
package org.Date15_03_2025;

import java.util.*;

class Employee {
	private String name;
	private int salary;

	public Employee() {

	}

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String toString() {
		return "Name: " + name + "\t" + "Salary: "+salary;
	}
}

public class ConvertMaptoListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Map<String, Integer>  map = new HashMap<String, Integer>();
		for(int i = 0 ; i < 5; i++) {
			System.out.println("Enter The Employee  name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter Employee Salary: ");
			int salary = sc.nextInt();
			 sc.nextLine();
			map.put(name, salary);
		}
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));	
		
		System.out.println("After sorting : ");
		for(Map.Entry<String ,Integer>m : list) {
			System.out.println("Name: " +m.getKey()+" \t "+ "Salary: "+m.getValue());
		}
		sc.close();
	}

}
