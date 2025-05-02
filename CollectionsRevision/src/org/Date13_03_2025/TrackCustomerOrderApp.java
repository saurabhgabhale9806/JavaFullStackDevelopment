/*Question5:  Track Customer Orders Using HashMap
 Description: Create a HashMap to store customer names (keys) and their list of ordered items (values).
  Add, remove, and modify orders, and display all orders for a specific customer.
*/
package org.Date13_03_2025;
import java.util.*;
public class TrackCustomerOrderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Map<String , List<String>> map = new HashMap<>();
		do {
			System.out.println("case 1: Add Order ");
			System.out.println("case 2: Remove Order: ");
			System.out.println("case 3: Modify Orders");
			System.out.println("case 4: View Customer Order");
			System.out.println("case 5: Dislay all Orders");
			System.out.println("case 6: Exit..");
			System.out.println("Enter your Choice: ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Customer Name: ");
				String name = sc.nextLine();
				
				System.out.println("Enter Order List: ");
				String [] items = sc.nextLine().split(" , ");
				
				map.put(name,new ArrayList<>(Arrays.asList(items)));
				System.out.println("Order added : "+name);
				
				break; 
				
			case 2:
				System.out.println("Enter customer name to remove: ");
				name = sc.nextLine();
				
				if(map.remove(name) != null) {
					System.out.println("Order Removed : "+name);
				}
				else {
					System.out.println("Customer not Found ");
				}
				break;
				
			case 3:
				System.out.println("Enter customer name to remove: ");
				name = sc.nextLine();
				
				if(map.containsKey(name)) {
					System.out.println("Enter new ordered item: ");
					items = sc.nextLine().split(" , ");
					map.put(name,new ArrayList(Arrays.asList(items)));
					System.out.println(""+map);
				}
				else {
					System.out.println("Customer not found");
				}
				break;
			case 4:
				System.out.println("Enter customer name to remove: ");
				name = sc.nextLine();
			
				if(map.containsKey(name)) {
					System.out.println(map.get(name));
				}else {
					System.out.println("Customer not Found");
				}
				break;
			case 5:
				 if (map.isEmpty()) {
                     System.out.println("No orders available.");
                 } else {
                     System.out.println("All Customer Orders:");
                     for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                         System.out.println(entry.getKey() + " --> " + entry.getValue());
                     }
                 }
                 break;
			case 6:
				System.out.println("Exit code");
				System.exit(0);
				break;
			}
		}while(true);
		
	}

}
