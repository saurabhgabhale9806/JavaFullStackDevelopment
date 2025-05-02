package org.Array;

import java.util.*;

public class MoveZeroAtEnd {

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

		// Moving Zero to Start
		for (int i = 0; i < a.length ; i++) {
			for(int j = i + 1; j < a.length ; j++) {
				if(a[i] == 0) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			
		}
	}

}
