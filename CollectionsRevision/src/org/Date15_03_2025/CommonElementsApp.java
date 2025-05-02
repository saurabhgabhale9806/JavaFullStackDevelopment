/*Q4. Finding Common Elements Between Two Lists
 Description: Given two HashSet objects (representing skills of two employees), 
 find and print the skills that are common to both.
*/

package org.Date15_03_2025;
import java.util.*;

public class CommonElementsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Set <String> set = new HashSet<>();
		System.out.println("Add Skills of Employee A: ");
		for(int i = 0 ; i < 5; i++) {
			set.add(sc.nextLine());
		}
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		Set <String> set1 = new HashSet<>();
		System.out.println("Add Skills of Employee B: ");
		for(int i = 0 ; i < 5; i++) {
			set1.add(sc.nextLine());
		}
		it = set1.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		Set <String> set2 = new HashSet<>(set);
		System.out.println("Common Skills of Employees are: ");
		set2.retainAll(set1);
		System.out.println(set2);
	}
}
