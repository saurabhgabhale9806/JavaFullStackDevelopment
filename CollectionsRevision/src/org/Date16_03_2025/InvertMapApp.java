/*9. Invert a Map
Write a program to invert a Map. This means swapping the keys with the values. If the values are not unique, decide on a policy for handling the duplication (for example, store multiple values in a List).
Example:
Input: {"a": 1, "b": 2, "c": 3}
Output: {1="a", 2="b", 3="c"}
*/
package org.Date16_03_2025;
import java.util.*;
public class InvertMapApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Map <String,Integer> map = new HashMap<>();	
		for(int i = 0; i < 5; i++ ) {
			System.out.println("Enter the Key:  ");
			String k = sc.nextLine();
			
			System.out.println("Enter the Value:  ");
			int v = sc.nextInt();
			sc.nextLine();
			map.put(k, v);
		}
		for(Map.Entry<String, Integer> m: map.entrySet()) {
			System.out.println(m.getValue() + "\t" + m.getKey());
		}
		System.out.println(map);
	}

}
