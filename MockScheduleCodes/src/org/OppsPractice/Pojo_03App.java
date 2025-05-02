/*Q8. WAP to create POJO class name as Laptop with field id, name ,price and ram space,hard disk space etc 
 * and input the details of laptop and display it
*/
package org.OppsPractice;

import java.util.*;

class Laptop {
	private int id;
	private String name;
	private float price;
	private int ramSpace;
	private int hardDisk;
	public Laptop() {

	}

	public Laptop(int id, String name, float price, int ramSpace , int hardDisk) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.ramSpace = ramSpace;
		this.hardDisk = hardDisk;
	}

	public int getHardDisk() {
		return hardDisk;
	}

	public void setHardDisk(int hardDisk) {
		this.hardDisk = hardDisk;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getRamSpace() {
		return ramSpace;
	}

	public void setRamSpace(int ramSpace) {
		this.ramSpace = ramSpace;
	}
	
	public void displayLaptopDitails() {
		System.out.println(id + "\t "+ name + "\t" + price + "\t" + ramSpace + "\t" + hardDisk);
	}
}

public class Pojo_03App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("💖=================================💖");
        System.out.println("\tLaptop Details: \n");
        System.out.println("Enter the total number of laptops: ");
        int size = sc.nextInt();
        sc.nextLine(); 

        System.out.println("\n******************************************");
        
        Laptop[] laptops = new Laptop[size]; 

        for (int i = 0; i < size; i++) {
            System.out.println("\nEnter details for Laptop " + (i + 1) + ":");
            
            System.out.print("Laptop ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Laptop Name: ");
            String name = sc.nextLine();

            System.out.print("Laptop Price: ");
            float price = sc.nextFloat();

            System.out.print("Laptop RAM Space (GB): ");
            int ramSpace = sc.nextInt();
            
            System.out.print("Laptop Hard Disk Space (GB): ");
            int hardDiskSpace = sc.nextInt();
            
            laptops[i] = new Laptop(id, name, price, ramSpace, hardDiskSpace);
        }

   
        System.out.println("\n🥰================ Laptop List ================🥰");
        System.out.println("ID\tName\tPrice\tRAM\tHDD");
        for (Laptop laptop : laptops) {
            laptop.displayLaptopDitails();
        }
    }
}