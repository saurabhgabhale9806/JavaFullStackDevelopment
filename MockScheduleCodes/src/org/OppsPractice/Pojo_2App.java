/*Q7. WAP to create POJO class name as Book  with field id,name and price and author and 
 * input the book details and display it.
 */

package org.OppsPractice;

import java.util.*;

class Book {
	private int id;
	private String name;
	private int price;
	private String author;

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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}

public class Pojo_2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Book book1 = new Book();
		System.out.println("🥰=================================🥰============================🥰");
		System.out.println("Enter the Player Details: \n");
		
		System.out.println("Book ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Book Name: ");
		String name = sc.nextLine();
	
		System.out.println("Book Price: ");
		int price = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Book Author ");
		String author = sc.nextLine();
		
		book1.setId(id);
		book1.setName(name);
		book1.setPrice(price);
		book1.setAuthor(author);
		System.out.println("🥰=================================🥰============================🥰");
		
		System.out.println("\t\t\tID: "+book1.getId());
		System.out.println("\t\t\tName: "+book1.getName());
		System.out.println("\t\t\tPrice: "+book1.getPrice());
		System.out.println("\t\t\tAuthor: "+book1.getAuthor());
		System.out.println("🥰=================================🥰============================🥰");
	}

}
