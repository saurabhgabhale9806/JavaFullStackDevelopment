/*2. Count Words in a String
Write a program to count the occurrences of each word in a given string. Use a Map<String, Integer> to store the word and its count.
Example:
Input: "this is a test this is a test"
Output: {this=2, is=2, a=2, test=2}
*/
package org.Date16_03_2025;
import java.util.*;
public class CountWordsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Map <String,Integer> map = new HashMap<>();
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		String [] st = str.split("\\s+");
		for(String s : st) {
			map.put(s,map.getOrDefault(s, 0 )+ 1);
		}
		System.out.println(""+ map);
	}

}
