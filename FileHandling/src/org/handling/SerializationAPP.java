package org.handling;
import java.util.*;
import java.io.*;

class Employee implements Serializable {
  
    private int id;
    private String name;
    private int sal;

    // Getters and Setters
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
    public int getSal() {
        return sal;
    }
    public void setSal(int sal) {
        this.sal = sal;
    }
}

public class SerialiationApp {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Employee Salary: ");
        int sal = sc.nextInt();

     
        Employee emp = new Employee();
        emp.setId(id);
        emp.setName(name);
        emp.setSal(sal);

        try (FileOutputStream fo = new FileOutputStream("D:\\Saurabh JAVA Full  Stack Developer\\Core Java\\File Handling\\NewEmp.txt");
             ObjectOutputStream out = new ObjectOutputStream(fo)) {

            out.writeObject(emp);
            System.out.println("Employee object serialized successfully!");
        }
    }
}
