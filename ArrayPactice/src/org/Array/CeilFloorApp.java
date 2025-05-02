/*4) Find Floor and Ceil of a Given Number in a Sorted Array

Write a Java program to find the floor and ceil of a given number in a sorted array using binary search.
*/
package org.Array;
import java.util.*;

public class CeilFloorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		System.out.println("Enter the Values in Array: ");
		int a[] = new int[size];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
	}

}
