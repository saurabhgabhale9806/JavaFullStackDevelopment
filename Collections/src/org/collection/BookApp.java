package org.collection;

import java.util.*;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BookStack bookStack = new BookStack() ;
		do {
			System.out.println("Case 1: Add New Book in Stack ");
			System.out.println("Case 2: View All Books from Stack ");
			System.out.println("Case 3: Check Top Most book ");
			System.out.println("Case 4: delete book using id from stack");
			System.out.println("Case 5: Search book present in stack or not ");
			System.out.println("Case 6: count the total numbers from stack");
			System.out.println("case 7: Exit Code....");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Book ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Book Name: ");
				String name = sc.nextLine();
				
				System.out.println("Book publisher: ");
				String pub = sc.nextLine();
				
				System.out.println("Book price: ");
				int price = sc.nextInt();
				
				bookStack.addBook(new Book(id, name, pub,price));
				break;
				
			case 2:
				bookStack.viewBook();
				break;
			case 3:
				bookStack.checkBook();
				break;
			case 4:
				System.out.println("Enter the Id to delete: ");
				int Did = sc.nextInt() ;
				bookStack.deleteBook(Did);
				break;
			case 5:
				System.out.println("Enter the Id to Search: ");
				int Sid = sc.nextInt() ;
				bookStack.searchBook(Sid);
				break;
	
			case 6:
				System.out.println("Total Count of Book: "+ bookStack.countBooks());
				break;
			case 7:
				System.out.println("Exiting Code.....");
				System.exit(0);
				break;
			default:
				System.out.println("Enter Valid Choice: ");
			}

		} while (true);
	}

}
