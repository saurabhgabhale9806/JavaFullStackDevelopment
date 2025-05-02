package org.CollectionPractice;
import java.util.*;

public class ArrayListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		do {
			System.out.println("==============================================================");
			System.out.println(" 🥰--------------- ArrayList Application ------------------🥰");
			System.out.println("==============================================================");

			System.out.println("Case 1: add new data in ArrayList");
			System.out.println("Case 2: view all data from ArrayList");
			System.out.println("Case 3: Search Data using contains method ");
			System.out.println("Case 4: Search data using indexOf() method ");
			System.out.println("Case 5: delete data using index ");
			System.out.println("Case 6: count total number of element from ArrayList");
			System.out.println("Case 7: check ArrayList  is empty or not ");
			System.out.println("case 8: Exit code...");
			System.out.println("==============================================================");

			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				//Case 1: add new data in ArrayList
				System.out.println("Enter Elements in ArrayList: ");
				for(int i = 0 ; i < 5 ; i++) {
					list.add(sc.nextInt());
				}
				break;
				
			case 2:
				//Case 2: view all data from ArrayList
				System.out.println(list);
				break;
				
			case 3:
				//Case 3: Search Data using contains method
				System.out.println("Enter Element to Search: ");
				int v = sc.nextInt();
				boolean b = list.contains(v);
				if(b) {
					System.out.println("Value Found "+ v);
				}else {
					System.out.println("Value not Found "+v);
				}
						
				break;
				
			case 4:
				//Case 4: Search data using indexOf() method
				System.out.println("Enter Element to Search: ");
				v = sc.nextInt();
				int index = list.indexOf(v);
				if(index != -1) {
					System.out.println("Value Available");
				}else {
					System.out.println("Value not Available");
				}
				break;
				
			case 5:
				//Case 5: delete data using index 
				System.out.println("Enter the index to Delet data: ");
				index = sc.nextInt();
				list.remove(index);
				System.out.println(list);
				
				break;
				
			case 6:
				//Case 6: count total number of element from ArrayList
				int countLen = list.size();
				System.out.println(countLen);
				break;
				
			case 7:
				//Case 7: check ArrayList  is empty or not
					if(list.isEmpty()) {
						System.out.println("Array List is empty");
					}else {
						System.out.println("Array List is not empty");
					}
				break;
				
			case 8:
				System.out.println("Exiting......");
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid Choice...");
			}
		}while(true);
	}

}
