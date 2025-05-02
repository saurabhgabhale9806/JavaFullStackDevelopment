/* Q3. WAP to create LinkedList and perform the following operation on it.
	Case 1: add Node at first 
	Case 2: add Node at last 
	Case 3: remove node from first 
	Case 4: remove node from last 
	Case 5: view all data from linked list
*/
package org.CollectionPractice;
import java.util.*;
public class LinkedListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List <String> list = new LinkedList();
		
		do {
			System.out.println("==============================================================");
			System.out.println(" 🥰--------------- LinkedList Application ------------------🥰");
			System.out.println("==============================================================");

			System.out.println("Case 1: add Node at first");
			System.out.println("Case 2: add Node at last ");
			System.out.println("Case 3: remove node from first ");
			System.out.println("Case 4: remove node from last ");
			System.out.println("Case 5: view all data from linked list ");
			System.out.println("case 6: Exit code...");
			System.out.println("==============================================================");

			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				//Case 1: add Node at first
				System.out.println("Enter data to add at first: ");
				String first = sc.nextLine();
				list.addFirst(first);
				System.out.println("Added at first: "+first);
				
				break;
				
			case 2:
				//Case 2: add Node at last
				System.out.println("Enter data to add at last: ");
				String last = sc.nextLine();
				list.addLast(last);
				System.out.println("Added at last: "+last);
				
				break;
				
			case 3:
				//Case 3: remove node from first 
				if(!list.isEmpty()) {
					String removedfirst = list.removeFirst();
					System.out.println("Removed from list: "+removedfirst);
				}else {
					System.out.println("Add some data in list");
				}
				
				break;
				
			case 4:
				//Case 4: remove node from last 
				if(!list.isEmpty()) {
					String removedLast = list.removeLast();
					System.out.println("Removed from list: "+removedLast);
				}else {
					System.out.println("Add some data in list");
				}
				
				break;
			case 5:
				//Case 5: view all data from linked list 
				if(!list.isEmpty()) {
					System.out.println(list);
				}else {
					System.out.println("List is empty");
				}
				break;
			case 6:
				//case 5: Exit code...
				System.out.println("Exiting......");
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid Choice...");
			}
		}while(true);
	}

}
