/*Q1. Basic ArrayList Operations & Create an ArrayList of integers,
case 1: add some elements
case 2: print the list
case 3: remove an element at a specific index.
*/

package org.revision;
import java.util.*;

public class ArrayListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List <Integer> list = new ArrayList<>();
		do {
			System.out.println("case 1: add some elements");
			System.out.println("case 2: print the list");
			System.out.println("case 3: remove an element at a specific index.");
			System.out.println("case 4: Exit code...");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Add some elements in list: ");
				for(int i = 0; i < 5; i++ ) {
					list.add(sc.nextInt());
				}
				break;
				
			case 2:
				System.out.println(list);
				break;
				
			case 3:
				System.out.println("Enter index to remove element: ");
				int index = sc.nextInt();
				if(list.contains(index)) {
					list.remove(index);
					System.out.println("Element removed successfully");
				}else {
					System.out.println("enter valid index");
				}
				break;
				
			case 4:
				System.out.println("Exiting code...");
				System.exit(0);
				break;
			}
		}while(true);
	}

}
