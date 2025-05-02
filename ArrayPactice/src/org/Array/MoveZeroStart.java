package org.Array;

import java.util.*;

public class MoveZeroStart {

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
		int j =  a.length - 1; 
		for (int i = a.length-1 ; i >= 0 ; i--) {
				if(a[i] != 0) {
					a[j] = a[i];
					j--;
				}
			}
		for(int i = j ; i >= 0; i--) {
			a[i] = 0;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			
		}
	}

}
