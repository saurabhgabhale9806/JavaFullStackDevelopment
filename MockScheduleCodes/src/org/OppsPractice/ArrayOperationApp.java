/*Q14. Write a java program to create class name as ArrayOperation using contsructor overloading name as :

	ArrayOperation(int [ ])
	{
		//  Sort Array Ascending and Descending Order.
	}
	
	ArrayOperation(int a[ ] , int b[ ])
	{
		//  Merge Two Array and display it.
	}
	
*/

package org.OppsPractice;

import java.util.*;

class ArrayOperation {
	public ArrayOperation(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("\nArray After Sorting in Ascending Order: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("\nArray After Sorting in Descending Order: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}

	public ArrayOperation(int[] a, int[] b) {
		int c[] = new int[a.length + b.length];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			c[k] = a[i];
			k++;
		}
		for (int i = 0; i < b.length; i++) {
			c[k] = b[i];
			k++;
		}
		Arrays.sort(c);
		System.out.println("Array After Mergeing: ");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}

public class ArrayOperationApp {

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
		new ArrayOperation(a);
		System.out.println("\nEnter the Size of Array: ");
		int size1 = sc.nextInt();

		System.out.println("Enter the Values in Array: ");
		int b[] = new int[size1];

		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		new ArrayOperation(a, b);
	}

}
