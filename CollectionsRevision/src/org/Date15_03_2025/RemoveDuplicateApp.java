/* Q2. Remove Duplicate Names Using Set
 Description: Given a list of names that may contain duplicates, use a HashSet to remove duplicate names and 
 print the cleaned-up list.
*/
package org.Date15_03_2025;

import java.util.*;

public class RemoveDuplicateApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of names:");
		int n = sc.nextInt();
		sc.nextLine();
		List<String> list = new ArrayList<>();
		System.out.println("Enter the names:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextLine().trim());
		}

		Set<String> set = new HashSet<>(list);

		System.out.println("Names:");
		for (String name : set) {
			System.out.println(name);
		}

	}

}
