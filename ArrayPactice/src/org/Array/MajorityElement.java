/*2) Find Majority Element in an Array
Write a Java program that checks if a given number appears more than n/2 times in an array, 
where n is the array size.
*/
package org.Array;

import java.util.*;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		System.out.println("Enter the Values in Array: ");
		int a[] = new int[size];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int half = a.length / 2;
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count > half) {
				System.out.print(a[i]);
			}

		}
	}

}
