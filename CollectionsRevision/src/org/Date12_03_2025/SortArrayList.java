package org.Date12_03_2025;

import java.util.*;

class Employee {
    private int id;
    private String name;
    private int sal;

    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSal() {
        return sal;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + sal + "}";
    }
}

public class SortArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Name: ");
            String name = sc.nextLine();
 
            System.out.print("Salary: ");
            int sal = sc.nextInt();

            list.add(new Employee(id, name, sal));
        }

        Collections.sort(list, Comparator.comparingInt(Employee::getSal));

        System.out.println("\nEmployees sorted by salary:");
        for (Employee e : list) {
            System.out.println(e);
        }

    }
}
