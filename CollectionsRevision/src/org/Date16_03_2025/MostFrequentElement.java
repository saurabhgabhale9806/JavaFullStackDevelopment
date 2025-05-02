/*5. Find the Most Frequent Element in an Array
Write a program to find the most frequent element in an array. Use a Map to store the frequency of each element, 
and then determine the element with the highest frequency.
Example:
Input: [4, 5, 2, 3, 4, 5, 4]
Output: 4
*/
package org.Date16_03_2025;
import java.util.*;
public class MostFrequentElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();
		
		System.out.println("Enter values in Array: ");
		int a[] = new int[size];
		
		for(int i = 0 ; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		Map <Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for(int num : a) {
			map.put(num,map.getOrDefault(num, 0)+1);
		}
		int mostFrequent =a[0];
		int count = 0;
		
		for(Map.Entry<Integer, Integer> m : map.entrySet()) {
			if(m.getValue() > count) {
				count = m.getValue();
				mostFrequent = m.getKey();
			}
		}
		System.out.println(mostFrequent);
	}

}
