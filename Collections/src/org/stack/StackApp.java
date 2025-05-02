package org.stack;

import java.util.*;

class Book {
	private int id;
	private String name;
	private String pub;
	private int price;

	public Book() {

	}

	public Book(int id, String name, String pub, int price) {
		this.id = id;
		this.name = name;
		this.pub = pub;
		this.price = price;
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

	public String getPub() {
		return pub;
	}

	public void setPub(String pub) {
		this.pub = pub;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "\nID: " + id + "\t" + "Name: " + name + "\t" + "Publisher" + pub + "\t" + "Price: " + price + "\n";

	}
}

class BookStack {
	public Stack stack;

	public BookStack() {
		stack = new Stack();
	}

	public void addBook(Book book) {
		stack.push(book);
	}

	public void viewAllBooks() {
		for (Object obj : stack) {
			Book book = (Book) obj;
			System.out.print(book);
		}
	}

	public void checkTopMostBook() {
		if (stack.isEmpty()) {
			System.out.println("No Book Added");
		} else {
			System.out.println("Top Most Book is : " + stack.peek());
		}
	}

	public void deleteBook(int did) {
		stack.remove(did);
	}

	public boolean searchBook(int bid) {
		for (Object obj : stack) {
			Book book = (Book) obj;
			if (book.getId() == bid) {
				System.out.println("book found");
				return true;
			}
		}
		System.out.println("book not found");
		return false;
	}
	public int countBook() {
		return stack.size();
	}
}

public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BookStack b = new BookStack();

		do {
			System.out.println("Case 1: Add New Book in Stack ");
			System.out.println("Case 2: View All Books from Stack");
			System.out.println("Case 3: Check Top Most book ");
			System.out.println("Case 4: delete book using id from stack");
			System.out.println("Case 5: Search book present in stack or not ");
			System.out.println("Case 6: count the total numbers from stack");
			System.out.println("Exit code....");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				sc.nextLine();
				System.out.println("ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Name: ");
				String name = sc.nextLine();

				System.out.println("Publisher: ");
				String pub = sc.nextLine();

				System.out.println("Price: ");
				int price = sc.nextInt();

				Book book = new Book(id, name, pub, price);
				b.addBook(book);
				break;

			case 2:
				b.viewAllBooks();
				break;

			case 3:
				b.checkTopMostBook();
				break;

			case 4:
				System.out.println("Enter the Id to delete Book: ");
				int did = sc.nextInt();
				b.deleteBook(did);
				break;

			case 5:
				System.out.println("Enter id to search: ");
				int bid = sc.nextInt();

				b.searchBook(bid);
				break;

			case 6:
				System.out.println("Total number of book are: "+b.countBook());
				break;

			case 7:
				System.out.println("Exiting code...........❌");
				System.exit(0);
				break;
			}
		} while (true);
	}

}
