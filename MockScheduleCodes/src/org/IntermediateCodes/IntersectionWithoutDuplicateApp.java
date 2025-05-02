package org.IntermediateCodes;

import java.util.*;

public class IntersectionWithoutDuplicateApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the size of Array: ");
		int size1 = sc.nextInt();

		System.out.println("Enter the Value in Array: ");
		int b[] = new int[size1];

		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}

		int i = 0, j = 0, k = 0;
		int len = 0;
		if (a.length < b.length) {
			len = a.length;
		} else {
			len = b.length;
		}
		int c[] = new int[len];

		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				i++;
			} else if (a[i] > b[j]) {
				j++;
			} 
			else {
				if (k == 0 || c[k - 1] != a[i]) {
					c[k++] = a[i];
				}
				i++;
				j++;
			}
		}
		int result[] = new int[k];
		for (int p = 0; p < k; p++) {
			result[p] = c[p];
		}
		for (int p = 0; p < result.length; p++) {
			System.out.print(result[p] + " ");
		}
	}

}
