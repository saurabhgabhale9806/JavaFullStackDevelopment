package org.Array;

import java.util.Scanner;

public class SecondSmallestMissingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();

		System.out.println("Enter the Values in Array: ");
		int a[] = new int[size];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		 int count = 0;
	        int secondMissing = -1;

	        for (int i = 0; i < a.length - 1; i++) {
	            for (int j = a[i] + 1; j < a[i + 1]; j++) {
	                count++;
	                if (count == 2) {
	                    secondMissing = j;
	                    break;
	                }
	            }
	            if (count == 2) break;
	        }

	        if (count == 2) {
	            System.out.println("The second smallest missing number is: " + secondMissing);
	        } else {
	            System.out.println("There are not enough missing numbers in the sequence.");
	        }
	
	}

}
