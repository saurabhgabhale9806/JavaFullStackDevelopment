//Example: WAP to perform following operation on Vector class
//_____________________________________________________________
//Case 1: Add New Element in Vector 
//Case 2: View All elements of Vector
//Case 3: Search element of Vector using contains() method 
//Case 4: Search element of Vector using indexOf() method?
//Case 5:  Fetch data of Vector between two specified indexes.
//Case 6: count the total number of element from vector 
//Case 7: check vector is empty or not 
//

package org.collection;

import java.util.*;

public class VectorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector v = new Vector();
		do {
			System.out.println("Case 1: Add New Element in Vector ");
			System.out.println("Case 2: View All elements of Vector");
			System.out.println("Case 3: Search element of Vector using contains() method");
			System.out.println("Case 4: Search element of Vector using indexOf() method?");
			System.out.println("Case 5: Fetch data of Vector between two specified indexes.");
			System.out.println("Case 6: count the total number of element from vector ");
			System.out.println("Case 7: check vector is empty or not ");
			System.out.println("Case 8: Exit Code........");
			
			System.out.println("Enter your Choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Values in Vector: ");
				int value = sc.nextInt();
				boolean b =v.add(value);
				if(b) {
					System.out.println("Value Added Successfully");					
				}
				else {
					System.out.println("Some problem there....");	
				}
				break;
			case 2:
				System.out.println("Values in Vector are: ");
				Iterator i = v.iterator();
				while(i.hasNext()) {
					Object obj = i.next();
					System.out.println(obj);
				}
				break;
			case 3:
				System.out.println("Enter the Value to search");
				value = sc.nextInt();
				b = v.contains(value);
				if(b) {
					System.out.println("Value Found");
				}
				else {
					System.out.println("Value not found");
				}
				break;
			case 4:
				System.out.println("Enter the value to Search ");
				value = sc.nextInt();
				int index = v.indexOf(value);
				if(index!=-1) {
					System.out.println("Data available");
				}
				else {
					System.out.println("Data not available");
				}
				break;
			case 5:
					System.out.println("Enter the Start index and end index: ");
					int startindex = sc.nextInt();
					int endindex = sc.nextInt();
					if(startindex >= 0 && endindex <= v.size()) {
						List list = v.subList(startindex,endindex);
						Iterator itr = list.iterator();
						while(itr.hasNext()) {
							Object obj = itr.next();
							System.out.println(obj);
						}
					}else {
						System.out.println("cannot find sublist");
					}
				break;
			case 6:
				int count = v.size();
				System.out.println(count);
				break;
			case 7:
				boolean flag = v.isEmpty();
				if(flag) {
					System.out.println("Vector is empty");
				}else {
					System.out.println("Vector is not empty");
				}
				
				break;
			case 8:
				System.exit(0);
				break;

			default:
				System.out.println("Enter Valid Choice: ");
			}
		} while (true);
	}

}