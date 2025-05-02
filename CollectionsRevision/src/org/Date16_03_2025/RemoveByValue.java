/*8. Remove Entries with Specific Values in a Map
Write a program that removes entries from a map that have a specific value.
Example:
Input: Map<String, Integer> map = {"a": 1, "b": 2, "c": 1};
Output after removing value 1: {"b": 2}
*/

package org.Date16_03_2025;
import java.util.*;
public class RemoveByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Map <String,Integer> map = new HashMap<>();
		
		for(int i = 0 ; i < 3; i++) {
			System.out.println("Enter the Key of Map: ");
			String k = sc.nextLine();
			System.out.println("Enter the Value of Map: ");
			int v = sc.nextInt();
			sc.nextLine();
			map.put(k,v);
		}
		System.out.println("Enter the value to Search: ");
		int value = sc.nextInt();
		 map.entrySet().removeIf(entry -> entry.getValue()== value);
		System.out.println("After removal " + value + " "+map);
	}

}
