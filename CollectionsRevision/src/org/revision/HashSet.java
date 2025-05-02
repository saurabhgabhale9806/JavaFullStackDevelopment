/*Q4.  Set Operations: Create a HashSet to store unique elements
 case 1: add elements to the set
 case 2: checking if an element exists
 case 3: finding the size of the set.
*/

package org.revision;
import java.util.*;
public class HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Set set = new java.util.HashSet();
		do {
			System.out.println("case 1: add elements to the set");
			System.out.println("case 2: checking if an element exists");
			System.out.println("case 3: finding the size of the set.");
			System.out.println("case 4: Exit code..");
			
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				for(int i = 0; i < 5; i++) {
					set.add(sc.nextInt());
				}
				System.out.println(set);
				break;
			case 2:
				System.out.println("Enter the value to check");
				int val = sc.nextInt();
				if(set.isEmpty()) {
					System.out.println("Add values in set");
				}
				else {
					if(set.contains(val)) {
						System.out.println("Element Exists in set");
					}
					else {
						System.out.println("Element does not Exists  set");
					}
				}
				break;
			case 3:
				if(set.isEmpty()) {
					System.out.println("Add values in set");
				}
				else {
					System.out.println("Size of set is: "+set.size());
				}
				break;
			case 4:
				System.out.println("Exiting code....");
				System.exit(0);
				break;
				default:
					System.out.println("Enter Valid choice: ");
			}
		}while(true);
	}

}
