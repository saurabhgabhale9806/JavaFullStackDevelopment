/*Q 1. Write a java program to create arraylist and perform following operations using switch case and do while.

1. Add 10 Values In Arraylist.
2. Display All Values In Arraylist.
3. Add New Value In Arraylist.
4. Search Value In Arraylist.
5. Sort All Values In Ascending Order In Arraylist.
6. Sort All Values In Descending Order In Arraylist.
7. Find Max Value In Arraylist.
8. Find Min Value In Arraylist.
9. Update Value In Arraylist.
10. Delete Value In Arraylist.

*/

package org.collection;
import java.util.*;

public class VectorsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List <Integer> v =  new Vector();
		do {
			System.out.println("*********************************************************************");
			System.out.println("case 1. Add 10 Values In Arraylist.");
			System.out.println("case 2. Display All Values In Arraylist.");
			System.out.println("case 3. Add New Value In Arraylist.");
			System.out.println("case 4. Search Value In Arraylist.");
			System.out.println("case 5. Sort All Values In Ascending Order In Arraylist.");
			System.out.println("case 6. Sort All Values In Descending Order In Arraylist.");
			System.out.println("case 7. Find Max Value In Arraylist.");
			System.out.println("case 8. Find Min Value In Arraylist.");
			System.out.println("case 9. Update Value In Arraylist.");
			System.out.println("case 10. Delete Value In Arraylist.");
			System.out.println("cas2 11: Exit code....");
			System.out.println("*********************************************************************");
			
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Add Values in ArrayList: ");
				for(int i = 0 ; i < 10; i++) {
					v.add(sc.nextInt());
				}
				break;
			case 2:
				System.out.println("*********************************************************************");

				System.out.println("Display All Values: \n");
				System.out.print(v);
				System.out.println();
				break;
			case 3:
				System.out.println("Enter the number to add values in list ");
				int num = sc.nextInt();	
				for(int i = 0; i < num;i++ ) {
					v.add(sc.nextInt());
				}
				break;
			case 4:
				System.out.println("Enter the Value to search Value : ");
				int s = sc.nextInt();
				boolean b = v.contains(s);
				if(b) {
					System.out.println("Value Found");
				}else {
					System.out.println("Value Not Found");
				}
				break;
			case 5:
				System.out.println("Sort By Ascending Order");
				Collections.sort(v);
				System.out.println(v);
				break;
			case 6:
				System.out.println("Sort By Descending Order");
				Collections.sort(v,Collections.reverseOrder());
				System.out.println(v);
				break;
			case 7:
				System.out.println("The Max Value is : ");
				int max = Collections.max(v);
				System.out.print(max);
				System.out.println();
				break;
			case 8:
				System.out.println("The min Value is : ");
				int min = Collections.min(v);
				System.out.print(min);
				System.out.println();
				break;
			case 9:
				System.out.println("Enter the index to update Value: ");
				int index = sc.nextInt();
				System.out.println("Enter the  value to update  list: ");
				int value = sc.nextInt();
				v.set(index, value );
				System.out.println(v);
				break;
			case 10:
				System.out.println("Enter the Value to delete  Value");
				int vl = sc.nextInt();
				v.remove(Integer.valueOf(vl));
				System.out.println(v);
				break;
			case 11:
				System.exit(0);
				System.out.println("Exiting code.............");
				break;
				
				default:
					System.out.println("Invalid Choice ....");
			}
		}while(true);
	}

}
