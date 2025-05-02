/*Q1.WAP to create Vector class and store 5 values in it and display vector data using a following methods 

1.Show the vector data using Enumeration 
2.Show the vector data using Iterator 
3.Show the vector data using normal for loop
4.Show the vector data using foreach 
5.Show the vector data using ListIterator 
*/

package org.CollectionPractice;
import java.util.*;
public class VectorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<String> v = new Vector();
		
		System.out.println("Enter the Values in Vector: ");
	
		for(int i = 0; i < 5; i++) {
			v.add(sc.nextLine());
		}
		
		do {
			System.out.println("case 1: Show the vector data using Enumeration ");
			System.out.println("case 2: Show the vector data using Iterator");
			System.out.println("case 3: Show the vector data using normal for loop");
			System.out.println("case 4: Show the vector data using foreach");
			System.out.println("case 5: Show the vector data using ListIterator ");
			System.out.println("case 6: Exit code...");
			
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				//case 1: Show the vector data using Enumeration
				Enumeration <String> e= v.elements();
				while(e.hasMoreElements()) {
					System.out.println(e.nextElement());
				}
				
				break;
				
			case 2:
				//case 2: Show the vector data using Iterator
				Iterator <String> it = v.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
				break;
				
			case 3:
				//case 3: Show the vector data using normal for loop
				
				for(int i = 0 ; i < v.size(); i++ ) {
					System.out.println(v);
				}
				break;
				
			case 4:
				//case 4: Show the vector data using foreach 
				
				for(String v1 : v) {
					System.out.println(v1);
				}
				break;
				
			case 5:
				//case 5: Show the vector data using ListIterator 
				
				ListIterator lit = v.listIterator();
				while(lit.hasNext()) {
					System.out.println(lit.next());
				}
				
				break;
				
			case 6:
				System.out.println("Exiting....");
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid Choice...");
			}
		}while(true);
	}

}
