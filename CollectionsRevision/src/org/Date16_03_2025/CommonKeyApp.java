/*7. Find the Common Keys Between Two Maps
Write a program that finds the common keys between two Map objects and outputs them in a set.
Example:
Map<String, Integer> map1 = Map.of("a", 1, "b", 2, "c", 3);
Map<String, Integer> map2 = Map.of("b", 3, "c", 4, "d", 5);
Output: {"b", "c"}
*/
package org.Date16_03_2025;
import java.util.*;

public class CommonKeyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Map<String, Integer> map1 = Map.of("a", 1, "b", 2, "c", 3);
		Map<String, Integer> map2 = Map.of("b", 3, "c", 4, "d", 5);
		
		Set<String> set = new HashSet<>(map1.keySet());
		set.retainAll(map2.keySet());
		
		System.out.println(set);
	}

}
