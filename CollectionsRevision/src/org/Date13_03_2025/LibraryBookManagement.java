/*Question2: Library Book Management Using Stack
Description: Implement a Stack to keep track of books being borrowed and returned in the library.
 Each time a book is borrowed, it’s pushed onto the stack, and when returned, it’s popped off.
*/

package org.Date13_03_2025;
import java.util.*;
class Book{
	private Stack<String> stack;
	
	public Book(){
		stack = new Stack<>();
	}
	public void borrowBook(String bookName) {
		stack.push(bookName);
		System.out.println("Borrowed: "+bookName);
	}
	public void returnBook() {
		if(!stack.isEmpty()) {
			String book = stack.pop();
			System.out.println("Returned "+book);
		}
		else {
			System.out.println("No books to return!");
		}
		
	}
	public void viewBorrowedBook() {
		if(stack.isEmpty()) {
			  System.out.println("No books borrowed.");
		}
		
		
		else {
			for(int i = stack.size() - 1; i >= 0; i--) {
				System.out.println(stack.get(i));
			}
		}
	}
}
public class LibraryBookManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Book book = new Book();
		
		do {
			System.out.println("case 1: Enter Book Name: ");
			System.out.println("case 2: Return Book: ");
			System.out.println("case 3: View Borrowed Book: ");
			System.out.println("case 4: Exit ");
			
			System.out.println("Enter your Choice: ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				sc.nextLine();
				System.out.println("Enter Book Name: ");
				String name = sc.nextLine();
				book.borrowBook(name);
				break;
			case 2:
				book.returnBook();
				break;
			case 3:
				book.viewBorrowedBook();
				break;
			case 4:
				System.out.println("Exiting code....");
				System.exit(0);
				break;
				default: 
					System.out.println("Enter valid choice: ");
			}
		}while(true);
				
	}

}
