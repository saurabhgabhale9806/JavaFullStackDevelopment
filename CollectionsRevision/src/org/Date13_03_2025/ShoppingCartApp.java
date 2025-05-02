/*Question4:  Unique Items Shopping Cart Using Set
  Description: Use a HashSet to manage a shopping cart where no duplicate items are allowed. 
  Add items, remove an item, and check if a specific item is already in the cart.
*/

package org.Date13_03_2025;

import java.util.*;

public class ShoppingCartApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Set<String> set = new HashSet<>();

		do {
			System.out.println("\nShopping Cart Menu:");
			System.out.println("case 1: Add items");
			System.out.println("case 2: View items");
			System.out.println("case 3: Remove an item");
			System.out.println("case 4: Check if a specific item is already in the cart");
			System.out.println("case 5: Exit...");
			System.out.println("Enter the choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				sc.nextLine();
				System.out.println("Enter items to add: ");
				for (int i = 0; i < 5; i++) {
					set.add(sc.nextLine());
				}

				break;
			case 2:
				Iterator i = set.iterator();
				while (i.hasNext()) {
					Object obj = i.next();
					System.out.println(obj);
				}
				System.out.println(set);
			case 3:
				sc.nextLine();
				if (set.isEmpty()) {
					System.out.println("Add some item in cart");
				} else {
					System.out.println("Enter item to remove");
					String item = sc.nextLine();
					set.remove(item);
				}
				break;
			case 4:
				sc.nextLine();
				if (set.isEmpty()) {
					System.out.println("Add some item in cart");
				} else {
					System.out.println("Enter item to check");
					String item = sc.nextLine();
					if (set.contains(item)) {
						System.out.println("Item already present in cart");
					} else {
						System.out.println("Item not present in cart");
					}
				}
				break;
			case 5:
				System.out.println("Exit code...");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Enter Valid Choice: ");
			}
		} while (true);

	}

}
