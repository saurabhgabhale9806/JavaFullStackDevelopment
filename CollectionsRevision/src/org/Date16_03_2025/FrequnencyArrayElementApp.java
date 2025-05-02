/*1. Find the Frequency of Elements in an Array
Write a program to find the frequency of each element in a given array of integers. 
Use a Map<Integer, Integer> to store the frequency of each element.
Example:
Input: [1, 2, 2, 3, 3, 3, 4, 4, 4, 4]
Output: {1=1, 2=2, 3=3, 4=4}
*/
package org.Date16_03_2025;
import java.util.*;
public class FrequnencyArrayElementApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Map<Integer , Integer> map = new HashMap<>();
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		
		System.out.println("Enter the Values in Array: ");
		int a[] = new int[size];
		for(int i = 0 ; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int num : a) { 
			map.put(num,map.getOrDefault(num, 0 )+ 1);
		}
		System.out.println(""+map);
		
	}

}
