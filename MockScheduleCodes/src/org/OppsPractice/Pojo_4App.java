/*Q9. WAP to create class name as Person with field id,name,age and address and input data and display it
*/
package org.OppsPractice;

import java.util.*;

class Person {
	private int id;
	private String name;
	private int age;
	private String address;

	public Person(){

	}

	public Person(int id, String name, int age, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public void displayPersonDetails() {
		System.out.println(id + "\t" + name + "\t" + age + "\t" + address);
	}

}

public class Pojo_4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

		  System.out.println("💖============================================💖");
	      System.out.println("Person Details: \n");
	      System.out.println("Enter the total number of People: ");
	      int size = sc.nextInt();
	      sc.nextLine(); 

	      System.out.println("\n*********************************************");
	      Person [] p = new Person[size];
	      
	      for(int i = 0 ; i < size ; i++) {
	    	  System.out.println("\nEnter details for Person " + (i + 1) + ":");
	    	  
	    	  System.out.println("Person ID: ");
	    	  int id = sc.nextInt();
	    	  
	    	  sc.nextLine();
	    	  
	    	  System.out.println("Person Name: ");
	    	  String name = sc.nextLine();
	    	  
	    	  System.out.println("Person age: ");
	    	  int age = sc.nextInt();
	    	  
	    	  sc.nextLine();
	    	  
	    	  System.out.println("Person Address: ");
	    	  String address = sc.nextLine();
	    	  System.out.println("\n******************************************");
	    	  
	    	  p[i] = new Person(id,name,age,address);
	      }
	      System.out.println("ID\tName\tAge\tAddress");
	      for(Person person : p) {
	    	  person.displayPersonDetails();
	      }
	}

}
