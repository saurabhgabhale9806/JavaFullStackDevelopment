package org.Array;
import java.util.*;

public class NthHighestNumber {

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
		
		System.out.println("Enter the Nth term: ");
		int n =  sc .nextInt();
		
		for(int i = 0 ; i < a.length; i++) {
			for(int j = i + 1;j < a.length; j++) {
				if(a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		int count = 1;
		int k = a[0];
		for(int i = 1 ; i < a.length  ; i++) {
			if(a[i] != a[i - 1]  ) {
				count++;
				if(count == n) {
					k = a[i];
					break;
				}
			}
		}
		if(count >= n) {
			System.out.println(k);
		}
	}

}
