/*Q2. LinkedList Implementation
Create a LinkedList of strings, 
 case 1: add some element
 case 2: print the list
 case 3: remove elements from the front and rear.
*/
package org.revision;
import java.util.*;
public class LinkedListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		List <String> list = new LinkedList<>();
		do {
			System.out.println("case 1: add some elements");
			System.out.println("case 2: print the list");
			System.out.println("case 3: remove an element at a specific index.");
			System.out.println("case 4: Exit code...");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1: 
				System.out.println("Add elements in String: ");
				for(int i = 0; i < 5; i++) {
					list.add(sc.nextLine());
				}
				break;
			case 2:
				System.out.println(list);
				break;
			case 3:
				if(!list.isEmpty()) {
					list.removeFirst();
				}
				if(!list.isEmpty()) {
					list.removeLast();
				}
				System.out.println("After removing front and rear : "+list);
				break;
			case 4:
				System.out.println("Exiting code......");
				System.exit(0);
				break;
				
				default:
					System.out.println("Enter the Valid choice");
			}
		}while(true);
	}

}
