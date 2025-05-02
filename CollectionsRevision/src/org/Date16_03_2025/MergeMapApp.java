/*4. Merge Two Maps
Write a program that merges two Map objects. If the same key exists in both maps, sum their values.
Example:
Map<String, Integer> map1 = Map.of("a", 1, "b", 2);
Map<String, Integer> map2 = Map.of("b", 3, "c", 4);
Output: {"a": 1, "b": 5, "c": 4}
*/

package org.Date16_03_2025;
import java.util.*;
public class MergeMapApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Map <String , Integer> map = new HashMap<String , Integer>();
		for(int i = 0 ; i < 2; i++) {
			String k = sc.nextLine();
			int v = sc.nextInt();
			sc.nextLine();
			map.put(k, v); 
		}
		
		Map <String , Integer> map1 = new HashMap<String , Integer>();
		for(int i = 0 ; i < 2; i++) {
			String k = sc.nextLine();
			int v = sc.nextInt();
			sc.nextLine();
			map1.put(k, v); 
		}
		Map <String , Integer > merge = new HashMap<>(map);
		for(Map.Entry<String , Integer> m : map1.entrySet()) {
			merge.merge(m.getKey(),m.getValue() , Integer::sum);
		}
		System.out.println(merge);
	}

}
