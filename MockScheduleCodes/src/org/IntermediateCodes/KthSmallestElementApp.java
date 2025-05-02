package org.IntermediateCodes;
import java.util.*;
public class KthSmallestElementApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();
		
		System.out.println("Enter the Values in Array: ");
		int a[] = new int [size];
		for(int i = 0 ; i < a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the Kth element: ");
		int k = sc.nextInt();
		for(int i = 0 ; i < a.length; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		int count = 1;
		int n = 0; 	
		for(int  i = 0 ; i < a.length - 1; i++) {
			if(a[i] != a[i + 1] && count <= k) {
				n = a[i];
				count++;
			}
			System.out.println(count);
		}
		System.out.println(n);
	}

}
