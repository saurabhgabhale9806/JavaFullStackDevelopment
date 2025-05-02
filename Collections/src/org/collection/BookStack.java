package org.collection;
import java.util.*;
public class BookStack {
	private Stack stack;
	public BookStack() {
		stack = new Stack();
	}
	
	//case1: Add
	public void addBook(Book book) {
		stack.push(book);
		System.out.println("Book added "+book);
	}
	
	//case2: View
	public void viewBook() {
			if(stack.isEmpty()) {
				System.out.println("No books in stack");
			}
			else {
				System.out.println("Books in Stack: ");
				for(Object obj: stack) {
					Book book = (Book)obj;
					System.out.println("Book Added"+book);
				}
			}
	}
	
	//case3: Check Top Most Book
	public void checkBook() {
		if(stack.isEmpty()) {
			System.out.println("No books in stack");
		}
		else {
			System.out.println("Top Book: "+stack.peek());
		}
	}
	
	//case4: Delete Book
	public void deleteBook(int id) {
		Stack tempStack = new Stack();
		boolean found = false;
		
		while(!stack.isEmpty()) {
			Book book =  (Book)stack.pop();
			if(book.getId() == id) {
				found = true;
				System.out.println("Deleted book: "+book);
				break;
			}
			else {
				tempStack.push(book);
			}
		}
		while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

        if (!found) {
            System.out.println("Book with ID " + id + " not found.");
        }
	}
	
	//case5: Search Book
	public boolean searchBook(int id) {
		  for (Object  obj : stack) {
			  Book book = (Book)obj;
	            if (book.getId() == id) {
	                System.out.println("Book found: " + book);
	                return true;
	            }
	        }
	        System.out.println("Book with ID " + id + " not found.");
	        return false;
	    }
	
	//case6:  count the total numbers from stack
	public int  countBooks() {
		return stack.size();
	}
}
