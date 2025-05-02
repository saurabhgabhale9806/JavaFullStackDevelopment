/*10. Group Elements by Their Length
Write a program that groups strings by their length using a Map<Integer, List<String>>. The key will be the length of the strings, and the value will be a list of strings that have that length.
Example:
Input: ["apple", "banana", "cat", "dog", "elephant"]
Output: {3=["cat", "dog"], 5=["apple"], 6=["banana"], 8=["elephant"]}
*/

package org.Date16_03_2025;
import java.util.*;
public class GroupByLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList();
		for(int i = 0 ; i < 5; i++) {
			list.add(sc.nextLine());
		}
		
		Map<Integer, List<String>> map = new HashMap<>();
				for(String word : list) {
					int length = word.length();
					map.computeIfAbsent(length, k -> new ArrayList<>()).add(word);
				}
				System.out.println(map);
	}

}
